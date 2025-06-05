
public class Pedido {

    private String id;
    private int noSegimiento;
    private String direccion;
    private float peso;
    private float largo;
    private float ancho;
    private float alto;

    public Pedido() {
        this.alto = 0;
        this.ancho = 0;
        this.direccion = "No especificado";
        this.id = "No especificado";
        this.largo = 0;
        this.noSegimiento = 0;
        this.peso = 0;
    }

    public Pedido(String id, int noSegimiento, String direccion, float peso, float ancho, float largo, float alto) {
        this.alto = alto;
        this.ancho = ancho;
        this.direccion = direccion;
        this.id = id;
        this.largo = largo;
        this.noSegimiento = noSegimiento;
        this.peso = peso;
    }

    // Metodos setters
    public void setId(String id) {
        this.id = id;
    }

    public void setNoSegimiento(int noSegimiento) {
        this.noSegimiento = noSegimiento;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    //Metodos getter.
    public String getId() {
        return id;
    }

    public int getNoSegimiento() {
        return noSegimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public float getPeso() {
        return peso;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public String toString() {
        return "\nid:\t" + id + "\nNo seguimiento:\t" + noSegimiento + "\nDireccion:\t" + direccion + "\nPeso:\t" + peso + "\nLargo:\t" + largo + "\nAncho:\t" + ancho + "\nAlto:\t" + alto;
    }

}
