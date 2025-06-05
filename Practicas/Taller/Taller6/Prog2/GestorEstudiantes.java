
public class GestorEstudiantes {

    // Máximo número de estudiantes
    private static final int MAX_ESTUDIANTES = 100;

    // Arreglo de estudiantes
    private final Estudiante[] estudiantes;

    // Contador de estudiantes en el arreglo
    private int contadorEstudiantes;

    // Constructor
    public GestorEstudiantes() {
        estudiantes = new Estudiante[MAX_ESTUDIANTES];
        contadorEstudiantes = 0;
    }

    // Método para agregar estudiante
    public void agregarEstudiante(Estudiante e) {
        if (contadorEstudiantes < MAX_ESTUDIANTES) {
            estudiantes[contadorEstudiantes] = e;
            contadorEstudiantes++;
            System.out.println("Estudiante agregado exitosamente.");
        } else {
            System.out.println("No se pueden agregar más estudiantes. Límite alcanzado.");
        }
    }

    // Método para mostrar todos los estudiantes
    public void mostrarEstudiantes() {
        if (contadorEstudiantes == 0) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        System.out.println("Lista de Estudiantes:");
        for (int i = 0; i < contadorEstudiantes; i++) {
            System.out.println(estudiantes[i]);
        }
    }

    // Método para buscar estudiante por matrícula
    public Estudiante buscarEstudiantePorMatricula(String matricula) {
        for (int i = 0; i < contadorEstudiantes; i++) {
            if (estudiantes[i].getMatricula().equals(matricula)) {
                return estudiantes[i];
            }
        }
        return null;
    }

    // Método para modificar estudiante
    public void modificarEstudiante(String matricula, String nuevoNombre, int nuevaEdad) {
        Estudiante estudiante = buscarEstudiantePorMatricula(matricula);

        if (estudiante != null) {
            estudiante.setNombre(nuevoNombre);
            estudiante.setEdad(nuevaEdad);
            System.out.println("Estudiante modificado exitosamente.");
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    // Método para eliminar estudiante
    public void eliminarEstudiante(String matricula) {
        for (int i = 0; i < contadorEstudiantes; i++) {
            if (estudiantes[i].getMatricula().equals(matricula)) {
                // Desplazar los elementos siguientes
                for (int j = i; j < contadorEstudiantes - 1; j++) {
                    estudiantes[j] = estudiantes[j + 1];
                }
                estudiantes[contadorEstudiantes - 1] = null;
                contadorEstudiantes--;
                System.out.println("Estudiante eliminado exitosamente.");
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }
}
