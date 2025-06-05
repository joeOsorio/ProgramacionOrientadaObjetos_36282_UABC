public class Libro {
    // Atributos privados de la clase.

    private String tituloLibro;
    private int anioPublicacion;
    private String editorial;
    private String generos;
    private int numPaginas;
    private String autores;

    //Constructores
    public Libro() {
        this.tituloLibro = "";
        this.anioPublicacion = 0000;
        this.editorial = "";
        this.generos = "";
        this.numPaginas = 0;
        this.autores = "";
    }

    public Libro(String tituloLibro, int anioPublicacion, String editorial, String generos, int numPaginas, String autores) {
        this.tituloLibro = tituloLibro;
        this.anioPublicacion = anioPublicacion;
        this.editorial = editorial;
        this.generos = generos;
        this.numPaginas = numPaginas;
        this.autores = autores;
    }

    public Libro(String tituloLibro, String autores) {
        this.tituloLibro = tituloLibro;
        this.anioPublicacion = 0;
        this.editorial = "";
        this.generos = "";
        this.numPaginas = 0;
        this.autores = autores;
    }

    // Metodos set de la case, se utilizan para declar los atributos.
    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    // Metodos get para traer valores de la clase. 
    public String getTituloLibro() {
        return tituloLibro;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getGeneros() {
        return generos;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String getAutores() {
        return autores;
    }

}
