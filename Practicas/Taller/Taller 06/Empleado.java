
public class Empleado {

    private Nombre nombre;
    private String noEmpleado;
    private double salario;

    public Empleado(String noEmpleado, Nombre nombre, double salario) {
        this.noEmpleado = noEmpleado;
        this.nombre = nombre;
        this.salario = salario;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public String getNoEmpleado() {
        return noEmpleado;
    }

    public void setNoEmpleado(String noEmpleado) {
        this.noEmpleado = noEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String primerApellido, String primerNombre, String segundoApellido) {
        nombre = new Nombre(primerApellido, primerNombre, segundoApellido);
    }

    public void setNombre(String primerApellido, String primerNombre, String segundoApellido, String segundoNombre) {
        nombre = new Nombre(primerNombre, segundoNombre, primerApellido, segundoApellido);
    }

    public void setNombre(String primerApellido, String primerNombre) {
        nombre = new Nombre(primerNombre, primerApellido);
    }

}
