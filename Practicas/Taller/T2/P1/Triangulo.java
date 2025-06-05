public class Triangulo{

	private double base;
	private double altura;
	private double largo;
	
	public void setBase(double base){this.base = base;}
		// almacenara un valor en el campo base de un objeto

 	public void setAltura(double altura){this.altura =altura;}
		//almacenara un valor en el campo altura de un objeto

	public void setLargo(double largo){this.largo =largo;}
		//almacenara un valor en el campo largo de un objeto

 	public double getBase(){return base;}
		//devolverá el valor en el campo de la base de un objeto.

 	public double getAltura(){return altura;}
		//devolverá el valor en el campo de la altura de un objeto.
	
	public double getLargo(){return largo;}
		//devolverá el valor en el campo de la altura de un objeto.

 	public double getArea(double base, double altura){return ((base*altura)/2);}
		//El método calcularArea deberá calcular el area

	public double getVolumen(double base, double altura, double largo){return (((base*altura)/2)*largo);}
		//El método calcularVolumen deberá calcular el volumen
}