// ========== CLASE PRINCIPAL ==========

import java.util.*;
import javax.swing.SwingUtilities;

/**
 * Clase principal del sistema CoffeePOS
 */
public class CoffeePOS {

    private GestorProductos gestorProductos;
    private GestorClientes gestorClientes;
    private GestorEmpleados gestorEmpleados;
    private GestorOrdenes gestorOrdenes;
    private Menu menu;
    private Scanner scanner;

    public CoffeePOS() {
        this.gestorProductos = new GestorProductos();
        this.gestorClientes = new GestorClientes();
        this.gestorEmpleados = new GestorEmpleados();
        this.gestorOrdenes = new GestorOrdenes();
        this.menu = new Menu();
        this.scanner = new Scanner(System.in);
        inicializarDatos();
    }

    /**
     * Inicializa el sistema con datos de prueba
     */
    private void inicializarDatos() {

        // Productos
        Bebida espresso = new Bebida("Espresso", 3.50, "Pequeño", true);
        Bebida latte = new Bebida("Latte", 4.50, "Mediano", true);
        Bebida frapuccino = new Bebida("Frappuccino", 5.50, "Grande", false);
        Alimento croissant = new Alimento("Croissant", 2.50, "Panadería", false);
        Alimento ensalada = new Alimento("Ensalada Verde", 6.50, "Saludable", true);

        gestorProductos.agregar(espresso);
        gestorProductos.agregar(latte);
        gestorProductos.agregar(frapuccino);
        gestorProductos.agregar(croissant);
        gestorProductos.agregar(ensalada);

        menu.agregarProducto(espresso);
        menu.agregarProducto(latte);
        menu.agregarProducto(frapuccino);
        menu.agregarProducto(croissant);
        menu.agregarProducto(ensalada);

        // Empleados
        Barista barista1 = new Barista("María González", 2500.0, "Café Artesanal");
        Mesero mesero1 = new Mesero("Carlos López", 2200.0, 8);
        Barista barista2 = new Barista("Ana Torres", 2600.0, "Bebidas Frías");

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

        System.out.println("Sistema inicializado con datos de prueba");
    }

