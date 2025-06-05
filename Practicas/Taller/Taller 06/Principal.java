/*-----------------------------------
Practica: 6 Gestión y manipulación de arreglos de objetos en Java.
Nombre: Joshua Osorio 
Materia: Programación Orientada a Objetos
Fecha: Marzo/20/2025 
-----------------------------------*/

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        final int SIZE_ARR_PEDIDO = 4; // Size of array.

        Scanner input = new Scanner(System.in);

        // Creación de un objeto de 
        // Pedido pedido = new Pedido();
        // Declaración de las variables utilizadas en el programa
        String primerNombre, segundoNombre, primerApellido, segundoApellido;
        double salario;
        int opcion;
        float peso, largo, ancho, alto;

        System.out.println("Capturar empleado");

        // Inicio el ciclo do while para estar mostrando siempre las opciones.
        do {
            // Se despliega información para mostrar las opciones.
            System.out.println("\nMenú");
            System.out.println("\t1 - Primer nombre ");
            System.out.println("\t2 - Segundo nombre");
            System.out.println("\t3 - Primer apellido");
            System.out.println("\t4 - Segundo apellido");
            System.out.println("\t5 - Salario");
            System.out.println("\t6 - Numero de empleado");
            System.out.println("\t7 - Mostrar to scring de ambas clases");
            System.out.println("\t0 - Salir");

            // Se captura la opción que desea.
            System.out.print("\tOpción: ");
            opcion = input.nextInt();

            // Limpia el búfer después de ingresar un numero
            input.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\tCapturar primer nombre ");
                    System.out.printf("\tPrimer Nombre:\t");
                    primerNombre = input.nextLine();
                    System.out.printf("\tNombre capturado:\t");
                    break;
                case 2:
                    System.out.println("\tCapturar segundo nombre ");
                    System.out.printf("\tSegundo Nombre:\t");
                    primerNombre = input.nextLine();
                    System.out.printf("\tNombre capturado:\t");
                    break;
                case 3:
                    System.out.println("\tCapturar primer apellido ");
                    System.out.printf("\tPrimer apellido:\t");
                    primerNombre = input.nextLine();
                    System.out.printf("\tApellido capturado:\t");
                    break;
                case 4:
                    System.out.println("\tCapturar segundo nombre ");
                    System.out.printf("\tSegundo apellido:\t");
                    primerNombre = input.nextLine();
                    System.out.printf("\tapellido capturado:\t");
                    break;
                case 5:
                    System.out.println("\tCapturar salario  ");
                    System.out.printf("\tSalario :\t");
                    primerNombre = input.nextLine();
                    System.out.printf("\tSalario Capturado:\t");
                    break;
                case 6:
                    System.out.println("\tCapturar numero de empleado  ");
                    System.out.printf("\tNo. empleado :\t");
                    primerNombre = input.nextLine();
                    System.out.printf("\tCapturado:\t");
                case 7:
                    System.out.println("\tinformacion capturada   ");
                    System.out.printf("\t to S :\t");
                    primerNombre = input.nextLine();
                    System.out.printf("\tCapturado:\t");
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
}
