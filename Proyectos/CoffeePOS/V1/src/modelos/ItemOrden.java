
/**
 * Clase para representar un item en una orden
 */
class ItemOrden {

    private final Producto producto;
    private int cantidad;

    public ItemOrden(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return producto.calcularPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return cantidad + "x " + producto.getNombre() + " - $" + calcularSubtotal();
    }
}
