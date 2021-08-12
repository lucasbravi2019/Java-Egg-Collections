package com.lucas.Ejercicio4;

import java.util.Objects;

public class Pelicula {
    private String titulo;
    private String director;
    private double horas;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double horas) {
        this.titulo = titulo;
        this.director = director;
        this.horas = horas;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getHoras() {
        return this.horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public Pelicula titulo(String titulo) {
        setTitulo(titulo);
        return this;
    }

    public Pelicula director(String director) {
        setDirector(director);
        return this;
    }

    public Pelicula horas(double horas) {
        setHoras(horas);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pelicula)) {
            return false;
        }
        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(titulo, pelicula.titulo) && Objects.equals(director, pelicula.director)
                && horas == pelicula.horas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, director, horas);
    }

    @Override
    public String toString() {
        return "{" + " titulo='" + getTitulo() + "'" + ", director='" + getDirector() + "'" + ", horas='" + getHoras()
                + "'" + "}";
    }

}
