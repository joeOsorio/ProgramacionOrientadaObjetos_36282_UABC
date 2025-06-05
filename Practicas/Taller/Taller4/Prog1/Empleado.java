public class Empleado{
	// Atributos de la clase
	private String nombre;
	private int matricula;
	private String departamento;
	private String posicion;

	// Metodos SET
	public void setNombre(String nombre){this.nombre = nombre;}
	public void setMatricula(int matricula){this.matricula = matricula;}
	public void setDepartamento(String departamento){this.departamento = departamento;}
	public void setPosicion(String posicion){this.posicion = posicion;}

	// Metodos GET
	public String getNombre(){return nombre;}
	public int getMatricula(){return matricula;}
	public String getPosicion(){return posicion;}
	public String getDepartamento(){return departamento;}

	//Construtures

	// Un constructor que pueda inicializar los atributos de nombre, matrícula, departamento y posición.
	public Empleado(String nombre, int matricula, String departamento, String posicion){
		this.nombre = nombre;
		this.matricula = matricula;
		this.posicion = posicion;
		this.departamento = departamento;
	}
	
	//Un constructor que pueda inicializar los atributos de nombre y matrícula
	public Empleado(String nombre, int matricula){
		this.nombre = nombre;
		this.matricula = matricula;
		//this.posicion = posicion;
		//this.departamento = departamento;
	}

	// Un constructor sin argumentos, donde asigne la cadena vacía para nombre, departamento y posición y en 0 la matrícula.
	public Empleado(){
		this.nombre = "";
		this.matricula = 0;
		this.posicion = "";
		this.departamento = "";
	}


}