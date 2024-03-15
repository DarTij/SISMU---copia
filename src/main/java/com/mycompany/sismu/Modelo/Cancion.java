/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sismu.Modelo;

/**
 *
 * @author Estudiante
 */
public class Cancion {
    private String titulo;
    private String genero;
    private int id;
    private double duracion;
    private int annoLanzamiento;

    public Cancion() {
    }

    public Cancion(String titulo, String genero, int id, double duracion, int annoLanzamiento) {
        this.titulo = titulo;
        this.genero = genero;
        this.id = id;
        this.duracion = duracion;
        this.annoLanzamiento = annoLanzamiento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getAnnoLanzamiento() {
        return annoLanzamiento;
    }

    public void setAnnoLanzamiento(int annoLanzamiento) {
        this.annoLanzamiento = annoLanzamiento;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", genero=" + genero + ", id=" + id + ", duracion=" + duracion + ", annoLanzamiento=" + annoLanzamiento + '}';
    }
    
    
}
