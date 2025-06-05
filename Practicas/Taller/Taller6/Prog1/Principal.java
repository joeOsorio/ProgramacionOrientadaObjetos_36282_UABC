/*-----------------------------------
Practica: 6 Gestión y manipulación de arreglos de objetos en Java.
Nombre: Joshua Osorio 
Materia: Programación Orientada a Objetos
Fecha: Marzo/20/2025 
-----------------------------------*/

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creación de un objeto de la clase Libro
        Libro nuevoLibro = new Libro();
        Biblioteca biblioteca = new Biblioteca();

        // Declaración de las variables utilizadas en el programa
        String titulo, editorial, genero, autores, direccion, encargado;
        int opcion, anioPublicacion, numpaginas;

        System.out.println("Sistema para capturar información de libro");

        // Inicio el ciclo do while para estar mostrando siempre las opciones.
        do {
            // Se despliega información para mostrar las opciones.
            System.out.println("\nMenú");
            System.out.println("\t1 - Modificar nombre de la biblioteca");
            System.out.println("\t2 - Modificar dirección");
            System.out.println("\t3 - Modificar encargado");
            System.out.println("\t4 - Agregar libro");
            System.out.println("\t5 - Buscar por año");
            System.out.println("\t6 - Buscar por autor");
            System.out.println("\t7 - Buscar por título");
            System.out.println("\t8 - Ordenar libros por año");
            System.out.println("\t9 - Ordenar libros por título");
            System.out.println("\t0 - Salir");

            // Se captura la opción que desea.
            System.out.print("\tOpción: ");
            opcion = input.nextInt();

            // Limpia el búfer después de ingresar un numero
            input.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\tModificar nombre de la biblioteca");
                    System.out.printf("\tNombre anterior: %s\n", biblioteca.getNombre());
                    System.out.print("\tIngrese nuevo nombre: ");
                    titulo = input.nextLine();
                    biblioteca.setNombre(titulo);
                    System.out.printf("\tNombre nuevo: %s\n", biblioteca.getNombre());
                    break;

                case 2:
                    System.out.println("\tModificar dirección");
                    System.out.printf("\tDirección anterior: %s\n", biblioteca.getDireccion());
                    System.out.print("\tIngrese nueva dirección: ");
                    direccion = input.nextLine();
                    biblioteca.setDireccion(direccion);
                    System.out.printf("\tDirección nueva: %s\n", biblioteca.getDireccion());
                    break;
                case 3:
                    System.out.println("\tModificar encargado");
                    System.out.printf("\tEncargado anterior: %s\n", biblioteca.getEncargado());
                    System.out.print("\tIngrese nuevo encargado: ");
                    encargado = input.nextLine();
                    biblioteca.setEncargado(encargado);
                    System.out.printf("\tEncargado nuevo: %s\n", biblioteca.getEncargado());
                    break;
                case 4:
                    System.out.println("\tAgregar libro");
                    System.out.printf("\tIngrese título del libro: ");
                    titulo = input.nextLine();
                    nuevoLibro.setTituloLibro(titulo);

                    System.out.printf("\tIngrese año de publicación: ");
                    anioPublicacion = input.nextInt();
                    input.nextLine(); // Limpiar buffer
                    nuevoLibro.setAnioPublicacion(anioPublicacion);

                    System.out.printf("\tIngrese editorial: ");
                    editorial = input.nextLine();
                    nuevoLibro.setEditorial(editorial);

                    System.out.printf("\tIngrese género: ");
                    genero = input.nextLine();
                    nuevoLibro.setGeneros(genero);

                    System.out.printf("\tIngrese número de páginas: ");
                    numpaginas = input.nextInt();
                    input.nextLine(); // Limpiar buffer
                    nuevoLibro.setNumPaginas(numpaginas);

                    System.out.printf("\tIngrese autores: ");
                    autores = input.nextLine();
                    nuevoLibro.setAutores(autores);

                    biblioteca.agregarLibro(nuevoLibro);
                    System.out.println("\tLibro agregado exitosamente.");
                    break;

                case 5:
                    System.out.println("\tBuscar libros por año");
                    System.out.printf("\tIngrese año a buscar: ");
                    anioPublicacion = input.nextInt();


                    Libro[] librosPorAnio = biblioteca.buscarPorAnio(anioPublicacion);
                    mostrarLibros(librosPorAnio);
                    break;

                case 6:
                    System.out.println("\tBuscar libros por autor");
                    System.out.printf("\tIngrese nombre del autor: ");
                    autores = input.nextLine();

                    Libro[] librosPorAutor = biblioteca.buscarPorAutor(autores);
                    mostrarLibros(librosPorAutor);
                    break;

                case 7:
                    System.out.println("\tBuscar libros por título");
                    System.out.printf("\tIngrese título a buscar: ");
                    titulo = input.nextLine();

                    Libro[] librosPorTitulo = biblioteca.buscarPorTitulo(titulo);
                    mostrarLibros(librosPorTitulo);
                    break;

                case 8:
                    System.out.println("\tOrdenar libros por año");
                    biblioteca.ordenarLibrosPorAnio(biblioteca.getLibrosDisponibles());
                    System.out.println("\tLibros ordenados por año.");
                    break;

                case 9:
                    System.out.println("\tOrdenar libros por título");
                    biblioteca.ordenarLibrosPorTitulo(biblioteca.getLibrosDisponibles());
                    System.out.println("\tLibros ordenados por título.");
                    break;

                case 0:
                    System.out.println("\tSaliendo del sistema...");
                    break;

                default:
                    System.out.println("\tOpción no válida, intente nuevamente.");
                    break;
            }
        } while (opcion != 0);

        input.close();
    }

    // Método auxiliar para mostrar libros
    public  static void mostrarLibros(Libro[] libros) {
        if (libros == null || libros.length == 0) {
            System.out.println("\tNo se encontraron libros.");
            return;
        }

        System.out.println("\tLibros encontrados:");
        for (Libro libro : libros) {
            if (libro != null) {
                System.out.printf("\tTítulo: %s, Autor: %s, Año: %d\n",
                        libro.getTituloLibro(),
                        libro.getAutores(),
                        libro.getAnioPublicacion());
            }
        }
    }
}
