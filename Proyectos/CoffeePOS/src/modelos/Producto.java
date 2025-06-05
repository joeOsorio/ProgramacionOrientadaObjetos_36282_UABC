package modelos;

import interfaces.*;

/**
 * Clase base para productos del café
 */
public abstract class Producto implements Vendible {

    protected int id;
    protected String nombre;
    protected String tipo;
    protected double precio;
    protected boolean disponible;
    protected static int contadorId = 1;

    public Producto(String nombre, String tipo, double precio) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.disponible = true;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public boolean estaDisponible() {
        return disponible;
    }

    @Override
    public String obtenerDescripcion() {
        return nombre + " (" + tipo + ") - $" + precio;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | " + obtenerDescripcion()
                + " | " + (disponible ? "Disponible" : "No disponible");
    }
}
