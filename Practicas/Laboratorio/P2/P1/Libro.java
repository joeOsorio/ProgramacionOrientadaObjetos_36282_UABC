public class Libro{
	// Atributos privados de la clase.
	private String tituloLibro;
	private int anioPublicacion;
	private String editorial;
	private String generos;
	private int numPaginas;
	private String autores;

	// Metodos get para traer valores de la clase. 
	public String getTituloLibro(){return tituloLibro;}
	public int getAnioPublicacion(){return anioPublicacion;}
	public String getEditorial(){return editorial;}
	public String getGeneros(){return generos;}
	public int getNumPaginas(){return numPaginas;}
	public String getAutores(){return autores;}
	
	// Metodos set de la case, se utilizan para declar los atributos.
	public void setTituloLibro(String tituloLibro){this.tituloLibro = tituloLibro;}
	public void setAnioPublicacion(int anioPublicacion){this.anioPublicacion = anioPublicacion;}
	public void setEditorial(String editorial){this.editorial = editorial;}
	public void setGeneros(String generos){this.generos = generos;}
	public void setNumPaginas(int numPaginas){this.numPaginas = numPaginas;}
	public void setAutores(String autores){this.autores = autores;}
}