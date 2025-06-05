public class Carro{
	
	// Atributos de la clase
	private int anioModelo;
	private String marca;
	private double velocidad;
	// Metodos SET
	public void setAnioModelo(int anioModelo){this.anioModelo = anioModelo;}
	public void setMarca(String marca){this.marca = marca;}
	public void setVelocidad(double  velocidad){this.velocidad = velocidad;}
	// Metodos GET
	public int getAnioModelo(){return anioModelo;}
	public String getMarca(){return marca;}
	public double  getVelocidad(){return velocidad;}
	/*-----------------------------------Construtures-----------------------------------*/ 
	// Un constructor que pueda inicializar los atributos anioModelo, marca y velocidad.
	public Carro(int anioModelo, String marca, double  velocidad){
		this.anioModelo = anioModelo;
		this.marca = marca;
		this.velocidad = velocidad;}
	// Metodo para acelerar incrementa 5 unidades la velocidad.
	public void  acelerar(double velocidad ){this.velocidad = velocidad + 5;}
	// Metodo para frenar decrementa la velocidad 5 unidades a la velocidad.
	public void  frenar(double velocidad ){this.velocidad = velocidad - 5;}
}