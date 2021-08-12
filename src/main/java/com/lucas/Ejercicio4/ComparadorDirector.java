package com.lucas.Ejercicio4;

import java.util.Comparator;

public class ComparadorDirector implements Comparator<Pelicula> {

    @Override
    public int compare(Pelicula p1, Pelicula p2) {
        // TODO Auto-generated method stub
        return p1.getDirector().compareTo(p2.getDirector());
    }

}
