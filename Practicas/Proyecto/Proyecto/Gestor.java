import java.util.ArrayList;
import java.util.List;

public class Gestor {
    private List<Articulo> articulos;
    private List<Cliente> clientes;
    private int contadorPedidos;

    public Gestor() {
        this.articulos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.contadorPedidos = 1;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }
    public List<Cliente> getClientes() {
        return clientes;
    }

    public int getContadorPedidos() {
        return contadorPedidos;
    }


    // Metodo para mostrar la lista de articulos en tienda
    public void listarArticulos() {
        System.out.println("Articulos:");
        for (int i = 0; i < articulos.size(); i++) {
            System.out.println((i+1) +". "+ articulos.get(i));
        }
    }

    // Metodo para modificar algun articulo ya existente
    public void modificarArticulo(String nombre, double nuevoPrecio, int nuevaCantidad) {
        for (Articulo articulo : articulos) {
            if (articulo.getArticulo().equalsIgnoreCase(nombre)) {
                articulo.setDisponible(nuevaCantidad);
                System.out.println(articulo +" - Modificacion exitosa.");
                return;
            }
        }
        System.out.println("Articulo no identificado.");
    }

    // Metodo para eliminar uno de los articulos
    public void eliminarArticulo(String nombre) {
        articulos.removeIf(articulo -> articulo.getArticulo().equalsIgnoreCase(nombre));
        System.out.println(nombre +" - Eliminado.");
    }

    // Metodo para registrar un cliente en el sistema
    // Si bien en LC no se puede registrar como cliente para futuro, es necesario para poder hacer un pedido
    public void registrarCliente(String tipoCliente) {
        clientes.add(new Cliente(tipoCliente));
    }

    // Metodo para mostrar los clientes registrados hasta el momento
    public void listarClientes() {
        System.out.println("Clientes registrados:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    // Metodo para seleccionar el articulo en el menu
    public Articulo seleccionarArticulo(int numero) {
        if (numero >= 1 && numero <= articulos.size()) {
            return articulos.get(numero-1);
        } else {
            System.out.println("Articulo invalido.");
            return null;
        }
    }
}