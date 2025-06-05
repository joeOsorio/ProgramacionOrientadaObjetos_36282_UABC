
/**
 * Clase Menu (Agregación con productos)
 */
import java.util.*;
import java.util.stream.Collectors;

class Menu {

    private final List<Producto> productos;

    public Menu() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public List<Producto> getProductosDisponibles() {
        return productos.stream()
                .filter(Producto::estaDisponible)
                .collect(Collectors.toList());
    }

    public void mostrarMenu() {
        System.out.println("\n=== MENÚ DEL CAFÉ ===");
        productos.forEach(System.out::println);
    }
}
