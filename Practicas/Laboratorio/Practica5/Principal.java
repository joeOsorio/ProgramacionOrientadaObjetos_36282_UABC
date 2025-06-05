/*************************************************************
 *                       PRÁCTICA 5                          *
 *                MANEJO DE ARREGLOS EN JAVA                 *
 *                                                           *
 * Descripción:                                              *
 * Aplicar conceptos de manejo de arreglos en Java mediante  *
 * la creación, modificación, operación y manipulación de    *
 * elementos de arreglos.                                    *
 *                                                           *
 * Autor: Joshua Osorio                                      *
 * Fecha: 21 de Febrero de 2025                              *
 *************************************************************/


import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] numerosEmpleados = new int[100];
        double[] tarifaPago = new double[25];
        float[] millas = new float[14];
        char[] letras = new char[1000];
        
        int opcion;
        do {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Inicializar arreglos");
            System.out.println("2. Modificar elemento");
            System.out.println("3. Mostrar suma de elementos");
            System.out.println("4. Mostrar promedio");
            System.out.println("5. Encontrar valores extremos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    inicializarArreglos(numerosEmpleados, tarifaPago, millas, letras, scanner);
                    break;
                case 2:
                    modificarElemento(numerosEmpleados, tarifaPago, millas, letras, scanner);
                    break;
                case 3:
                    mostrarSuma(numerosEmpleados, tarifaPago, millas);
                    break;
                case 4:
                    mostrarPromedio(numerosEmpleados, tarifaPago, millas);
                    break;
                case 5:
                    mostrarExtremos(numerosEmpleados, tarifaPago, millas);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
        } while (opcion != 6);
    }
    
    public static void inicializarArreglos(int[] numeros, double[] tarifas, float[] distancias, char[] caracteres, Scanner scanner) {
        System.out.println("Inicializando arreglos...");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número entero para la posición " + i + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada inválida. Ingrese un número entero: ");
                scanner.next();
            }
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < tarifas.length; i++) {
            System.out.print("Ingrese un valor decimal para la tarifa en la posición " + i + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Entrada inválida. Ingrese un valor decimal: ");
                scanner.next();
            }
            tarifas[i] = scanner.nextDouble();
        }
        for (int i = 0; i < distancias.length; i++) {
            System.out.print("Ingrese un valor decimal para la distancia en la posición " + i + ": ");
            while (!scanner.hasNextFloat()) {
                System.out.print("Entrada inválida. Ingrese un valor decimal: ");
                scanner.next();
            }
            distancias[i] = scanner.nextFloat();
        }
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print("Ingrese un carácter para la posición " + i + ": ");
            String input = scanner.next();
            while (input.length() != 1) {
                System.out.print("Entrada inválida. Ingrese un solo carácter: ");
                input = scanner.next();
            }
            caracteres[i] = input.charAt(0);
        }
    }
    
    public static void modificarElemento(int[] numeros, double[] tarifas, float[] distancias, char[] caracteres, Scanner scanner) {
        System.out.println("Función para modificar elementos aún no implementada completamente.");
    }
    
    public static void mostrarSuma(int[] numeros, double[] tarifas, float[] distancias) {
        int sumaEnteros = 0;
        double sumaDoubles = 0;
        float sumaFloats = 0;
        
        for (int num : numeros) sumaEnteros += num;
        for (double tarifa : tarifas) sumaDoubles += tarifa;
        for (float milla : distancias) sumaFloats += milla;
        
        System.out.println("Suma de enteros: " + sumaEnteros);
        System.out.println("Suma de dobles: " + sumaDoubles);
        System.out.println("Suma de flotantes: " + sumaFloats);
    }
    
    public static void mostrarPromedio(int[] numeros, double[] tarifas, float[] distancias) {
        System.out.println("Función para calcular promedios aún no implementada completamente.");
    }
    
    public static void mostrarExtremos(int[] numeros, double[] tarifas, float[] distancias) {
        System.out.println("Función para encontrar valores extremos aún no implementada completamente.");
    }
}
