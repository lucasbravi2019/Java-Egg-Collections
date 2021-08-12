package com.lucas.Ejercicio4;

import java.util.Comparator;

public class ComparadorTiempoMenorMayor implements Comparator<Pelicula> {

    @Override
    public int compare(Pelicula p1, Pelicula p2) {
        // TODO Auto-generated method stub
        return (int) ((p1.getHoras() - p2.getHoras()) * 10);
    }

}
