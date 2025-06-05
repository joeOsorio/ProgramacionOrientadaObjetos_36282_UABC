
public class Factura {

    private final String numeroPieza;
    private final String descripcionPieza;
    private int cantidad;
    private double precioUnitario;

    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioUnitario) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("Cantidad debe ser mayor que 0");
        }
        if (precioUnitario < 0.0) {
            throw new IllegalArgumentException("El precio debe ser mayor que 0");
        }

    }

    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioUnitario) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double getTotalFactura() {
        return cantidad * precioUnitario;
    }

    public String getFactura() {
        return String.format("Factura: %s, %s, %d, %.2f", numeroPieza, descripcionPieza, cantidad, precioUnitario);
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "Factura{"
                + "numeroPieza='" + numeroPieza + '\''
                + ", descripcionPieza='" + descripcionPieza + '\''
                + ", cantidad=" + cantidad
                + ", precioUnitario=" + precioUnitario
                + '}';

        /*  return String.format("%s: %n%s: %s  %n%s: %d %n%s: $%.2f", "factura", "numero de pieza", getNumeroPieza(), "cantidad", getCantidad(), "precio por articulo", getPrecioUnitario());*/
    }
}
