
public class Cliente {

    private String nombre;
    private String direccion;
    private String Celular;
    private Pedido pedido;

    // constructor.
    public Cliente() {
        this.Celular = "No especificado";
        this.direccion = "No especificado";
        this.nombre = "No especificado";
    }

    public Cliente(String Celular, String direccion, String nombre) {
        this.Celular = Celular;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    // metodo Getter.
    public String getCelular() {
        return Celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public Pedido getPedido() {
        return pedido;
    }

    // Metodos Setter
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String toString() {
        return "\nNombre:\t" + nombre + "\nDirreccion:\t" + direccion + "\nCelular:\t" + Celular + "\n";
    }

}
