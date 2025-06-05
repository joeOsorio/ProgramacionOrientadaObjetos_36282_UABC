
public class Persona {

    private Nombre nombreCompleto;
    private int dia;
    private int mes;
    private int anio;
    private String direccion;

    public Persona(Nombre nombreCompleto, String direccion, int dia, int mes, int anio) {
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Nombre getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(Nombre nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
