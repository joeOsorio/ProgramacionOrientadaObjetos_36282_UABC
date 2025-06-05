
/**
 * Clase para clientes
 */
class Cliente {

    private final int id;
    private String nombre;
    private String contacto;
    private int ordenesRealizadas;
    private static int contadorId = 1;

    public Cliente(String nombre, String contacto) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.contacto = contacto;
        this.ordenesRealizadas = 0;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public int getOrdenesRealizadas() {
        return ordenesRealizadas;
    }

    public void incrementarOrdenes() {
        this.ordenesRealizadas++;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | " + nombre + " | " + contacto
                + " | Órdenes: " + ordenesRealizadas;
    }
}
