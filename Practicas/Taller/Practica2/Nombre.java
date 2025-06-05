public class Nombre {
    public static void main(String[] args) {
	Temperatura nisan1= new Temperatura();
	Temperatura nisan2= new Temperatura();
	
	nisan1.marca= "Nissan";
	nisan1.modelo = "Versa";
	nisan1.transmision = "manual de 5 vel";
	nisan1.frenos = "ABS EDB y BA y control dinámico vehicular (VDC)";
	nisan1.sisAudio = "AM/FM/AUX/Bluetooth";
	nisan1.color = "Gris Lunar";

	nisan1.motor = 1.6;
	nisan1.precio= 380000;

	nisan1.anio = 2024;
	nisan1.potencia= 118;
	nisan1.torque= 110;
	

	System.out.println("Marca:\t" + nisan1.marca);
	System.out.println("Modelo:\t" + nisan1.modelo);
	System.out.println("Transmision:\t" + nisan1.transmision);
	System.out.println("Frenos:\t"+nisan1.frenos);
	System.out.println("Sistema de audio:\t" +nisan1.sisAudio);
	System.out.println("Color:\t" + nisan1.color);
	

	System.out.println("Motor:\t" + nisan1.motor); 
	System.out.println("Precio:\t" + nisan1.precio);

	System.out.println("Año:\t" +nisan1.anio);
	System.out.println("Potencia:\t" + nisan1.potencia);
	System.out.println("Torque:\t" + nisan1.torque);
	
	
    }
}