public class Cajero extends Empleado {
    private String numEmpleado;
    private int numCaja;

    public Cajero() {
        super("undefined", "undefined", "undefined", "undefined", "undefined", "undefined");
        this.numEmpleado = "undefined";
        this.numCaja = 0;
    }

    public Cajero(String nombres, String apellidos, String direccion, String nacimiento, String edad, String numEmpleado, int numCaja) {
        super(nombres, apellidos, direccion, nacimiento, edad, numEmpleado);
        this.numEmpleado = numEmpleado;
        this.numCaja = numCaja;
    }

    // setter
    public void setNumCaja(int numCaja) {
        this.numCaja = numCaja;
    }

    // getter
    public int getNumCaja() {
        return numCaja;
    }

    // método para imprimir los datos del cajero
    public String datosCajero() {
        return "Cajero: " + getNombres() + "\nNúmero de caja: " + numCaja;
    }
}