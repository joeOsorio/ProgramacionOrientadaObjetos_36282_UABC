package modelos;

/**
 * Clase para bebidas
 */
public class Bebida extends Producto {

    private String tamaño;
    private boolean esCaliente;

    public Bebida(String nombre, double precio, String tamaño, boolean esCaliente) {
        super(nombre, "Bebida", precio);
        this.tamaño = tamaño;
        this.esCaliente = esCaliente;
    }

    // public Bebida(String nombre, double precio, String tamaño, boolean esCaliente) {
    //     super(nombre, "Bebida", precio);
    //     this.tamaño = tamaño;
    //     this.esCaliente = esCaliente;
    // }
    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isEsCaliente() {
        return esCaliente;
    }

    public void setEsCaliente(boolean esCaliente) {
        this.esCaliente = esCaliente;
    }

    @Override
    public String obtenerDescripcion() {
        return super.obtenerDescripcion() + " [" + tamaño + ", "
                + (esCaliente ? "Caliente" : "Frío") + "]";
    }
}
