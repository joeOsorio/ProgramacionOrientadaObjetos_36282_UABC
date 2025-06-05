
// ========== CLASES GESTORAS (CRUD) ==========
/**
 * Gestor de productos
 */
class GestorProductos implements OperacionesCRUD<Producto> {

    private List<Producto> productos;

    public GestorProductos() {
        this.productos = new ArrayList<>();
    }

    @Override
    public void agregar(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    @Override
    public Producto buscar(int id) {
        return productos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean actualizar(int id, Producto producto) {
        Producto existente = buscar(id);
        if (existente != null) {
            existente.setNombre(producto.getNombre());
            existente.setPrecio(producto.getPrecio());
            existente.setDisponible(producto.isDisponible());
            System.out.println("Producto actualizado: " + existente.getNombre());
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        Producto producto = buscar(id);
        if (producto != null) {
            productos.remove(producto);
            System.out.println("Producto eliminado: " + producto.getNombre());
            return true;
        }
        return false;
    }

    @Override
    public void listar() {
        System.out.println("\n=== LISTA DE PRODUCTOS ===");
        productos.forEach(System.out::println);
    }

    public List<Producto> getProductos() {
        return productos;
    }
}

/**
 * Gestor de clientes
 */
class GestorClientes implements OperacionesCRUD<Cliente> {

    private List<Cliente> clientes;

    public GestorClientes() {
        this.clientes = new ArrayList<>();
    }

    @Override
    public void agregar(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente registrado: " + cliente.getNombre());
    }

    @Override
    public Cliente buscar(int id) {
        return clientes.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean actualizar(int id, Cliente cliente) {
        Cliente existente = buscar(id);
        if (existente != null) {
            existente.setNombre(cliente.getNombre());
            existente.setContacto(cliente.getContacto());
            System.out.println("Cliente actualizado: " + existente.getNombre());
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        Cliente cliente = buscar(id);
        if (cliente != null) {
            clientes.remove(cliente);
            System.out.println("Cliente eliminado: " + cliente.getNombre());
            return true;
        }
        return false;
    }

    @Override
    public void listar() {
        System.out.println("\n=== LISTA DE CLIENTES ===");
        clientes.forEach(System.out::println);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}

/**
 * Gestor de empleados
 */
class GestorEmpleados implements OperacionesCRUD<Empleado> {

    private List<Empleado> empleados;

    public GestorEmpleados() {
        this.empleados = new ArrayList<>();
    }

    @Override
    public void agregar(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado registrado: " + empleado.getNombre());
    }

    @Override
    public Empleado buscar(int id) {
        return empleados.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean actualizar(int id, Empleado empleado) {
        Empleado existente = buscar(id);
        if (existente != null) {
            existente.setNombre(empleado.getNombre());
            existente.setSalario(empleado.getSalario());
            System.out.println("Empleado actualizado: " + existente.getNombre());
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        Empleado empleado = buscar(id);
        if (empleado != null) {
            empleados.remove(empleado);
            System.out.println("Empleado eliminado: " + empleado.getNombre());
            return true;
        }
        return false;
    }

    @Override
    public void listar() {
        System.out.println("\n=== LISTA DE EMPLEADOS ===");
        empleados.forEach(System.out::println);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}

/**
 * Gestor de órdenes
 */
class GestorOrdenes {

    private List<Orden> ordenes;

    public GestorOrdenes() {
        this.ordenes = new ArrayList<>();
    }

    public void crearOrden(Cliente cliente, Empleado empleado) {
        Orden orden = new Orden(cliente, empleado);
        ordenes.add(orden);
        System.out.println("Nueva orden creada: #" + orden.getId());
    }

    public Orden buscarOrden(int id) {
        return ordenes.stream()
                .filter(o -> o.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void cancelarOrden(int id) {
        Orden orden = buscarOrden(id);
        if (orden != null) {
            orden.setEstado("Cancelada");
            System.out.println("Orden #" + id + " cancelada");
        }
    }

    public void completarOrden(int id) {
        Orden orden = buscarOrden(id);
        if (orden != null) {
            orden.setEstado("Completada");
            System.out.println("Orden #" + id + " completada");
        }
    }

    public void listarOrdenes() {
        System.out.println("\n=== LISTA DE ÓRDENES ===");
        ordenes.forEach(System.out::println);
    }

    public List<Orden> getOrdenes() {
        return ordenes;
    }
}

// ========== CLASE PRINCIPAL ==========
import java.util.*;

import java.util.stream.Collectors;

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
        Cliente cliente1 = new Cliente("Juan Pérez", "juan@email.com");
        Cliente cliente2 = new Cliente("María Smith", "maria@email.com");
        Cliente cliente3 = new Cliente("Pedro Morales", "pedro@email.com");

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
