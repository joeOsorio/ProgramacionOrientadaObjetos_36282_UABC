package Taller.Practica5;
import java.util.*;

public class Principal{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar la frase al usuario
        System.out.println("Ingrese una frase:");
        String frase = input.nextLine();
        // Mostrar la longitud de la frase
        System.out.println("Longitud de la frase: " + frase.length());
        // Convertir la frase a mayúsculas y minúsculas
        System.out.println("En mayúsculas: " + frase.toUpperCase());
        System.out.println("En minúsculas: " + frase.toLowerCase());
        // Contar cuántas veces aparece una letra dada
        System.out.println("Ingrese una letra para contar su frecuencia:");
        char letra = input.next().charAt(0);
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces.");

        input.nextLine(); // Limpiar buffer

        // Verificar si la frase empieza y termina con una palabra específica
        System.out.println("Ingrese la palabra para verificar si la frase inicia con ella:");
        String inicio = input.nextLine();
        System.out.println("¿Empieza con \"" + inicio + "\"? " + frase.startsWith(inicio));

        System.out.println("Ingrese la palabra para comprobar si la frase termina con ella:");
        String fin = input.nextLine();
        System.out.println("¿Termina con \"" + fin + "\"? " + frase.endsWith(fin));

        // Reemplazar una palabra en la frase
        System.out.println("Ingrese la palabra a reemplazar:");
        String palabraVieja = input.nextLine();
        System.out.println("Ingrese la nueva palabra:");
        String palabraNueva = input.nextLine();
        System.out.println("Nueva frase: " + frase.replace(palabraVieja, palabraNueva));
    }
}
