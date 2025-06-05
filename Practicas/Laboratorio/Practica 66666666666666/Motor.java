public class Motor{
	private int capacidad;
	private int numeroCilindros;
	private int potencia;
	private int torque;

	public Motor(int capacidad, int numeroCilindro, int potencia, int torque){
	this.capacida = capacidad;
	this.numeroCilindros = numeroCilindros;
	this.potencia = potencia;
	this.torque = torque;
	}

	//Metodos setter
	
	public void setCapacidad(int capacidad){
		this.capacidad = capacidad;
	}
	
	public void setNumeroCilindros(int numeroCilindros){
		this.numeroCilindros = numeroCilindros;
	}


	public void setPotencia(int potencia){
		this.potencia = potencia;
	}
	
	public void setTorque(int torque){
		this.torque = torque;
	}

	// Metodos getter
	
	public int getTorque(){
		return torque;
	}

	public int getPotencia(){
		return potencia;
	}

	public int getNumeroCilindros(){
		return numeroCilindros;
	}

	public int getCapacidad(){
		return capacidad;
	}

	piblic String toString(){
		return "Capacidad: " + capacidad + 
		"\nNumero de cilindros: " + numeroCilindros + "\nPotencia: " + potencia + "\nTorque: " + torque;
	}

	

}