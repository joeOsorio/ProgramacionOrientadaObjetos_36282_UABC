/*-----------------------------------
Practica: 3 Inicialización de objetos precisando los atributos e invocación de métodos.
Nombre: Joshua Osorio 
Materia: Programación Orientada a Objetos
Fecha: Febrero/25/2025 
-----------------------------------*/

import java.util.Scanner;

public class Principal{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		// Creación de un objeto de la clase Libro.
		Libro generico = new Libro();

		// Declaración de las variables utilizadas en el programa y asignarles valores null a los String para que no falle el método de la clase Libro.
		String titulo = null,editorial =null, genero = null, autores = null;
		int opcion, anioPublicacion, numpaginas;
		
		System.out.printf("Sistema para capturar información de libro\n");

		// Inicio el siclo do while para estar mostrando siempre las opciones.
		do{
			// Se despliega información para mostrar las opciones.
			System.out.printf("\nMenú\n");
			System.out.printf("\t1 - Modificar título del libro\n");
			System.out.printf("\t2 - Modificar año del libro de publicación\n");
			System.out.printf("\t3 - Modificar Editorial\n");
			System.out.printf("\t4 - Modificar Géneros\n");
			System.out.printf("\t5 - Modificar Número de páginas\n");
			System.out.printf("\t6 - Modificar Autores\n");
			System.out.printf("\t7 - Mostrar información\n");
			System.out.printf("\t0 - Salir\n");
			// Se captura la opción que desea.
			System.out.printf("\tOpción:\t");
			opcion = input.nextInt();
			
			// Limpia el búfer después de ingresar un numero y asi capturar correctamente cadenas de texto.
			input.nextLine();
			switch (opcion){
			case 1:

				System.out.printf("\tModificar título del libro\t");
				System.out.printf("\n\tTitulo anterior:\t%s\n\t", generico.getTituloLibro());
				titulo = input.nextLine();
				generico.setTituloLibro(titulo);
				System.out.printf("\tTitulo nuevo:\t%s", generico.getTituloLibro());
				break;
			case 2:
				System.out.printf("\tModificar año del libro de publicación:\t");
				System.out.printf("\n\tAño anterior:\t%d\n\t",generico.getAnioPublicacion());
				anioPublicacion = input.nextInt();
				generico.setAnioPublicacion(anioPublicacion);
				System.out.printf("\tAño nuevo:\t%d\n",generico.getAnioPublicacion());
				break;
			case 3:
				System.out.printf("\tModificar Editorial\t");
				System.out.printf("\n\tEditorial anterior:\t%s\n\t", generico.getEditorial());
				editorial = input.nextLine();
				generico.setEditorial(editorial);
				System.out.printf("\tEditorial nueva:\t%s", generico.getEditorial());
				break;
			case 4:
				System.out.printf("\tModificar Géneros\t");
				System.out.printf("\n\tGéneros anterior:\t%s\n\t", generico.getGeneros());
				genero = input.nextLine();
				generico.setGeneros(genero);
				System.out.printf("\tTitulo nuevo:\t%s", generico.getGeneros());
				break;
			case 5:
				System.out.printf("\tModificar Número de páginas:\t");
				System.out.printf("\n\tPaginas anterior:\t%d\n\t",generico.getNumPaginas());
				numpaginas = input.nextInt();
				generico.setNumPaginas(numpaginas);
				System.out.printf("\tpaginas nuevas:\t%d\n",generico.getNumPaginas());
				break;
			case 6:
				System.out.printf("\tModificar Autores\t");
				System.out.printf("\n\tAutores anterior:\t%s\n\t", generico.getAutores());
				autores = input.nextLine();
				generico.setAutores(autores);
				System.out.printf("\tAutores nuevo:\t%s", generico.getAutores());
				break;
			case 7:
				System.out.printf("\tMostrar Información\t");
				System.out.printf("\tTitulo anterior:\t%s", generico.getTituloLibro());
				System.out.printf("\tAño anterior:\t%d\n",generico.getAnioPublicacion());
				System.out.printf("\tEditorial anterior:\t%s", generico.getEditorial());
				System.out.printf("\tGéneros anterior:\t%s", generico.getGeneros());
				System.out.printf("\tPaginas anterior:\t%d\n",generico.getNumPaginas());
				System.out.printf("\tAutores anterior:\t%s", generico.getAutores());
				break;
			case 0:
				System.out.printf("\tSaliendo\t");
				break;
			default:
				System.out.printf("\tOpción no válida, intente nuevamente.:\t");
				break;
			}
		}while(opcion != 0);
	}
}



