public class Empleado extends Persona {
    private String numEmpleado;

    public Empleado() {
        super();
    }

    public Empleado(String nombres, String apellidos, String direccion, String nacimiento, String edad, String numEmpleado) {
        super(nombres, apellidos, direccion, nacimiento, edad);
        this.numEmpleado = numEmpleado;
    }
    // setter
    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    // getter
    public String getNumEmpleado() {
        return numEmpleado;
    }
}