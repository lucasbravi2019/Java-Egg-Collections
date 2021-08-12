package com.lucas.Ejercicio2Extra.Entidades;

import java.util.Objects;

public class CantanteFamoso {
    private String nombre;
    private String discoConMasVentas;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombre, String discoConMasVentas) {
        this.nombre = nombre;
        this.discoConMasVentas = discoConMasVentas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoConMasVentas() {
        return this.discoConMasVentas;
    }

    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }

    public CantanteFamoso nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public CantanteFamoso discoConMasVentas(String discoConMasVentas) {
        setDiscoConMasVentas(discoConMasVentas);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CantanteFamoso)) {
            return false;
        }
        CantanteFamoso cantanteFamoso = (CantanteFamoso) o;
        return Objects.equals(nombre, cantanteFamoso.nombre)
                && Objects.equals(discoConMasVentas, cantanteFamoso.discoConMasVentas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, discoConMasVentas);
    }

    @Override
    public String toString() {
        return "{" + " nombre='" + getNombre() + "'" + ", discoConMasVentas='" + getDiscoConMasVentas() + "'" + "}";
    }

}
