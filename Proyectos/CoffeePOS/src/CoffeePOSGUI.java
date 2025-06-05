// ========== INTERFAZ GRÁFICA CON SWING ==========

/**
 * Interfaz gráfica principal del sistema CoffeePOS
 */
import gestores.*;
import java.awt.*;
import java.awt.Menu;
import javax.swing.*;
import modelos.*;

class CoffeePOSGUI extends JFrame {

    private GestorProductos gestorProductos;
    private GestorClientes gestorClientes;
    private GestorEmpleados gestorEmpleados;
    private GestorOrdenes gestorOrdenes;
    private Menu menu;

    private JTabbedPane tabbedPane;
    private DefaultListModel<String> modeloProductos;
    private DefaultListModel<String> modeloClientes;
    private DefaultListModel<String> modeloEmpleados;
    private DefaultListModel<String> modeloOrdenes;

    public CoffeePOSGUI() {
        initializeSystem();
        initializeGUI();
        setVisible(true);
    }

    private void initializeSystem() {
        gestorProductos = new GestorProductos();
        gestorClientes = new GestorClientes();
        gestorEmpleados = new GestorEmpleados();
        gestorOrdenes = new GestorOrdenes();
        menu = new Menu();

        // Datos de prueba
        initializeSampleData();
    }

    private void initializeSampleData() {
        // Productos
        Bebida espresso = new Bebida("Espresso", 3.50, "Pequeño", true);
        Bebida latte = new Bebida("Latte", 4.50, "Mediano", true);
        Alimento croissant = new Alimento("Croissant", 2.50, "Panadería", false);

        gestorProductos.agregar(espresso);
        gestorProductos.agregar(latte);
        gestorProductos.agregar(croissant);

        // Empleados
        Barista barista1 = new Barista("Manuel Alejandro Cruz Lares", 2500.0, "Café Artesanal");
        Mesero mesero1 = new Mesero("Carlos Alberto Serrano Leyva", 2200.0, 5);
        Barista barista2 = new Barista("Joshua Osorio", 2600.0, "Las Exoticas");

        gestorEmpleados.agregar(barista1);
        gestorEmpleados.agregar(mesero1);
        gestorEmpleados.agregar(barista2);

        // Clientes
        Cliente cliente1 = new Cliente("Itzel Barriba Cazares", "ibarriba@uabc.edu.mx");
        Cliente cliente2 = new Cliente("Ghala Nathaleah Graham Pompa", "ghala.graham@uabc.edu.mx");
        Cliente cliente3 = new Cliente("Adriana Hernandez Fernandez", "fernandez1290052@uabc.edu.mx");

        gestorClientes.agregar(cliente1);
        gestorClientes.agregar(cliente2);
        gestorClientes.agregar(cliente3);
    }

    private void initializeGUI() {
        setTitle("CoffeePOS - Sistema de Punto de Venta");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Crear el panel con pestañas
        tabbedPane = new JTabbedPane();

        // Agregar pestañas
        tabbedPane.addTab("Productos", createProductosPanel());
        tabbedPane.addTab("Clientes", createClientesPanel());
        tabbedPane.addTab("Empleados", createEmpleadosPanel());
        tabbedPane.addTab("Órdenes", createOrdenesPanel());
        tabbedPane.addTab("Menú", createMenuPanel());

        add(tabbedPane, BorderLayout.CENTER);

        // Panel de estado
        JPanel statusPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        statusPanel.add(new JLabel("CoffeePOS v1.0 - Sistema activo"));
        add(statusPanel, BorderLayout.SOUTH);
    }

