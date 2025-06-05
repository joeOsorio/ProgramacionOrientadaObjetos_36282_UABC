public class Cuenta{

	private String nombre;
	private double saldo;
	
	public void setDepositar(double montoDeposito){saldo += montoDeposito;}

	public double getObtenerSaldo(){return saldo;}
	
	public void setNombre(String nombre){this.nombre = nombre;}

	public String getNombre(){return nombre;}
}