
public class Estudiante {
    // Atributos privados

    private String nombre;
    private int edad;
    private final String matricula;
    private String carrera;

    // Constructor
    public Estudiante(String nombre, int edad, String matricula, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
        this.carrera = carrera;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // Método toString para imprimir detalles del estudiante
    @Override
    public String toString() {
        return "Estudiante{"
                + "nombre='" + nombre + '\''
                + ", edad=" + edad
                + ", matricula='" + matricula + '\''
                + ", carrera='" + carrera + '\''
                + '}';
    }
}
