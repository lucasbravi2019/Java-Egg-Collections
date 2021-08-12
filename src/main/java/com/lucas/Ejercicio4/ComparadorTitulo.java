package com.lucas.Ejercicio4;

import java.util.Comparator;

public class ComparadorTitulo implements Comparator<Pelicula> {

    @Override
    public int compare(Pelicula p1, Pelicula p2) {
        // TODO Auto-generated method stub
        return p1.getTitulo().compareTo(p2.getTitulo());
    }

}
