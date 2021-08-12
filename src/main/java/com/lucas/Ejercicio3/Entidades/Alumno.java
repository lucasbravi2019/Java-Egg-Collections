package com.lucas.Ejercicio3.Entidades;

import java.util.List;
import java.util.Objects;

public class Alumno {
    private String nombre;
    private List<Double> notas;

    public Alumno() {
    }

    public Alumno(String nombre, List<Double> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Double> getNotas() {
        return this.notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public Alumno nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Alumno notas(List<Double> notas) {
        setNotas(notas);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Alumno)) {
            return false;
        }
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(notas, alumno.notas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, notas);
    }

    @Override
    public String toString() {
        return "{" + " nombre='" + getNombre() + "'" + ", notas='" + getNotas() + "'" + "}";
    }
}
