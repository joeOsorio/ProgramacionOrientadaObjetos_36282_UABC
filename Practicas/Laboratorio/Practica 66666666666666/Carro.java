class Carro{
	private String modelo;
	private Motor motor;
	
	public Carro(String modelo, int capacidad, int numeroCilindros, int potencia, int torque)
	{
		this.modelo = modelo;
		motor = new Motor(capacidad, numeroCilindros, potencia, torque);
		System.out.println("Datos del carro:\n"+ miCarro.toString());
	}
	
	public String getModelo(){
		return modelo;
	}

	public void setModelo(String modelo){
		this.modelo
	}

	public void setMotor(Motor motor){
		this.motor() = motor;
	}


	public String toString(){
		return "Modelo: " + modelo + "/n" + motor.toString();
	}



}