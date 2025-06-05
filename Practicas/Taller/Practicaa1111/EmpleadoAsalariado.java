
public abstract class EmpleadoAsalariado extends Empleado {

    private double salarioSemanal;

    public EmpleadoAsalariado(double salarioSemanal, String primerNombre, String primerApellido) {
        super(primerNombre, primerApellido);
        this.salarioSemanal = salarioSemanal;
    }

    public EmpleadoAsalariado(double salarioSemanal, String primerNombre, String primerApellido, String segundoApellido) {
        super(primerNombre, primerApellido, segundoApellido);
        this.salarioSemanal = salarioSemanal;
    }

    public EmpleadoAsalariado(double salarioSemanal, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        super(primerNombre, segundoNombre, primerApellido, segundoApellido);
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

}
