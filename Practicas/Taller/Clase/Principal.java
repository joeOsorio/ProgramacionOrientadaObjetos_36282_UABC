public class Principal{
	public static void main(String []args){
		String[] mes = {"Enero", "Febrero", "Marzo", "Abril","Mayo","Junio","Julio", "Agosto", "Septiempre", "Octubre", "Noviembre", "Diciembre"};
		int [] diasMes ={31,28,31,30,31,30,31,31,30,31,30,31};
		int i = 0;
		int suma = 0;
	
		for(i = 0; i<12; i++){
			System.out.printf("\nEl mes de "+ mes[i] + " tiene " + diasMes[i] + " dias");
			suma += diasMes[i];
		}
		System.out.printf("\nLa suma da un total de:\t"+ suma);
		System.out.printf("\n\nOrden inverso");
		for(i = 11; i>=0; i--){
			System.out.printf("\nEl mes de "+ mes[i] + " tiene " + diasMes[i] + " dias");
			suma -= diasMes[i];
		}
		System.out.printf("\nLa suma da un total de:\t"+ suma);	

		System.out.printf("\n\nAcceder a algunos elementos");
		for(i = 0; i<12; i+= 2){
			System.out.printf("\nEl mes de "+ mes[i] + " tiene " + diasMes[i] + " dias");
		}
		System.out.printf("\nLa suma da un total de:\t"+ suma);
		//int tam = 
		System.out.printf("\n\nSon "+ mes.length + " meses");


	}
}
