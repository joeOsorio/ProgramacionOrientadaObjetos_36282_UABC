
/**
 * Clase para alimentos
 */
class Alimento extends Producto {

    private String categoria;
    private boolean esVegano;

    public Alimento(String nombre, double precio, String categoria, boolean esVegano) {
        super(nombre, "Alimento", precio);
        this.categoria = categoria;
        this.esVegano = esVegano;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isEsVegano() {
        return esVegano;
    }

    public void setEsVegano(boolean esVegano) {
        this.esVegano = esVegano;
    }

    @Override
    public String obtenerDescripcion() {
        return super.obtenerDescripcion() + " [" + categoria
                + (esVegano ? ", Vegano" : "") + "]";
    }
}
