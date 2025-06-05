
public class Nombre {

    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;

    public Nombre(String primerApellido, String primerNombre, String segundoApellido) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public Nombre(String primerApellido, String primerNombre, String segundoApellido, String segundoNombre) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public Nombre(String primerApellido, String primerNombre) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSgundoNombre() {
        return segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getNombreCompleto() {

        if (segundoNombre == null) {
            return primerNombre + " " + primerApellido + " " + segundoApellido;
        } else if (segundoNombre == null & segundoApellido == null) {
            return primerNombre + " " + primerApellido;
        }
        return primerNombre + " " + segundoNombre + " " + primerApellido + " " + segundoApellido;
    }
}
