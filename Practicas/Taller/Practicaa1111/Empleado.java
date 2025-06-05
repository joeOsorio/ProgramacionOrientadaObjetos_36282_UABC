
public abstract class Empleado implements PorPagar {

    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String numeroSeguroSocial;

    public Empleado(String primerNombre, String primerApellido, String segundoApellido) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public Empleado(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public Empleado(String primerNombre, String primerApellido) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
    }

    public Empleado(String numeroSeguroSocial, String primerApellido, String primerNombre, String segundoApellido, String segundoNombre) {
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.primerApellido = primerApellido;
        this.primerNombre = primerNombre;
        this.segundoApellido = segundoApellido;
        this.segundoNombre = segundoNombre;
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
        if (segundoNombre == null && segundoApellido != null) {
            return primerNombre + " " + primerApellido;
        } else if (segundoNombre == null) {
            return primerNombre + " " + primerApellido + " " + segundoApellido;
        } else if (primerApellido == null) {
            return primerNombre + " " + segundoNombre + " " + segundoApellido;
        } else if (segundoApellido == null) {
            return primerNombre + " " + segundoNombre + " " + primerApellido;
        } else if (primerNombre == null && segundoNombre == null && primerApellido == null && segundoApellido == null) {
            return "No Capturado";
        }
        return primerNombre + " " + segundoNombre + " " + primerApellido + " " + segundoApellido;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }


    /* ***************************************************************************************************** */
    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    @Override
    public String toString() {
        return String.format("%s %s%nnumero de seguro social: %s", getPrimerNombre(), getPrimerApellido(), getNumeroSeguroSocial());
    }

}
