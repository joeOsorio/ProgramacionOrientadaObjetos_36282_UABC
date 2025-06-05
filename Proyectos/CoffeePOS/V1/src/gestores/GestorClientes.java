
/**
 * Gestor de clientes
 */
import java.util.*;

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
