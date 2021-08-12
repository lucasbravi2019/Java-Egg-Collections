package com.lucas.Ejercicio3Extra.Entidades;

import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int ejemplaresPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return this.ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getEjemplaresPrestados() {
        return this.ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public Libro titulo(String titulo) {
        setTitulo(titulo);
        return this;
    }

    public Libro autor(String autor) {
        setAutor(autor);
        return this;
    }

    public Libro ejemplares(int ejemplares) {
        setEjemplares(ejemplares);
        return this;
    }

    public Libro ejemplaresPrestados(int ejemplaresPrestados) {
        setEjemplaresPrestados(ejemplaresPrestados);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Libro)) {
            return false;
        }
        Libro libro = (Libro) o;
        return Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor)
                && ejemplares == libro.ejemplares && ejemplaresPrestados == libro.ejemplaresPrestados;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, ejemplares, ejemplaresPrestados);
    }

    @Override
    public String toString() {
        return "{" + " titulo='" + getTitulo() + "'" + ", autor='" + getAutor() + "'" + ", ejemplares='"
                + getEjemplares() + "'" + ", ejemplaresPrestados='" + getEjemplaresPrestados() + "'" + "}";
    }
}
