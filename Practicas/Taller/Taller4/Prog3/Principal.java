/*-----------------------------------------------------
-Materia: Programación Orientada a Objetos
-Taller: 4. Programa 3 Carro.
-Nombre: Joshua Osorio Osorio
-Profesor:Itzel Barriba Cazares


Ejercicio #3
Haz el modelado y el código de una clase llamada Temperatura esta clase guardará la temperatura
en farenheit y va proveer métodos para convertirla en celsius, kelvin y farenheit, la clase debe contener
los siguientes atribytos
ftemp: un valor doble que guarda la temperatura en farenheit
También debe contener los siguientes métodos y constructores
el constructor debe de aceptar la temperatura en farenheit como un doble
setFarenheit: este método modifica el valor de ftemp
getFarenheit: este método regresa el valor de ftemp
getCelsius: este método regresa el valor de ftemp en celsius
getKelvin: este método regresa el valor de ftemp en Kelvin
Haz un programa donde crees un objeto de la clase Temperatura y conviertas la temperatura 122
Fareneheit a Celsius(50) y Kelvin (323.15)

-----------------------------------------------------*/

// Con el asterisco se trae todo las funciones de util.


public class Principal{
	public static void main(String [] arg){
	// Scanner input = new Scanner(System.in);

	// Declaramos las variables que utilizaremos que son 3 de prueba.
	System.out.printf("\nCreación de temperatura\n");
	Temperatura temp1 = new Temperatura(122);
	Temperatura temp2 = new Temperatura(0);
	Temperatura temp3 = new Temperatura(32);

	// Mostramos la informacion de las 3 temperaturas.
	System.out.printf("\n\tInformacion de la temperatura 1\n");	
	System.out.printf("\n\t\tFarenheit: %.2f", temp1.getFarenheit());
	System.out.printf("\n\t\tCelcius: %.2f", temp1.getCelcius());
	System.out.printf("\n\t\tKelvin: %.2f", temp1.getKelvin());

	System.out.printf("\n\tInformacion de la temperatura 2\n");	
	System.out.printf("\n\t\tFarenheit: %.2f", temp2.getFarenheit());
	System.out.printf("\n\t\tCelcius: %.2f", temp2.getCelcius());
	System.out.printf("\n\t\tKelvin: %.2f", temp2.getKelvin());

	System.out.printf("\n\tInformacion de la temperatura 3\n");	
	System.out.printf("\n\t\tFarenheit: %.2f", temp3.getFarenheit());
	System.out.printf("\n\t\tCelcius: %.2f", temp3.getCelcius());
	System.out.printf("\n\t\tKelvin: %.2f", temp3.getKelvin());
	}
}



