    /**
     * Método principal que ejecuta el menú del sistema
     */
    public void ejecutar() {
        int opcion;
        do {
            mostrarMenuPrincipal();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    gestionarProductos();
                    break;
                case 2:
                    gestionarClientes();
                    break;
                case 3:
                    gestionarEmpleados();
                    break;
                case 4:
                    gestionarOrdenes();
                    break;
                case 5:
                    menu.mostrarMenu();
                    break;
                case 6:
                    realizarVentaDemo();
                    break;
                case 7:
                    mostrarReportes();
                    break;
                case 0:
                    System.out.println("¡Gracias por usar CoffeePOS!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 0);
    }

    private void mostrarMenuPrincipal() {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║        COFFEEPOS SYSTEM        ║");
        System.out.println("╠════════════════════════════════╣");
        System.out.println("║ 1. Gestionar Productos         ║");
        System.out.println("║ 2. Gestionar Clientes          ║");
        System.out.println("║ 3. Gestionar Empleados         ║");
        System.out.println("║ 4. Gestionar Órdenes           ║");
        System.out.println("║ 5. Ver Menú                    ║");
        System.out.println("║ 6. Realizar Venta (Demo)       ║");
        System.out.println("║ 7. Reportes                    ║");
        System.out.println("║ 0. Salir                       ║");
        System.out.println("╚════════════════════════════════╝");
        System.out.print("Seleccione una opción: ");
    }

    private void gestionarProductos() {
        System.out.println("\n=== GESTIÓN DE PRODUCTOS ===");
        System.out.println("1. Agregar producto");
        System.out.println("2. Buscar producto");
        System.out.println("3. Actualizar producto");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Listar productos");
        System.out.print("Opción: ");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                agregarProducto();
                break;
            case 2:
                buscarProducto();
                break;
            case 3:
                actualizarProducto();
                break;
            case 4:
                eliminarProducto();
                break;
            case 5:
                gestorProductos.listar();
                break;
        }
    }

    private void agregarProducto() {
        System.out.println("Tipo de producto (1-Bebida, 2-Alimento): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        if (tipo == 1) {
            System.out.print("Tamaño: ");
            String tamaño = scanner.nextLine();
            System.out.print("¿Es caliente? (true/false): ");
            boolean esCaliente = scanner.nextBoolean();

            Bebida bebida = new Bebida(nombre, precio, tamaño, esCaliente);
            gestorProductos.agregar(bebida);
            menu.agregarProducto(bebida);
        } else {
            System.out.print("Categoría: ");
            String categoria = scanner.nextLine();
            System.out.print("¿Es vegano? (true/false): ");
            boolean esVegano = scanner.nextBoolean();

            Alimento alimento = new Alimento(nombre, precio, categoria, esVegano);
            gestorProductos.agregar(alimento);
            menu.agregarProducto(alimento);
        }
    }

    private void buscarProducto() {
        System.out.print("ID del producto: ");
        int id = scanner.nextInt();
        Producto producto = gestorProductos.buscar(id);
        if (producto != null) {
            System.out.println("Producto encontrado: " + producto);
        } else {
            System.out.println("Producto no encontrado");
        }
    }

    private void actualizarProducto() {
        System.out.print("ID del producto a actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Producto existente = gestorProductos.buscar(id);
        if (existente != null) {
            System.out.print("Nuevo nombre (actual: " + existente.getNombre() + "): ");
            String nombre = scanner.nextLine();
            System.out.print("Nuevo precio (actual: " + existente.getPrecio() + "): ");
            double precio = scanner.nextDouble();
            System.out.print("¿Disponible? (true/false, actual: " + existente.isDisponible() + "): ");
            boolean disponible = scanner.nextBoolean();

            if (existente instanceof Bebida) {
                Bebida bebidaActualizada = new Bebida(nombre, precio,
                        ((Bebida) existente).getTamaño(), ((Bebida) existente).isEsCaliente());
                bebidaActualizada.setDisponible(disponible);
                gestorProductos.actualizar(id, bebidaActualizada);
            } else {
                Alimento alimentoActualizado = new Alimento(nombre, precio,
                        ((Alimento) existente).getCategoria(), ((Alimento) existente).isEsVegano());
                alimentoActualizado.setDisponible(disponible);
                gestorProductos.actualizar(id, alimentoActualizado);
            }
        } else {
            System.out.println("Producto no encontrado");
        }
    }

    private void eliminarProducto() {
        System.out.print("ID del producto a eliminar: ");
        int id = scanner.nextInt();
        System.out.print("¿Está seguro? (s/n): ");
        String confirmacion = scanner.next();

        if (confirmacion.equalsIgnoreCase("s")) {
            if (gestorProductos.eliminar(id)) {
                System.out.println("Producto eliminado exitosamente");
            } else {
                System.out.println("No se pudo eliminar el producto");
            }
        }
    }

    private void gestionarClientes() {
        System.out.println("\n=== GESTIÓN DE CLIENTES ===");
        System.out.println("1. Agregar cliente");
        System.out.println("2. Buscar cliente");
        System.out.println("3. Actualizar cliente");
        System.out.println("4. Eliminar cliente");
        System.out.println("5. Listar clientes");
        System.out.print("Opción: ");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                agregarCliente();
                break;
            case 2:
                buscarCliente();
                break;
            case 3:
                actualizarCliente();
                break;
            case 4:
                eliminarCliente();
                break;
            case 5:
                gestorClientes.listar();
                break;
        }
    }

    private void agregarCliente() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Contacto: ");
        String contacto = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, contacto);
        gestorClientes.agregar(cliente);
    }

    private void buscarCliente() {
        System.out.print("ID del cliente: ");
        int id = scanner.nextInt();
        Cliente cliente = gestorClientes.buscar(id);
        if (cliente != null) {
            System.out.println("Cliente encontrado: " + cliente);
        } else {
            System.out.println("Cliente no encontrado");
        }
    }

    private void actualizarCliente() {
        System.out.print("ID del cliente a actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Cliente existente = gestorClientes.buscar(id);
        if (existente != null) {
            System.out.print("Nuevo nombre (actual: " + existente.getNombre() + "): ");
            String nombre = scanner.nextLine();
            System.out.print("Nuevo contacto (actual: " + existente.getContacto() + "): ");
            String contacto = scanner.nextLine();

            Cliente clienteActualizado = new Cliente(nombre, contacto);
            gestorClientes.actualizar(id, clienteActualizado);
        } else {
            System.out.println("Cliente no encontrado");
        }
    }

    private void eliminarCliente() {
        System.out.print("ID del cliente a eliminar: ");
        int id = scanner.nextInt();
        System.out.print("¿Está seguro? (s/n): ");
        String confirmacion = scanner.next();

        if (confirmacion.equalsIgnoreCase("s")) {
            if (gestorClientes.eliminar(id)) {
                System.out.println("Cliente eliminado exitosamente");
            } else {
                System.out.println("No se pudo eliminar el cliente");
            }
        }
    }

    private void gestionarEmpleados() {
        System.out.println("\n=== GESTIÓN DE EMPLEADOS ===");
        System.out.println("1. Agregar empleado");
        System.out.println("2. Buscar empleado");
        System.out.println("3. Listar empleados");
        System.out.print("Opción: ");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                agregarEmpleado();
                break;
            case 2:
                buscarEmpleado();
                break;
            case 3:
                gestorEmpleados.listar();
                break;
        }
    }

    private void agregarEmpleado() {
        System.out.println("Tipo de empleado (1-Barista, 2-Mesero): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Salario: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        if (tipo == 1) {
            System.out.print("Especialidad: ");
            String especialidad = scanner.nextLine();
            Barista barista = new Barista(nombre, salario, especialidad);
            gestorEmpleados.agregar(barista);
        } else {
            System.out.print("Mesas asignadas: ");
            int mesas = scanner.nextInt();
            Mesero mesero = new Mesero(nombre, salario, mesas);
            gestorEmpleados.agregar(mesero);
        }
    }

    private void buscarEmpleado() {
        System.out.print("ID del empleado: ");
        int id = scanner.nextInt();
        Empleado empleado = gestorEmpleados.buscar(id);
        if (empleado != null) {
            System.out.println("Empleado encontrado: " + empleado);
        } else {
            System.out.println("Empleado no encontrado");
        }
    }

    private void gestionarOrdenes() {
        System.out.println("\n=== GESTIÓN DE ÓRDENES ===");
        System.out.println("1. Crear nueva orden");
        System.out.println("2. Buscar orden");
        System.out.println("3. Cancelar orden");
        System.out.println("4. Completar orden");
        System.out.println("5. Listar órdenes");
        System.out.print("Opción: ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                crearOrden();
                break;
            case 2:
                buscarOrden();
                break;
            case 3:
                cancelarOrden();
                break;
            case 4:
                completarOrden();
                break;
            case 5:
                gestorOrdenes.listarOrdenes();
                break;
        }
    }

    private void crearOrden() {
        System.out.print("ID del cliente: ");
        int clienteId = scanner.nextInt();
        System.out.print("ID del empleado: ");
        int empleadoId = scanner.nextInt();

        Cliente cliente = gestorClientes.buscar(clienteId);
        Empleado empleado = gestorEmpleados.buscar(empleadoId);

        if (cliente != null && empleado != null) {
            gestorOrdenes.crearOrden(cliente, empleado);
            System.out.println("Orden creada exitosamente");
        } else {
            System.out.println("Cliente o empleado no encontrado");
        }
    }

    private void buscarOrden() {
        System.out.print("ID de la orden: ");
        int id = scanner.nextInt();
        Orden orden = gestorOrdenes.buscarOrden(id);
        if (orden != null) {
            System.out.println(orden);
        } else {
            System.out.println("Orden no encontrada");
        }
    }

    private void cancelarOrden() {
        System.out.print("ID de la orden a cancelar: ");
        int id = scanner.nextInt();
        gestorOrdenes.cancelarOrden(id);
    }

    private void completarOrden() {
        System.out.print("ID de la orden a completar: ");
        int id = scanner.nextInt();
        gestorOrdenes.completarOrden(id);
    }

    private void realizarVentaDemo() {
        System.out.println("\n=== DEMO DE VENTA ===");

        // Usar datos existentes para la demo
        Cliente cliente = gestorClientes.getClientes().get(0);
        Empleado empleado = gestorEmpleados.getEmpleados().get(0);

        Orden orden = new Orden(cliente, empleado);

        // Agregar algunos productos
        List<Producto> productos = gestorProductos.getProductos();
        if (!productos.isEmpty()) {
            orden.agregarItem(productos.get(0), 2);
            if (productos.size() > 1) {
                orden.agregarItem(productos.get(1), 1);
            }
        }

        System.out.println("Orden creada:");
        System.out.println(orden);

        orden.procesarOrden();
        gestorOrdenes.getOrdenes().add(orden);

        System.out.println("\nVenta completada exitosamente");
    }

    private void mostrarReportes() {
        System.out.println("\n=== REPORTES ===");
        System.out.println("Total de productos: " + gestorProductos.getProductos().size());
        System.out.println("Total de clientes: " + gestorClientes.getClientes().size());
        System.out.println("Total de empleados: " + gestorEmpleados.getEmpleados().size());
        System.out.println("Total de órdenes: " + gestorOrdenes.getOrdenes().size());

        double totalVentas = gestorOrdenes.getOrdenes().stream()
                .mapToDouble(Orden::calcularTotal)
                .sum();
        System.out.println("Total en ventas: $" + String.format("%.2f", totalVentas));
    }

    /**
     * Método principal
     */
    public static void main(String[] args) {
        System.out.println("Iniciando CoffeePOS...");
        System.out.println("1. Modo Consola");
        System.out.println("2. Modo GUI");
        System.out.print("Seleccione modo: ");

        Scanner sc = new Scanner(System.in);
        int modo = sc.nextInt();

        if (modo == 1) {
            CoffeePOS sistema = new CoffeePOS();
            sistema.ejecutar();
        } else {
            SwingUtilities.invokeLater(() -> {
                new CoffeePOSGUI();
            });
        }
    }
}
