/*-----------------------------------------------------
-Materia: Programación Orientada a Objetos
-Taller: 4
-Nombre: Joshua Osorio Osorio
-Profesor:Itzel Barriba Cazares


Ejercicio #1
Haz el modelado de una clase Empleado el cual contiene los siguientes atributos:
nombre: hace referencia a un objeto de tipo String y guarda el nombre del empleado.
matrícula: es un entero y guarda la matrícula del empleado
departamento: hace referencia a un objeto tipo String y guarda el departamento que trabaja
el empleado.
posición: es una referencia de un objeto tipo String y guarda en que trabaja el empleado(titulo)
También la clase debe tener los siguientes constructores

1. un constructor que pueda inicializar los atributos de nombre, matrícula, departamento y posición.
2. un constructor que pueda inicializar los atributos de nombre y matrícula
3. un constructor sin argumentos, donde asigne la cadena vacía para nombre, departamento y posición y en 0 la matrícula.
Haz un método mutador(setter) y accesor(getter) para cada atributo.
Haz un programa que creé 3 objetos de la clase Empleado e imprima la siguiente tabla utilizando los setters y getters

Nombre 	    |Matrícula |Departamento |Posición
------------------------------------------------------
Susan Mayers|4789      |Finanzas     |Vice presidente
Mark Jhones |4848      |IT 	     |Programador
Joy Rogers  | 5031     |Manofactura  |Ingeniero


-----------------------------------------------------*/

	// Con el asterisco se trae todo las funciones de util.
import java.util.Scanner;


public class Principal{
	public static void main(String [] arg){
	Scanner input = new Scanner(System.in);

	String nombre, departamento, posicion;
	int matricula;
	
	System.out.printf("\nCreación de empleado con los 4 atributos\n");
	Empleado empleado1 = new Empleado("Susan Mayers", 4789, "Finanzas", "Vice presidente");

	System.out.printf("\tInformacion\n");	
	System.out.printf("\t\t\nNombre: %s", empleado1.getNombre());
	System.out.printf("\n\t\tMatricula: %d", empleado1.getMatricula());
	System.out.printf("\n\t\tDepartamento: %s", empleado1.getDepartamento());
	System.out.printf("\n\t\tPosición: %s", empleado1.getPosicion());

	System.out.printf("\nCreación de empleado con los atributos de nombre y matricula");
	Empleado empleado2 = new Empleado("Mark Jhones", 4848);

	System.out.printf("\n\tInformacion\n");	
	System.out.printf("\n\t\tNombre: %s", empleado2.getNombre());
	System.out.printf("\n\t\tMatricula: %d", empleado2.getMatricula());
	System.out.printf("\n\t\tDepartamento: %s", empleado2.getDepartamento());
	System.out.printf("\n\t\tPosición: %s", empleado2.getPosicion());

	System.out.printf("\nCapturar la informacion restante\n");
	System.out.printf("\t\tDepartamento:\t");
	departamento = input.nextLine();
	empleado2.setDepartamento(departamento);
	System.out.printf("\t\tPosicón:\t");
	posicion = input.nextLine();
	empleado2.setPosicion(posicion);

	System.out.printf("\n creación de empleado sin ningun argumento en el constructor\n");
	Empleado empleado3 = new Empleado();

	System.out.printf("\tInformacion.\n");	
	System.out.printf("\n\t\tNombre: %s", empleado2.getNombre());
	System.out.printf("\n\t\tMatricula: %d", empleado2.getMatricula());
	System.out.printf("\n\t\tDepartamento: %s", empleado2.getDepartamento());
	System.out.printf("\n\t\tPosición: %s", empleado2.getPosicion());

	System.out.printf("\nCapturar la informacion restante\n");
	System.out.printf("\t\tNombre\t");
	nombre = input.nextLine();
	empleado3.setNombre(nombre);
	System.out.printf("\t\tMatricula:\t");
	matricula = input.nextInt();
	empleado3.setMatricula(matricula);
	input.nextLine();
	System.out.printf("\t\tDepartamento:\t");
	departamento = input.nextLine();
	empleado3.setDepartamento(departamento);
	System.out.printf("\t\tPosicón:\t");
	posicion = input.nextLine();
	empleado3.setPosicion(posicion);

	System.out.printf("Impresion de tabla.");

	System.out.printf("\n|\t   Nombre\t   |\tMatrícula|\tDepartamento\t|\tPosición\t|");
	System.out.printf("\n|\t%s\t|\t%d\t|\t%s\t|\t%s\t|", empleado1.getNombre(),empleado1.getMatricula(), empleado1.getDepartamento(), empleado1.getPosicion() );
	System.out.printf("\n|\t%s\t|\t%d\t|\t%s\t|\t%s\t|", empleado2.getNombre(),empleado2.getMatricula(), empleado2.getDepartamento(), empleado2.getPosicion() );
	System.out.printf("\n|\t%s\t|\t%d\t|\t%s\t|\t%s\t|", empleado3.getNombre(),empleado3.getMatricula(), empleado3.getDepartamento(), empleado3.getPosicion() );
	}
}



























