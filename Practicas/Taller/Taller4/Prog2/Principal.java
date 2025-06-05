/*-----------------------------------------------------
-Materia: Programación Orientada a Objetos
-Taller: 4. Ejercicio 2 Carro.
-Nombre: Joshua Osorio Osorio
-Profesor:Itzel Barriba Cazares


Ejercicio #2
Haz el modelado y el código de una clase Carro la cual debe contener los siguientes atributos
año_modelo: este campo guarda el año del carro
marca: este campo guarda el nombre de la marca del carro
velocidad: este campo guarda la velocidad actual del carro (en entero)
Adicionalmente la clase debe contener los siguientes constructores y métodos
Un constructor que acepte inicializar los atributos de año_modelo y marca.
un getter para cada atributo.
un método llamado acelerar en donde cada vez que se llame incremente la velocidad en 5
un método llamado frenar donde cada vez que se invoque disminuya la velocidad en 5
Crea un programa en donde creés un objeto de tipo Carro, y mandes llamar 5 veces el método de
acelerar, después de cada llamada imprime la velocidad del carro, finalmente manda llamar 3 veces
el método de frenar e imprime la velocidad del carro.



-----------------------------------------------------*/

// Con el asterisco se trae todo las funciones de util.
import java.util.Scanner;


public class Principal{
	public static void main(String [] arg){
	Scanner input = new Scanner(System.in);
	

	// Declaramos las variables que utilizaremos que son 3 de prueba.
	System.out.printf("\nCreación de empleado con los 4 atributos\n");
	Carro carro1 = new Carro(2020, "NISSA", 0);
	Carro carro2 = new Carro(2019,"NISSAN",40);
	Carro carro3 = new Carro(2008, "HONDA", 80);

	// Mostramos la informacion de los 3 carros.
	System.out.printf("\n\tInformacion del carro 1\n");	
	System.out.printf("\t\t\nAño o modelo: %d", carro1.getAnioModelo());
	System.out.printf("\n\t\tMarca: %s", carro1.getMarca());
	System.out.printf("\n\t\tVelocidad: %.2f", carro1.getVelocidad());

	System.out.printf("\tInformacion del carro 2\n");	
	System.out.printf("\t\t\nAño o modelo: %d", carro2.getAnioModelo());
	System.out.printf("\n\t\tMarca: %s", carro2.getMarca());
	System.out.printf("\n\t\tVelocidad: %.2f", carro2.getVelocidad());

	System.out.printf("\n\tInformacion del carro 3 \n");	
	System.out.printf("\t\t\nAño o modelo: %d", carro3.getAnioModelo());
	System.out.printf("\n\t\tMarca: %s", carro3.getMarca());
	System.out.printf("\n\t\tVelocidad: %.2f", carro3.getVelocidad());

	// Se realizan los 5 inclrementos en la velocidad.
	System.out.printf("\nAcelerar 5 veces el carro 1");
	System.out.printf("\n\tAceleracion 1:\n");
	// Se utiliza el getVelocidad dentro de la funcion por practicidad.
	carro1.acelerar(carro1.getVelocidad());	
	System.out.printf("\n\t\tVelocidad: %.2f", carro1.getVelocidad());
	System.out.printf("\n\tAceleracion 2:\n");
	carro1.acelerar(carro1.getVelocidad());	
	System.out.printf("\n\t\tVelocidad: %.2f", carro1.getVelocidad());
	System.out.printf("\n\tAceleracion 3:\n");
	carro1.acelerar(carro1.getVelocidad());	
	System.out.printf("\n\t\tVelocidad: %.2f", carro1.getVelocidad());
	System.out.printf("\n\tAceleracion 4:\n");
	carro1.acelerar(carro1.getVelocidad());	
	System.out.printf("\n\t\tVelocidad: %.2f", carro1.getVelocidad());
	System.out.printf("\n\tAceleracion 5:\n");
	carro1.acelerar(carro1.getVelocidad());	
	System.out.printf("\n\t\tVelocidad: %.2f", carro1.getVelocidad());
	
	// Se realiza el decremento de la velocidad con la funcion frenar de 5 unidades de velocidad.
	System.out.printf("\nFrenar 3 veces el carro 1");
	System.out.printf("\n\tFrenada 1:\n");
	carro1.frenar(carro1.getVelocidad());	
	System.out.printf("\n\t\tVelocidad: %.2f", carro1.getVelocidad());
	System.out.printf("\n\tFrenada 2:\n");
	carro1.frenar(carro1.getVelocidad());	
	System.out.printf("\n\t\tVelocidad: %.2f", carro1.getVelocidad());
	System.out.printf("\n\tFrenada 3:\n");
	carro1.frenar(carro1.getVelocidad());	
	System.out.printf("\n\t\tVelocidad: %.2f", carro1.getVelocidad());
	}
}



























