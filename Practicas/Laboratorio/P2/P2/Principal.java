/*-----------------------------------
Practica: 3 Inicialización de objetos precisando los atributos e invocación de métodos.
Nombre: Joshua Osorio 
Materia: Programación Orientad	a a Objetos
Fecha: Febrero/25/2025 
-----------------------------------*/

import java.util.Scanner;

public class Principal{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		Carro generico = new Carro();

		// Se declaran las variables tipo string en null para poder realizar operaciones.
		String primerNombre = null, segundoNombre = null, primerApellido = null,segundoApellido = null;
		int dia,mes,anio, salarioSemanal,opcion;

		// Inicio el siclo do while para estar mostrando siempre las opciones.
		do{
			// Se despliega información para mostrar las opciones.
			System.out.flush();
			System.out.printf("\n\n\tSistema para capturar información de un Empleado\n");
			System.out.println("\n\t------------Menú------------\n");
			System.out.println("\t1 - Modificar primer nombre");
			System.out.println("\t2 - Modificar segundo nombre");
			System.out.println("\t3 - Modificar apellido paterno");
			System.out.println("\t4 - Modificar apellido materno");
			System.out.println("\t5 - Modificar fecha de nacimiento");
			System.out.println("\t6 - Modificar salario semanal");
			System.out.println("\t7 - Mostrar sueldo mensual");
			System.out.println("\t8 - Mostrar información");
			System.out.println("\t0 - Salir\n");
		
			// Se captura la opción que desea.
			System.out.printf("\tOpción:\t");
			opcion = input.nextInt();

			// Evaluar la opción para ingresar a la opción deseada.
			input.nextLine();
			switch (opcion){
				case 1:
					System.out.println("\n\n\t\tModificar primer nombre\t");
					System.out.printf("\t\tAnterior:\t%s\n", primerNombre);
					System.out.printf("\t\tNombre:\t");
					primerNombre = input.nextLine();
					generico.setNombreCompleto(primerNombre, segundoNombre, primerApellido,segundoApellido);
					System.out.printf("\t\tCambio a:\t%s", primerNombre);	
					System.out.printf("\n\t\tNombre completo cambio a:\t%s", generico.getNombreCompleto());
					break;
				case 2:
					
					System.out.println("\n\n\t\tModificar segundo nombre\t");
					System.out.printf("\t\tAnterior:\t%s\n", segundoNombre);
					System.out.printf("\t\tNombre:\t");
					segundoNombre = input.nextLine();
					generico.setNombreCompleto(primerNombre, segundoNombre, primerApellido,segundoApellido);
					System.out.printf("\t\tCambio a:\t%s", segundoNombre);
					System.out.printf("\n\t\tNombre completo cambio a:\t%s", generico.getNombreCompleto());
					break;
				case 3:
					System.out.println("\n\n\t\tModificar apellido paterno\t");
					System.out.printf("\n\t\tAnterior:\t%s\n", primerApellido);
					System.out.printf("\t\tApellido:\t");
					primerApellido = input.nextLine();
					generico.setNombreCompleto(primerNombre, segundoNombre, primerApellido,segundoApellido);
					System.out.printf("\t\tCambio a:\t%s", primerApellido);
					System.out.printf("\n\t\tNombre completo cambio a:\t%s", generico.getNombreCompleto());
					break;
				case 4:
					System.out.println("\n\n\t\tModificar apellido materno\t");
					System.out.printf("\n\t\tAnterior:\t%s\n", segundoApellido);
					System.out.printf("\t\tApellido:\t");
					segundoApellido = input.nextLine();
					generico.setNombreCompleto(primerNombre, segundoNombre, primerApellido,segundoApellido);
					System.out.printf("\t\tCambio a:\t%s", segundoApellido);
					System.out.printf("\n\t\tNombre completo cambio a:\t%s", generico.getNombreCompleto());
					break;
				case 5:
					System.out.println("\n\n\t\tModificar fecha de nacimiento:\t");
					System.out.printf("\n\t\tAnterior:\t%d / %d / %d\n\t",generico.getDia(), generico.getMes(), generico.getMes());
					
					System.out.printf("\tDia:\t");
					dia = input.nextInt();
					System.out.printf("\t\tMes:\t");
					mes = input.nextInt();
					System.out.printf("\t\tAño:\t");
					anio = input.nextInt();

					generico.setDia(dia);
					generico.setMes(mes);
					generico.setAnio(anio);

					System.out.printf("\t\tnueva:\t%d / %d / %d\n",generico.getDia(), generico.getMes(), generico.getAnio());
					break;
				case 6:
					System.out.println("\n\n\tModificar salario semanal:\t");
					System.out.printf("\t\tAnterior:\t%d \n\t",generico.getSalarioSemanal());
					System.out.printf("\tSalario:\t");
					salarioSemanal = input.nextInt();
					generico.setSalarioSemanal(salarioSemanal);
					System.out.printf("\t\tnuevo:\t%d\n",generico.getSalarioSemanal());
					break;
				case 7:
					System.out.println("\n\n\t\tMostrar salario mensual\t");
					if(generico.getSalarioSemanal() != 0){
						System.out.printf("\t\tSalario mensual:\t%d", generico.getSalarioMensual());	
					}else{
						System.out.println("\t\tFavor de capturar antes salario semanal\t");
					}
					break;
				case 8:
					System.out.printf("\t\tMostrar Información\t\n");
					System.out.printf("\t\tNombre completo:\t%s\n", generico.getNombreCompleto());
					System.out.printf("\t\tFecha de nacimiento:\t%d / %d / %d\n",generico.getDia(), generico.getMes(), generico.getMes());
					System.out.printf("\t\tSalario semanal:\t%d\n", generico.getSalarioSemanal());
					System.out.printf("\t\tSalario mensual:\t%d\n", generico.getSalarioMensual());
					break;
				case 0:
					// Opción para salir del menu muestra mensaje y finaliza programa.
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