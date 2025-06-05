// ========== INTERFACES ==========
package interfaces;

/**
 * Interfaz para objetos que pueden ser vendidos
 */
public interface Vendible {

    double calcularPrecio();

    boolean estaDisponible();

    String obtenerDescripcion();
}
