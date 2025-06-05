import java.util.Scanner;

public class Principal{
	public static void main(String [] args){
		
		// iniciarl las 5 cuentas.
		Cuenta Debito = new Cuenta();
		Cuenta Ahorro = new Cuenta();
		Cuenta Cheques = new Cuenta();
		Cuenta Credito = new Cuenta();
		Cuenta Ipotecaria = new Cuenta();
				
		Scanner input = new Scanner(System.in);
		

		// Captura de cuenta de Debito
		//--------------------------------------------------------------------------
		System.out.printf("Capturar info de cuenta de Debito\n");
	
		System.out.printf("\tNombre:\t");
		String nombre = input.nextLine();
		Credito.setNombre(nombre);

		System.out.printf("\tSaldo:\t");
		double montoDeposito = input.nextDouble();
		Credito.setDepositar(montoDeposito);

		System.out.printf("Cuenta\n");

		System.out.printf("\tNombre:\t%s\n",Credito.getNombre());
		System.out.printf("\tsaldo:\t%.2f\n",Credito.getObtenerSaldo());

		// Captura de cuenta de Ahorro
		//--------------------------------------------------------------------------
		System.out.printf("Capturar info de cuenta de Ahorro\n");
	
		System.out.printf("\tNombre:\t");
		input.nextLine();
		nombre = input.nextLine();
		Ahorro.setNombre(nombre);

		System.out.printf("\tSaldo:\t");
		montoDeposito = input.nextDouble();
		Ahorro.setDepositar(montoDeposito);

		System.out.printf("Cuenta\n");

		System.out.printf("\tNombre:\t%s\n",Ahorro.getNombre());
		System.out.printf("\tsaldo:\t%.2f\n",Ahorro.getObtenerSaldo());

		// Captura de cuenta de Cheques
		//--------------------------------------------------------------------------
		System.out.printf("Capturar info de cuenta de Cheques\n");
	
		System.out.printf("\tNombre:\t");
		input.nextLine();
		nombre = input.nextLine();
		Cheques.setNombre(nombre);

		System.out.printf("\tSaldo:\t");
		montoDeposito = input.nextDouble();
		Cheques.setDepositar(montoDeposito);

		System.out.printf("Cuenta\n");

		System.out.printf("\tNombre:\t%s\n",Cheques.getNombre());
		System.out.printf("\tsaldo:\t%.2f\n",Cheques.getObtenerSaldo());

		// Captura de cuenta de Credito
		//--------------------------------------------------------------------------
		System.out.printf("Capturar info de cuenta de Credito\n");
	
		System.out.printf("\tNombre:\t");
		input.nextLine();
		nombre = input.nextLine();
		Credito.setNombre(nombre);

		System.out.printf("\tSaldo:\t");
		montoDeposito = input.nextDouble();
		Credito.setDepositar(montoDeposito);

		System.out.printf("Cuenta\n");

		System.out.printf("\tNombre:\t%s\n",Credito.getNombre());
		System.out.printf("\tsaldo:\t%.2f\n",Credito.getObtenerSaldo());

		// Captura de cuenta de Ipotecaria
		//--------------------------------------------------------------------------
		System.out.printf("Capturar info de cuenta de Ipotecaria\n");
	
		System.out.printf("\tNombre:\t");
		input.nextLine();
		nombre = input.nextLine();
		Ipotecaria.setNombre(nombre);

		System.out.printf("\tSaldo:\t");
		montoDeposito = input.nextDouble();
		Ipotecaria.setDepositar(montoDeposito);

		System.out.printf("Cuenta\n");

		System.out.printf("\tNombre:\t%s\n",Ipotecaria.getNombre());
		System.out.printf("\tsaldo:\t%.2f\n",Ipotecaria.getObtenerSaldo());

	}

}