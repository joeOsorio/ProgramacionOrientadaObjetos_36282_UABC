package Prog1;

public class Biblioteca {

    /* Atributos privados de la clase. */
    private final int espacioLibros = 10;
    /* Se declara como final porque india el tamaño del arreglo y ese no se puede modificar en el trn */
    private Libro[] librosDisponibles = new Libro[espacioLibros];

    private int cantidadLibros = 0;
    private String nombre;
    private String direccion;
    private String encargado;

    /*Constructores*/
    public Biblioteca() {
        this.cantidadLibros = 0;
        this.nombre = "";
        this.direccion = "";
        this.encargado = "";
    }

    public Biblioteca(int cantidadLibros, String nombre, String direccion, String encargado) {
        this.nombre = nombre;
        this.cantidadLibros = cantidadLibros;
        this.direccion = direccion;
        this.encargado = encargado;
    }

    /* Metodos Set */
    public void setLibrosDisponibles(Libro[] librosDisponibles) {
        this.librosDisponibles = librosDisponibles;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    /* Metodos Get */
    public Libro[] getLibrosDisponibles() {
        return librosDisponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEncargado() {
        return encargado;
    }

    /* Otros metodos de la clase */
    public void agregarLibro(Libro nuevoLibro) {
        librosDisponibles[cantidadLibros] = nuevoLibro;
        this.cantidadLibros++;
    }

    public Libro[] buscarPorAnio(int anio) {
        Libro[] arr = new Libro[cantidadLibros];
        int contador = 0;
        if (cantidadLibros > 0) {
            for (int l = 0; l < cantidadLibros; l++) {
                if (librosDisponibles[l].getAnioPublicacion() == anio) {
                    arr[contador] = librosDisponibles[l];
                    contador++;
                }
            }
        }
        return arr;
    }

    public Libro[] buscarPorAutor(String autor) {
        Libro[] arr = new Libro[cantidadLibros];
        int contador = 0;
        for (int l = 0; l < cantidadLibros; l++) {
            if (librosDisponibles[l].getAutores().equalsIgnoreCase(autor)) {
                arr[contador] = librosDisponibles[l];
                contador++;
            }
        }
        return arr;
    }

    public Libro[] buscarPorTitulo(String titulo) {
        Libro[] arr = new Libro[cantidadLibros];
        int contador = 0;
        for (int l = 0; l < cantidadLibros; l++) {
            if (librosDisponibles[l].getAutores().equalsIgnoreCase(titulo)) {
                arr[contador] = librosDisponibles[l];
                contador++;
            }
        }
        return arr;
    }

    /* Metodo quick sort para el ordenamiento de libros por anio */

 /* ordenamientoBurbuja */
    public void ordenarLibrosPorAnio(Libro[] lista) {
        for (int numPasada = cantidadLibros - 1; numPasada > 0; numPasada--) {
            for (int i = 0; i < numPasada; i++) {
                if (lista[i].getAnioPublicacion() > lista[i + 1].getAnioPublicacion()) {
                    Libro temp = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = temp;
                }
            }
        }
    }

    // public ordenarLibrosPorTitulo(){}
    public void ordenarLibrosPorTitulo(Libro[] lista) {
        for (int numPasada = cantidadLibros - 1; numPasada > 0; numPasada--) {
            for (int i = 0; i < numPasada; i++) {
                if ((int) (lista[i].getTituloLibro().charAt(0)) > (int) (lista[i + 1].getTituloLibro()).charAt(0)) {
                    Libro temp = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = temp;
                }
            }
        }
    }
}
