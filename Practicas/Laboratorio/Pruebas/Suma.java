//Programa que recibe dos números y muestra la suma. 
import java.util.Scanner; 
public class Suma { 
	// el método main 
	public static void main(String[] args) { 
		// crea objeto Scanner para obtener la entrada 
		Scanner entrada = new Scanner(System.in); 
		int numero1; 
		int numero2; 
		int suma; 
		System.out.print("Escriba el primer entero: "); 
		// lee el primer número del usuario 
		numero1 = entrada.nextInt(); 
		// lee el segundo número del usuario 
		System.out.print("Escriba el segundo entero: "); 
		numero2 = entrada.nextInt(); 
		// suma los números, después almacena el total en suma 
		suma = numero1 + numero2; 
		// muestra la suma 
		System.out.printf("La suma es %d%n", suma); 
	} // fin del método main 
}// fin de la claseSuma 