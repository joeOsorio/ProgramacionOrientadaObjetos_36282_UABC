/*-----------------------------------------------------
-Materia: Programación Orientada a Objetos
-Taller: Arreglos.
-Nombre: Joshua Osorio Osorio
-Profesor:Itzel Barriba Cazares
-----------------------------------------------------*/

import java.util.Scanner;

public class Principal {

    public static void main(String[] arg) {
        final int ARRAY_SIZE = 4; // Size of array.
        //Create an array.
        int[] numbers = new int[ARRAY_SIZE];
        //Pass the array to the getValueas method.
        getValues(numbers);
        System.out.println("Here are the numbers that you entered:");
        //Pass the array to the showArray method.

        int[] identidad = new int[3];
        identidad = matrizIdentidad(3);
        showArray(identidad);

    }

    private static void getValues(int[] array) {
        // create a Scanner objects for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a series of " + array.length + " numbers.");
        //Read values into the array.
        for (int index = 0; index < array.length; index++) {
            System.out.printf("Enter number " + (index + 1) + ": ");
            array[index] = keyboard.nextInt();
        }
    }

    public static void showArray(int[] array) {
        //Display the array elements.
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }

    public static void matrizIdentidad(int tamanio) {
        int[] matriz = new int[tamanio];
        for (int columna = 0; columna < tamanio; columna++) {
            for (int fila = 0; fila < tamanio; fila++) {
                if (columna == fila) {
                    matriz[columna][fila] = 1;
                }
                matriz[columna][fila] = 0;
            }
        }
        return  = matriz;

    }

}
