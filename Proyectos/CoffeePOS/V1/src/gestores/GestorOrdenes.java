
/**
 * Gestor de órdenes
 */
import java.util.*;

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
