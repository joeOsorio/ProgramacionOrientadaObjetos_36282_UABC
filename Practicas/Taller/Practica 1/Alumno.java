// Definicion de la clase Alumno

public class Alumno{
	double matricula;
	String nombreAlumno;
	String carrera;
	int semestre, diaNac, mesNac, anioNac;
	
	int calcularEdad(int anioNac){
		return 2024 - anioNac;
	}

}