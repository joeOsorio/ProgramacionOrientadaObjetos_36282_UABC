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
        Cliente[] bdCliente = new Cliente[SIZE_ARR_PEDIDO];
        // Pedido pedido = new Pedido();

        // Declaración de las variables utilizadas en el programa
        String id, direccion, nombre, celular, texto;
        int opcion, noSegimiento, numCliente = 0;
        float peso, largo, ancho, alto;

        System.out.println("Sistema para capturar pedidos");

        // Inicio el ciclo do while para estar mostrando siempre las opciones.
        do {
            // Se despliega información para mostrar las opciones.
            System.out.println("\nMenú");
            System.out.println("\t1 - Agregar bdCliente");
            System.out.println("\t2 - Agregar pedido");
            System.out.println("\t3 - Mostrar Lista de clientes");
            System.out.println("\t0 - Salir");

            // Se captura la opción que desea.
            System.out.print("\tOpción: ");
            opcion = input.nextInt();

            // Limpia el búfer después de ingresar un numero
            input.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\tCrear cliente");
                    System.out.printf("\tNombre:\t");
                    nombre = input.nextLine();
                    System.out.printf("\tDirección:\t");
                    direccion = input.nextLine();
                    System.out.printf("\tCelular:\t");
                    celular = input.next();
                    input.nextLine();

                    bdCliente[numCliente] = new Cliente(celular, direccion, nombre);
                    texto = bdCliente[numCliente].toString();
                    System.out.printf(texto);
                    break;
                case 2:
                    System.out.println("\tAgregar pedido");
                    System.out.printf("\tId (texto):\t");
                    id = input.next();
                    input.nextLine();
                    System.out.printf("\tNumero de segimiento (numero):\t");
                    noSegimiento = input.nextInt();
                    input.nextLine();
                    System.out.printf("\tPeso:\t");
                    peso = input.nextFloat();
                    input.nextLine();
                    System.out.printf("\tLargo:\t");
                    largo = input.nextFloat();
                    input.nextLine();
                    System.out.printf("\tAncho:\t");
                    ancho = input.nextFloat();
                    input.nextLine();
                    System.out.printf("\tAlto:\t");
                    alto = input.nextFloat();
                    input.nextLine();

                    bdCliente[numCliente].setPedido(new Pedido(id, noSegimiento, bdCliente[numCliente].getDireccion(), peso, ancho, largo, alto));

                    texto = bdCliente[numCliente].getPedido().toString();
                    System.out.printf(texto);
                    numCliente += 1;
                    break;
                case 3:
                    System.out.println("\tMostrar clientes y pedidos.");
                    mostrarClientes(bdCliente);
                    break;
                case 0:
                    System.out.println("\tSaliendo del sistema...");
                    break;

                default:
                    System.out.println("\tOpción no válida, intente nuevamente.");
                    break;

            }
            // System.out.println("Presiona cualquier tecla para continuar...");
            // input.next();
            // System.out.flush();
        } while (opcion != 0);

        input.close();
    }

    // Método auxiliar para mostrar los pedidos
    public static void mostrarClientes(Cliente[] clientes) {
        String texto;
        int numC = 0;

        if (clientes == null || clientes.length == 0) {
            System.out.println("\tNo se encontraron clientes.");
            return;
        }

        System.out.println("\tClientes encontrados:");
        for (Cliente cliente : clientes) {
            if (cliente != null) {
                System.out.println("Cliente No:\t" + numC);

                texto = cliente.toString();
                System.out.println(texto + "\n");
                texto = cliente.getPedido().toString();
                System.out.println(texto + "\n");
            }
            numC += 1;
        }
    }
}
