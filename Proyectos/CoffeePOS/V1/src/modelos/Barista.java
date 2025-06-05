/*
 * Clase Barista que hereda de Empleado
 */
class Barista extends Empleado {

    private String especialidad;

    public Barista(String nombre, double salario, String especialidad) {
        super(nombre, "Barista", salario);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void atenderOrden(Orden orden) {
        System.out.println("Barista " + nombre + " está preparando la orden #" + orden.getId());
        System.out.println("Especialidad: " + especialidad);
    }

    @Override
    public String toString() {
        return super.toString() + " | Especialidad: " + especialidad;
    }
}
