public class Temperatura{
	// Variables para realizar las conversiones.
	int c1 = 32;
	double c2 = 5.0/9.0;
	double c3 = 459.67;
	// Atributos de la clase
	private double fTemp;
	// Metodos SET
	public void setFarenheit(double fTemp){this.fTemp = fTemp;}
	// Metodos GET
	public double  getFarenheit(){return fTemp;}
	/*-----------------------------------Construtor-----------------------------------*/ 
	// Constructor que acepta la temperatura en farenheit.
	public Temperatura(double  fTemp){this.fTemp = fTemp;}
	// Metodos get para retornar la temperatura en otra unidad.
	public double  getCelcius(){return (fTemp-c1)*c2;}
	public double  getKelvin(){return (fTemp + c3)*c2;}

}