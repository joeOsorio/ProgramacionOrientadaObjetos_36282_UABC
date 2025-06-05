
/**
 * Clase Mesero que hereda de Empleado
 */
class Mesero extends Empleado {

    private int mesasAsignadas;

    public Mesero(String nombre, double salario, int mesasAsignadas) {
        super(nombre, "Mesero", salario);
        this.mesasAsignadas = mesasAsignadas;
    }

    public int getMesasAsignadas() {
        return mesasAsignadas;
    }

    public void setMesasAsignadas(int mesasAsignadas) {
        this.mesasAsignadas = mesasAsignadas;
    }

    @Override
    public void atenderOrden(Orden orden) {
        System.out.println("Mesero " + nombre + " está atendiendo la orden #" + orden.getId());
        System.out.println("Mesas asignadas: " + mesasAsignadas);
    }

    @Override
    public String toString() {
        return super.toString() + " | Mesas: " + mesasAsignadas;
    }
}
