

/*-----------------------------------
Practica 4: Diseñar clases para modelar el estado y comportamiento aplicando
encapsulamiento.
Nombre: Joshua Osorio 
Materia: Programación Orientada a Objetos
Fecha: Febrero/27/2025 
-----------------------------------*/

public class CellPhone{
	
	private String marca;
	private String modelo;
	private String color;
	private String procesador;
	private int precio;	
	// Métodos setter para modificar los atributos del telefono

	public void setMarca(String marca) { this.marca = marca; }
	public void setModelo(String modelo) { this.modelo = modelo; }
	public void setColor(String color) { this.color = color; }
	public void setProcesador(String procesador) { this.procesador = procesador; }
	
	public void setPrecio(int precio) { this.precio = precio; }
	
	

	//Métodos getter para obtener los atributos del empleado

	public String getMarca() { return marca; }
	public String getModelo() { return modelo; }
	public String getColor() { return color; }
	public String getProcesador() { return procesador; }

  
    	public int getPrecio() { return precio; }

//	public void getInfo(){
//		System.out.printf("\t\tMarca:\t%s\n", marca);
//		System.out.printf("\t\tModelo:\t%s\n", modelo);
//		System.out.printf("\t\tColor:\t%s\n", color);
//		System.out.printf("\t\tProcesador:\t%s\n", procesador);
//		System.out.printf("\t\tPrecio:\t%d\n", precio);
//	}

	// Este es el constructor de CellPhone.
	CellPhone(String marca, String modelo, String color, String procesador, int precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.procesador = procesador;
		this.precio = precio;
}


}
