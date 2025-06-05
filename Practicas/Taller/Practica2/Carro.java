public class Carro{
	String marca, modelo, transmision, frenos, sisAudio, color;
	double motor, precio;
	int anio, potencia, torque;
	
	float calcularPresio(int interes){
		return ((float)precio - (float)(precio * interes));
	}
}