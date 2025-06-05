public class Prueba{
	public static void main(String[] arg){
	Alumno primerAlumno = new Alumno();
	Alumno SegundoAlumno = new Alumno();

	primerAlumno.matricula = 1293271;
	primerAlumno.nombreAlumno = "Joshua Osorio Osorio";
	primerAlumno.carrera = "Ingeniero en Computacion";
	primerAlumno.semestre = 7;
	primerAlumno.diaNac= 11;
	primerAlumno.mesNac = 06;
	primerAlumno.anioNac = 2002;	


	SegundoAlumno.matricula = 220073;
	SegundoAlumno.nombreAlumno = "Hugo Rivera";
	SegundoAlumno.carrera = "Ingeniero en Computacion";
	SegundoAlumno.semestre = 5;
	SegundoAlumno.diaNac= 3;
	SegundoAlumno.mesNac = 03;
	SegundoAlumno.anioNac = 2004;

	System.out.println("Nombre:\t" + primerAlumno.nombreAlumno);
	System.out.println("Matricula:\t" + primerAlumno.matricula);
	System.out.println("Carrera:\t" + primerAlumno.carrera);
	System.out.println("Semestre:\t" + primerAlumno.semestre);
	System.out.println("Fecha nacimiento:\t " + primerAlumno.diaNac + "/" + primerAlumno.mesNac + "/"+ primerAlumno.anioNac);
	}		
}