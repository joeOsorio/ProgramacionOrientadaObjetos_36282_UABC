// ========== INTERFACES ==========

/**
 * Interfaz para objetos que pueden ser vendidos
 */
interface Vendible {

    double calcularPrecio();

    boolean estaDisponible();

    String obtenerDescripcion();
}
