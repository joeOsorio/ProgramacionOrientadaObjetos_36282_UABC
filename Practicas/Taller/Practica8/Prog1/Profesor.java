public class Profesor extends Persona {
    
    
    private List<String> listaMaterias;
    private int numEmpleado;

    
    public Profesor(String nombre, String materia) {
        super(nombre);
        this.listaMaterias = new ArrayList<>();
        this.listaMaterias.add(materia);
    }

    // Constructor that initializes with all necessary data
    public Profesor(String nombre, int edad, String direccion, int numEmpleado, List<String> materias) {
        super(nombre, edad, direccion);
        this.numEmpleado = numEmpleado;
        this.listaMaterias = new ArrayList(materias);
    }

    // Getters and Setters
    public List<String> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(List<String> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
}