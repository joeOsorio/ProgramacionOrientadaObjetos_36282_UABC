/*-----------------------------------
Practica: 6 Gestión y manipulación de arreglos de objetos en Java.
Nombre: Joshua Osorio 
Materia: Programación Orientada a Objetos
Fecha: Marzo/20/2025 
-----------------------------------*/

public class Principal {

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno(212156,
                "Jose Lopez Lopez",
                2);

        alumno1.setCarrera("Ingeniero en Computacion");
        alumno1.setSemestre(4);

        Materia materia1 = new Materia();
        materia1.setClave(36282);
        materia1.setNombre("Programacion Orientada a Objetos");

        Materia materia2 = new Materia();
        materia2.setClave(36280);
        materia2.setNombre("Circuitos Electricos");

        alumno1.agregarCurso(materia1);
        alumno1.agregarCurso(materia2);

        alumno1.imprimeCursos();
    }
}
