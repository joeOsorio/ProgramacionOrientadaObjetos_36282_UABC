/*-----------------------------------
Practica 4: Diseñar clases para modelar el estado y comportamiento aplicando
encapsulamiento.
Nombre: Joshua Osorio 
Materia: Programación Orientada a Objetos
Fecha: Febrero/27/2025 
-----------------------------------*/

/*
Diseñe e implemente un objeto de libreta de direcciones que contenga el nombre, la
dirección, número de teléfono de una persona, la dirección y el número de teléfono de su trabajo y los
números de su máquina de fax, teléfono celular y buscapersonas. Escriba un plan de prueba para el objeto
e implemente una clase que lo pruebe. Diseñe el diagrama UML de la clase, aplique encapsulamiento e
imprime los datos personales y del trabajo de tal manera que se vea presentable.
*/



public class LibretaDirecciones{
	// Atributos de la classe.
	private String nombre;
	private String direccion;
	private int telefono;
	private String direccionTrabajo;
	private int telefonoTrabajo;	
	private int fax;
	private int celular;
	private int buscaPersonas;

	// Métodos getter para retornar los atributos de la libreta.
	public String getNombre() {return nombre;}
	public String getDireccion() {return direccion;}
	public int getTelefono() {return telefono;}
	public String getDireccionTrabajo() {return direccionTrabajo;}
	public int getTelefonoTrabajo() {return telefonoTrabajo;}
	public int getFax() {return fax;}
	public int getCelular() {return celular;}
	public int getBuscaPersonas() {return buscaPersonas;}

	// Métodos setter para modificar los atributos de la libreta.
	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setDireccion(String direccion) {this.direccion = direccion;}
	public void setTelefono(int telefono) {this.telefono = telefono;}
	public void setDireccionTrabajo(String direccionTrabajo) {this.direccionTrabajo = direccionTrabajo;}
	public void setTelefonoTrabajo(int telefonoTrabajo) {this.telefonoTrabajo = telefonoTrabajo;}
	public void setFax(int fax) {this.fax = fax;}
	public void setCelular(int celular) {this.celular = celular;}
	public void setBuscaPersonas(int buscaPersonas) {this.buscaPersonas = buscaPersonas;}

	// Constructor
	LibretaDirecciones(String nombre, String direccion)
	
	


	










}