/*

Wireless Soluciones, Inc., es una empresa que vende teléfonos celulares y servicios inalámbricos. Usted
es un programador del departamento de tecnología de la información (TI) de la empresa y su equipo está
diseñando un programa para administrar todos los teléfonos celulares que están en inventario. Se le ha
pedido que diseñe una clase que represente un teléfono celular. Cree la clase CellPhone con sus
respectivos atributos y métodos aplicando encapsulamiento de datos. Además, diseñe el diagrama UML
de la clase.
La clase CellPhone será utilizada por varios programas que su equipo está desarrollando. Para realizar
una prueba simple de la clase, escriba el programa respectivo solicitando al usuario los elementos
correspondientes.

*/

/*-----------------------------------
Practica 4: Diseñar clases para modelar el estado y comportamiento aplicando
encapsulamiento.
Nombre: Joshua Osorio 
Materia: Programación Orientada a Objetos
Fecha: Febrero/27/2025 
-----------------------------------*/
import java.util.Scanner;

public class Principal{

	public static void main(String [] arg){
		// Se inicializa clases
		Scanner input = new Scanner(System.in);
		CellPhone generico = new CellPhone("Iphone", "Xs", "Rojo", "Iris x", 1600);
		
		// Declaracion de variables
	
		String marca,modelo,color, procesador;
		int precio, opcion;

		// Inicio el siclo do while para estar mostrando simpre las opciones.
		do{
			// Se despliega información para mostrar las opciones.
			System.out.flush();
			System.out.printf("\n\n\tSistema para capturar informacion de un telefono\n");
			System.out.println("\n\t------------Menú------------\n");
			System.out.println("\t1 - Modificar marca");
			System.out.println("\t2 - Modificar modelo");
			System.out.println("\t3 - Modificar color");
			System.out.println("\t4 - Modificar procesador");
			System.out.println("\t5 - Modificar precio");
			System.out.println("\t6 - Mostrar información");
			System.out.println("\t0 - Salir\n");
		
			// Se catura la opcion que desea.
			System.out.printf("\tOpción:\t");
			opcion = input.nextInt();

			// Evaluar la opcion para ingresar a la opcion deseada.
			input.nextLine();
			switch (opcion){
				case 1:
					System.out.println("\n\n\t\tModificar marca\t");
					System.out.printf("\t\tAnterior:\t%s\n", generico.getMarca());
					System.out.printf("\t\tMarca:\t");
					marca = input.nextLine();
					generico.setMarca(marca);
					System.out.printf("\t\tCambio a:\t%s", generico.getMarca());	
					break;
				case 2:
					
					System.out.println("\n\n\t\tModificar modelo\t");
					System.out.printf("\t\tAnterior:\t%s\n", generico.getModelo());
					System.out.printf("\t\tmodelo:\t");
					modelo = input.nextLine();
					generico.setModelo(modelo);
					System.out.printf("\t\tCambio a:\t%s", generico.getModelo());
					break;
				case 3:
					System.out.println("\n\n\t\tModificar color\t");
					System.out.printf("\n\t\tAnterior:\t%s\n", generico.getColor());
					System.out.printf("\t\tColor:\t");
					color = input.nextLine();
					generico.setColor(color);
					System.out.printf("\t\tCambio a:\t%s", generico.getColor());
					break;
				case 4:
					System.out.println("\n\n\t\tModificar procesador\t");
					System.out.printf("\n\t\tAnterior:\t%s\n", generico.getProcesador());
					System.out.printf("\t\tProcesador:\t");
					procesador = input.nextLine();
					generico.setProcesador(procesador);
					System.out.printf("\t\tCambio a:\t%s", generico.getProcesador());
					break;
				case 5:
					System.out.println("\n\n\t\tModificar precio:\t");
					System.out.printf("\n\t\tAnterior:\t%d\n\t",generico.getPrecio());
					System.out.printf("\tPrecio:\t");
					precio = input.nextInt();

					generico.setPrecio(precio);
					System.out.printf("\t\tnuevo:\t%d\n",generico.getPrecio());
					break;
				case 6:
					System.out.printf("\t\tMostrar Informacion\t\n");

					System.out.printf("\t\tMarca:\t%s\n", generico.getMarca());
					System.out.printf("\t\tModelo:\t%s\n", generico.getModelo());
					System.out.printf("\t\tColor:\t%s\n", generico.getColor() );
					System.out.printf("\t\tProcesador:\t%s\n", generico.getProcesador());
					System.out.printf("\t\tPrecio:\t%d\n", generico.getPrecio());
					
					
					break;
				case 0:
					// Opcion para salir del menu mustra mensaje y finaliza programa.
					System.out.printf("\tSaliendo\t");
					break; 
				default:
					// Solo sale del siclo si se ingresa un 0.
					System.out.printf("\tOpción no válida, intente nuevamente.\t");
					break;
			}
		}while(opcion != 0);	





	}
}