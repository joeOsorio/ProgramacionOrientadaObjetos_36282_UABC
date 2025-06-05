/**
 * Gestor de productos
 */
package gestores;

import interfaces.*;
import java.util.*;
import modelos.*;

public class GestorProductos implements OperacionesCRUD<Producto> {

    private final List<Producto> productos;

    public GestorProductos() {
        this.productos = new ArrayList<>();
    }

    @Override
    public void agregar(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    // public void agregar(Bebida bebida) {
    //     productos.add(bebida);
    //     System.out.println("Producto agregado: " + bebida.getNombre());
    // }
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

    // @Override
    // public void agregar(Producto objeto) {
    //     throw new UnsupportedOperationException("Unimplemented method 'agregar'");
    // }
}
