public class Articulo {
    private String articulo;
    private double precio;
    private int disponible;

    public Articulo(String articulo, double precio, int disponible) {
        this.articulo = articulo;
        this.precio = precio;
        this.disponible = disponible;
    }

    public void setDisponible (int disponible) {
        this.disponible = disponible;
    }

    public void setPrecio (double precio) {
        this.precio = precio;
    }

    public String getArticulo() {
        return articulo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getDisponible() {
        return disponible;
    }

    public String toString() {
        return articulo +"   -   $"+ precio +"   -   HNR: "+ disponible;
    }
}