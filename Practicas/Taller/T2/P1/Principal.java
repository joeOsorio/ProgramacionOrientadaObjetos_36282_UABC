import java.util.Scanner;

public class Principal{
	public static void main(String [] args){
		
		// iniciarl los 3 triangulos.
		Triangulo T1 = new Triangulo();
		Triangulo T2 = new Triangulo();
		Triangulo T3 = new Triangulo();
		
		Scanner input = new Scanner(System.in);
		

		// Captura del Primer triangulo
		//--------------------------------------------------------------------------
		System.out.printf("Capturar info del Triangulo 1\n");
		System.out.println("\tCual es el valor de la base:\t");
		double baseT1 = input.nextDouble();
		T1.setBase(baseT1);

		System.out.println("\tCual es el valor de la altura:\t");
		double alturaT1 = input.nextDouble();
		T1.setAltura(alturaT1);

		System.out.println("\tCual es el valor del largo:\t");
		double largoT1 = input.nextDouble();
		T1.setLargo(largoT1);

		// Captura del segundo triangulo
		//--------------------------------------------------------------------------
		
		System.out.printf("Capturar info del Triangulo 2\n");
		System.out.println("\tCual es el valor de la base:\t");
		double baseT2 = input.nextDouble();
		T2.setBase(baseT2);

		System.out.println("\tCual es el valor de la altura:\t");
		double alturaT2 = input.nextDouble();
		T2.setAltura(alturaT2);

		System.out.println("\tCual es el valor del largo:\t");
		double largoT2 = input.nextDouble();
		T2.setLargo(largoT2);
		
		// Captura del tercer triangulo
		//--------------------------------------------------------------------------

		System.out.printf("\tCapturar info del Triangulo 3\n");
		System.out.println("\tCual es el valor de la base:\t");
		double baseT3 = input.nextDouble();
		T3.setBase(baseT3);

		System.out.println("\tCual es el valor de la altura:\t");
		double alturaT3 = input.nextDouble();
		T3.setAltura(alturaT3);

		System.out.println("\tCual es el valor del largo:\t");
		double largoT3 = input.nextDouble();
		T3.setLargo(largoT3);
		//--------------------------------------------------------------------------

		// Impresion de informacion
		//--------------------------------------------------------------------------
		
		//Info T1
		System.out.printf("Triangulo 1\n");

		System.out.printf("\tBase:\t%.2f\n",T1.getBase());
		System.out.printf("\tAltura:\t%.2f\n",T1.getAltura());
		System.out.printf("\tLargo:\t%.2f\n",T1.getLargo());

		System.out.printf("\tArea:\t%.2f\n", T1.getArea(baseT1,alturaT1));
		System.out.printf("\tVolumen:\t%.2f\n", T1.getVolumen(baseT1, alturaT1, largoT1));

		//Info T2
		System.out.printf("Triangulo 2\n");

		System.out.printf("\tBase:\t%.2f\n",T2.getBase());
		System.out.printf("\tAltura:\t%.2f\n",T2.getAltura());
		System.out.printf("\tLargo:\t%.2f\n",T2.getLargo());

		System.out.printf("\tArea:\t%.2f\n", T2.getArea(baseT2,alturaT2));
		System.out.printf("\tVolumen:\t%.2f\n", T2.getVolumen(baseT2, alturaT2, largoT2));

		//Info T3
		System.out.printf("Triangulo 3\n");

		System.out.printf("\tBase:\t%.2f\n",T3.getBase());
		System.out.printf("\tAltura:\t%.2f\n",T3.getAltura());
		System.out.printf("\tLargo:\t%.2f\n",T3.getLargo());

		System.out.printf("\tArea:\t%.2f\n", T3.getArea(baseT3,alturaT3));
		System.out.printf("\tVolumen:\t%.2f\n", T3.getVolumen(baseT3, alturaT3, largoT3));

	}

}