/*-----------------------------------
Practica: 6 Gestión y manipulación de arreglos de objetos en Java.
Nombre: Joshua Osorio 
Materia: Programación Orientada a Objetos
Fecha: Marzo/26/2025 
-----------------------------------*/

public class Principal {

    public static void main(String[] args) {
        // Crear gestor de estudiantes
        GestorEstudiantes gestor = new GestorEstudiantes();

        // Crear algunos estudiantes
        Estudiante e1 = new Estudiante("Joshua Osorio Osorio", 22, "1293271", "Ingeniería en computación");
        Estudiante e2 = new Estudiante("Manuel Alejandro Cruz Lares", 23, "1298063", "Ingenería en computación");
        Estudiante e3 = new Estudiante("Carlos Alberto Serrano Leyva", 21, "1285493", "Ingenería en computación");

        // Agregar estudiantes
        gestor.agregarEstudiante(e1);
        gestor.agregarEstudiante(e2);
        gestor.agregarEstudiante(e3);

        // Mostrar todos los estudiantes
        System.out.println("\n--- Estudiantes Registrados ---");
        gestor.mostrarEstudiantes();

        // Buscar estudiante
        System.out.println("\n--- Buscando Estudiante ---");
        Estudiante encontrado = gestor.buscarEstudiantePorMatricula("1293271");
        if (encontrado != null) {
            System.out.println("Estudiante encontrado: " + encontrado);
        }

        // Modificar estudiante
        System.out.println("\n--- Modificando Estudiante ---");
        gestor.modificarEstudiante("1298063", "María López", 23);
        gestor.mostrarEstudiantes();

        // Eliminar estudiante
        System.out.println("\n--- Eliminando Estudiante ---");
        gestor.eliminarEstudiante("1285493");
        gestor.mostrarEstudiantes();
    }
}
