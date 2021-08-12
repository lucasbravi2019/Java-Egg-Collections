package com.lucas.Ejercicio4;

import java.util.Comparator;

public class ComparadorTiempoMayorMenor implements Comparator<Pelicula> {

    @Override
    public int compare(Pelicula p1, Pelicula p2) {
        // TODO Auto-generated method stub
        return (int) ((p2.getHoras() - p1.getHoras()) * 10);
    }

}
