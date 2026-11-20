package com.getfin.models;

/**
 * Representa un módulo del sistema que se muestra en el panel lateral.
 */
public class Modulo {
    private String nombre;
    private String ruta;

    public Modulo(String nombre, String ruta) {
        this.nombre = nombre;
        this.ruta = ruta;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getRuta() { return ruta; }
    public void setRuta(String ruta) { this.ruta = ruta; }
}
