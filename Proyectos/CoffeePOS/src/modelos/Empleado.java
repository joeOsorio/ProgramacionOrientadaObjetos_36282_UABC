package modelos;

/**
 * Clase abstracta para empleados
 */
public abstract class Empleado {

    protected int id;
    protected String nombre;
    protected String cargo;
    protected double salario;
    protected static int contadorId = 1;

    public Empleado(String nombre, String cargo, double salario) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Empleado(String nombre) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.cargo = "No especificado";
        this.salario = 0;
    }

    public Empleado(String nombre, String cargo) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = 0;
    }

    public Empleado(String nombre, double salario) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.cargo = "No especificado";
        this.salario = salario;
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

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método abstracto para atender órdenes (polimorfismo)
    abstract void atenderOrden(Orden orden);

    @Override
    public String toString() {
        return "ID: " + id + " | " + nombre + " | " + cargo + " | $" + salario;
    }
}