    private JPanel createProductosPanel() {
        JPanel panel = new JPanel(new BorderLayout());

        // Lista de productos
        modeloProductos = new DefaultListModel<>();
        JList<String> listaProductos = new JList<>(modeloProductos);
        JScrollPane scrollProductos = new JScrollPane(listaProductos);

        // Panel de botones
        JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 5, 5));
        JButton btnAgregar = new JButton("Agregar");
        JButton btnEditar = new JButton("Editar");
        JButton btnEliminar = new JButton("Eliminar");
        JButton btnRefrescar = new JButton("Refrescar");

        buttonPanel.add(btnAgregar);
        buttonPanel.add(btnEditar);
        buttonPanel.add(btnEliminar);
        buttonPanel.add(btnRefrescar);

        // Eventos
        btnAgregar.addActionListener(e -> mostrarDialogoAgregarProducto());
        btnRefrescar.addActionListener(e -> actualizarListaProductos());
        btnEliminar.addActionListener(e -> eliminarProductoSeleccionado(listaProductos));

        panel.add(scrollProductos, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        // Cargar datos iniciales
        actualizarListaProductos();

        return panel;
    }

    private JPanel createClientesPanel() {
        JPanel panel = new JPanel(new BorderLayout());

        modeloClientes = new DefaultListModel<>();
        JList<String> listaClientes = new JList<>(modeloClientes);
        JScrollPane scrollClientes = new JScrollPane(listaClientes);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 5, 5));
        JButton btnAgregar = new JButton("Agregar");
        JButton btnEditar = new JButton("Editar");
        JButton btnEliminar = new JButton("Eliminar");
        JButton btnRefrescar = new JButton("Refrescar");

        buttonPanel.add(btnAgregar);
        buttonPanel.add(btnEditar);
        buttonPanel.add(btnEliminar);
        buttonPanel.add(btnRefrescar);

        btnAgregar.addActionListener(e -> mostrarDialogoAgregarCliente());
        btnRefrescar.addActionListener(e -> actualizarListaClientes());

        panel.add(scrollClientes, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        actualizarListaClientes();

        return panel;
    }

    private JPanel createEmpleadosPanel() {
        JPanel panel = new JPanel(new BorderLayout());

        modeloEmpleados = new DefaultListModel<>();
        JList<String> listaEmpleados = new JList<>(modeloEmpleados);
        JScrollPane scrollEmpleados = new JScrollPane(listaEmpleados);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 5, 5));
        JButton btnAgregar = new JButton("Agregar");
        JButton btnEditar = new JButton("Editar");
        JButton btnEliminar = new JButton("Eliminar");
        JButton btnRefrescar = new JButton("Refrescar");

        buttonPanel.add(btnAgregar);
        buttonPanel.add(btnEditar);
        buttonPanel.add(btnEliminar);
        buttonPanel.add(btnRefrescar);

        btnAgregar.addActionListener(e -> mostrarDialogoAgregarEmpleado());
        btnRefrescar.addActionListener(e -> actualizarListaEmpleados());

        panel.add(scrollEmpleados, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        actualizarListaEmpleados();

        return panel;
    }

    private JPanel createOrdenesPanel() {
        JPanel panel = new JPanel(new BorderLayout());

        modeloOrdenes = new DefaultListModel<>();
        JList<String> listaOrdenes = new JList<>(modeloOrdenes);
        JScrollPane scrollOrdenes = new JScrollPane(listaOrdenes);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 5, 5));
        JButton btnNuevaOrden = new JButton("Nueva Orden");
        JButton btnVerDetalles = new JButton("Ver Detalles");
        JButton btnRefrescar = new JButton("Refrescar");

        buttonPanel.add(btnNuevaOrden);
        buttonPanel.add(btnVerDetalles);
        buttonPanel.add(btnRefrescar);

        btnNuevaOrden.addActionListener(e -> mostrarDialogoNuevaOrden());
        btnRefrescar.addActionListener(e -> actualizarListaOrdenes());
        btnVerDetalles.addActionListener(e -> mostrarDetallesOrden(listaOrdenes));

        panel.add(scrollOrdenes, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        actualizarListaOrdenes();

        return panel;
    }

    private JPanel createMenuPanel() {
        JPanel panel = new JPanel(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));

        StringBuilder menuText = new StringBuilder();
        menuText.append("=== MENÚ DEL CAFÉ ===\n\n");

        for (Producto producto : gestorProductos.getProductos()) {
            menuText.append(producto.toString()).append("\n");
        }

        textArea.setText(menuText.toString());

        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        return panel;
    }

    // Métodos para actualizar listas
    private void actualizarListaProductos() {
        modeloProductos.clear();
        for (Producto p : gestorProductos.getProductos()) {
            modeloProductos.addElement(p.toString());
        }
    }

    private void actualizarListaClientes() {
        modeloClientes.clear();
        for (Cliente c : gestorClientes.getClientes()) {
            modeloClientes.addElement(c.toString());
        }
    }

    private void actualizarListaEmpleados() {
        modeloEmpleados.clear();
        for (Empleado e : gestorEmpleados.getEmpleados()) {
            modeloEmpleados.addElement(e.toString());
        }
    }

    private void actualizarListaOrdenes() {
        modeloOrdenes.clear();
        for (Orden o : gestorOrdenes.getOrdenes()) {
            modeloOrdenes.addElement("Orden #" + o.getId() + " - " + o.getCliente().getNombre()
                    + " - $" + String.format("%.2f", o.calcularTotal()));
        }
    }

    // Diálogos
    private void mostrarDialogoAgregarProducto() {
        JDialog dialog = new JDialog(this, "Agregar Producto", true);
        dialog.setSize(400, 300);
        dialog.setLocationRelativeTo(this);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // Campos
        JTextField txtNombre = new JTextField(20);
        JTextField txtPrecio = new JTextField(20);
        JComboBox<String> cmbTipo = new JComboBox<>(new String[]{"Bebida", "Alimento"});

        // Layout
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(new JLabel("Nombre:"), gbc);
        gbc.gridx = 1;
        panel.add(txtNombre, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Precio:"), gbc);
        gbc.gridx = 1;
        panel.add(txtPrecio, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Tipo:"), gbc);
        gbc.gridx = 1;
        panel.add(cmbTipo, gbc);

        // Botones
        JPanel buttonPanel = new JPanel();
        JButton btnGuardar = new JButton("Guardar");
        JButton btnCancelar = new JButton("Cancelar");

        btnGuardar.addActionListener(e -> {
            try {
                String nombre = txtNombre.getText().trim();
                double precio = Double.parseDouble(txtPrecio.getText().trim());

                if (nombre.isEmpty()) {
                    JOptionPane.showMessageDialog(dialog, "El nombre es obligatorio");
                    return;
                }

                Producto producto;
                if (cmbTipo.getSelectedItem().equals("Bebida")) {
                    producto = new Bebida(nombre, precio, "Mediano", true);
                } else {
                    producto = new Alimento(nombre, precio, "General", false);
                }

                gestorProductos.agregar(producto);
                actualizarListaProductos();
                dialog.dispose();

                JOptionPane.showMessageDialog(this, "Producto agregado exitosamente");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(dialog, "Precio inválido");
            }
        });

        btnCancelar.addActionListener(e -> dialog.dispose());

        buttonPanel.add(btnGuardar);
        buttonPanel.add(btnCancelar);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panel.add(buttonPanel, gbc);

        dialog.add(panel);
        dialog.setVisible(true);
    }

    private void mostrarDialogoAgregarCliente() {
        JDialog dialog = new JDialog(this, "Agregar Cliente", true);
        dialog.setSize(350, 200);
        dialog.setLocationRelativeTo(this);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JTextField txtNombre = new JTextField(20);
        JTextField txtContacto = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(new JLabel("Nombre:"), gbc);
        gbc.gridx = 1;
        panel.add(txtNombre, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Contacto:"), gbc);
        gbc.gridx = 1;
        panel.add(txtContacto, gbc);

        JPanel buttonPanel = new JPanel();
        JButton btnGuardar = new JButton("Guardar");
        JButton btnCancelar = new JButton("Cancelar");

        btnGuardar.addActionListener(e -> {
            String nombre = txtNombre.getText().trim();
            String contacto = txtContacto.getText().trim();

            if (nombre.isEmpty() || contacto.isEmpty()) {
                JOptionPane.showMessageDialog(dialog, "Todos los campos son obligatorios");
                return;
            }

            Cliente cliente = new Cliente(nombre, contacto);
            gestorClientes.agregar(cliente);
            actualizarListaClientes();
            dialog.dispose();

            JOptionPane.showMessageDialog(this, "Cliente agregado exitosamente");
        });

        btnCancelar.addActionListener(e -> dialog.dispose());

        buttonPanel.add(btnGuardar);
        buttonPanel.add(btnCancelar);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        panel.add(buttonPanel, gbc);

        dialog.add(panel);
        dialog.setVisible(true);
    }

    private void mostrarDialogoAgregarEmpleado() {
        JDialog dialog = new JDialog(this, "Agregar Empleado", true);
        dialog.setSize(400, 300);
        dialog.setLocationRelativeTo(this);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JTextField txtNombre = new JTextField(20);
        JTextField txtSalario = new JTextField(20);
        JComboBox<String> cmbTipo = new JComboBox<>(new String[]{"Barista", "Mesero"});
        JTextField txtEspecialidad = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(new JLabel("Nombre:"), gbc);
        gbc.gridx = 1;
        panel.add(txtNombre, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Salario:"), gbc);
        gbc.gridx = 1;
        panel.add(txtSalario, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Tipo:"), gbc);
        gbc.gridx = 1;
        panel.add(cmbTipo, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Especialidad/Mesas:"), gbc);
        gbc.gridx = 1;
        panel.add(txtEspecialidad, gbc);

        JPanel buttonPanel = new JPanel();
        JButton btnGuardar = new JButton("Guardar");
        JButton btnCancelar = new JButton("Cancelar");

        btnGuardar.addActionListener(e -> {
            try {
                String nombre = txtNombre.getText().trim();
                double salario = Double.parseDouble(txtSalario.getText().trim());
                String especialidad = txtEspecialidad.getText().trim();

                if (nombre.isEmpty()) {
                    JOptionPane.showMessageDialog(dialog, "El nombre es obligatorio");
                    return;
                }

                Empleado empleado;
                if (cmbTipo.getSelectedItem().equals("Barista")) {
                    empleado = new Barista(nombre, salario, especialidad.isEmpty() ? "General" : especialidad);
                } else {
                    int mesas = especialidad.isEmpty() ? 5 : Integer.parseInt(especialidad);
                    empleado = new Mesero(nombre, salario, mesas);
                }

                gestorEmpleados.agregar(empleado);
                actualizarListaEmpleados();
                dialog.dispose();

                JOptionPane.showMessageDialog(this, "Empleado agregado exitosamente");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(dialog, "Datos numéricos inválidos");
            }
        });

        btnCancelar.addActionListener(e -> dialog.dispose());

        buttonPanel.add(btnGuardar);
        buttonPanel.add(btnCancelar);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        panel.add(buttonPanel, gbc);

        dialog.add(panel);
        dialog.setVisible(true);
    }

    //Falta de terminar
    private void mostrarDialogoNuevaOrden() {
        if (gestorClientes.getClientes().isEmpty() || gestorEmpleados.getEmpleados().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Necesita al menos un cliente y un empleado registrados");
            return;
        }
        JDialog dialog = new JDialog(this, "Nueva Orden", true);
        dialog.setSize(500, 400);
        dialog.setLocationRelativeTo(this);
        JPanel panel = new JPanel(new BorderLayout());
        // Panel superior para cliente y empleado
        JPanel topPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        JComboBox<Cliente> cmbClientes = new JComboBox<>();
        for (Cliente c : gestorClientes.getClientes()) {
            cmbClientes.addItem(c);
        }
        JComboBox<Empleado> cmbEmpleados = new JComboBox<>();
        for (Empleado e : gestorEmpleados.getEmpleados()) {
            cmbEmpleados.addItem(e);
        }
        topPanel.add(new JLabel("Cliente:"));
        topPanel.add(cmbClientes);
        topPanel.add(new JLabel("Empleado:"));
        topPanel.add(cmbEmpleados);
        // Panel central para productos
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBorder(BorderFactory.createTitledBorder("Productos"));
        DefaultListModel<String> modeloProductosOrden = new DefaultListModel<>();
        JList<String> listaProductosOrden = new JList<>(modeloProductosOrden);
        JPanel productPanel = new JPanel(new BorderLayout());
        JComboBox<Producto> cmbProductos = new JComboBox<>();
        for (Producto p : gestorProductos.getProductos()) {
            if (p.estaDisponible()) {
                cmbProductos.addItem(p);
            }
        }
    }
    // terminado;
    // private void mostrarDialogoNuevaOrden() {
    //     if (gestorClientes.getClientes().isEmpty() || gestorEmpleados.getEmpleados().isEmpty()) {
    //         JOptionPane.showMessageDialog(this, "Necesita al menos un cliente y un empleado registrados");
    //         return;
    //     }

    //     JDialog dialog = new JDialog(this, "Nueva Orden", true);
    //     dialog.setSize(500, 400);
    //     dialog.setLocationRelativeTo(this);
    //     JPanel panel = new JPanel(new BorderLayout(5, 5));
    //     panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    //     // Panel superior para cliente y empleado
    //     JPanel topPanel = new JPanel(new GridLayout(2, 2, 5, 5));
    //     JComboBox<Cliente> cmbClientes = new JComboBox<>();
    //     for (Cliente c : gestorClientes.getClientes()) {
    //         cmbClientes.addItem(c);
    //     }
    //     JComboBox<Empleado> cmbEmpleados = new JComboBox<>();
    //     for (Empleado e : gestorEmpleados.getEmpleados()) {
    //         cmbEmpleados.addItem(e);
    //     }
    //     topPanel.add(new JLabel("Cliente:"));
    //     topPanel.add(cmbClientes);
    //     topPanel.add(new JLabel("Empleado:"));
    //     topPanel.add(cmbEmpleados);
    //     // Panel central para productos
    //     JPanel centerPanel = new JPanel(new BorderLayout());
    //     centerPanel.setBorder(BorderFactory.createTitledBorder("Productos"));
    //     DefaultListModel<Producto> modeloProductosOrden = new DefaultListModel<>();
    //     JList<Producto> listaProductosOrden = new JList<>(modeloProductosOrden);
    //     JScrollPane scrollLista = new JScrollPane(listaProductosOrden);
    //     centerPanel.add(scrollLista, BorderLayout.CENTER);
    //     JPanel productPanel = new JPanel(new BorderLayout());
    //     JComboBox<Producto> cmbProductos = new JComboBox<>();
    //     for (Producto p : gestorProductos.getProductos()) {
    //         if (p.estaDisponible()) {
    //             cmbProductos.addItem(p);
    //         }
    //     }
    //     JButton btnAgregarProducto = new JButton("Agregar Producto");
    //     btnAgregarProducto.addActionListener(e -> {
    //         Producto productoSeleccionado = (Producto) cmbProductos.getSelectedItem();
    //         if (productoSeleccionado != null) {
    //             modeloProductosOrden.addElement(productoSeleccionado);
    //         }
    //     });
    //     JButton btnRemoverProducto = new JButton("Remover Seleccionado");
    //     btnRemoverProducto.addActionListener(e -> {
    //         int selectedIndex = listaProductosOrden.getSelectedIndex();
    //         if (selectedIndex != -1) {
    //             modeloProductosOrden.remove(selectedIndex);
    //         }
    //     });
    //     JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 5, 5));
    //     buttonPanel.add(btnAgregarProducto);
    //     buttonPanel.add(btnRemoverProducto);
    //     productPanel.add(cmbProductos, BorderLayout.CENTER);
    //     productPanel.add(buttonPanel, BorderLayout.SOUTH);
    //     centerPanel.add(productPanel, BorderLayout.SOUTH);
    //     // Panel inferior para botones de acción
    //     JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    //     JButton btnAceptar = new JButton("Aceptar");
    //     JButton btnCancelar = new JButton("Cancelar");
    //     btnAceptar.addActionListener(e -> {
    //         // Crear la nueva orden con los datos seleccionados
    //         Cliente cliente = (Cliente) cmbClientes.getSelectedItem();
    //         Empleado empleado = (Empleado) cmbEmpleados.getSelectedItem();
    //         List<Producto> productos = Collections.list(modeloProductosOrden.elements());
    //         // Aquí deberías llamar a tu método para crear la orden
    //         // gestorOrdenes.crearOrden(cliente, empleado, productos);
    //         // GestorOrdenes.crearOrden(cliente, empleado);
    //         dialog.dispose();
    //     });
    //     btnCancelar.addActionListener(e -> dialog.dispose());
    //     bottomPanel.add(btnAceptar);
    //     bottomPanel.add(btnCancelar);
    //     // Ensamblar el diálogo
    //     panel.add(topPanel, BorderLayout.NORTH);
    //     panel.add(centerPanel, BorderLayout.CENTER);
    //     panel.add(bottomPanel, BorderLayout.SOUTH);
    //     dialog.setContentPane(panel);
    //     dialog.setVisible(true);
    // }
    //-----------------------------------------------------
    //nuevos metodos implementados
    private void eliminarProductoSeleccionado(JList<String> listaProductos) {
        int selectedIndex = listaProductos.getSelectedIndex();
        if (selectedIndex != -1) {
            // Implementar lógica para eliminar producto
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un producto para eliminar");
        }
    }

    private void mostrarDetallesOrden(JList<String> listaOrdenes) {
        int selectedIndex = listaOrdenes.getSelectedIndex();
        if (selectedIndex != -1) {
            // Implementar lógica para mostrar detalles
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una orden para ver detalles");
        }
    }
}
