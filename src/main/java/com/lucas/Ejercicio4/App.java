package com.lucas.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Pelicula> peliculas = new ArrayList<Pelicula>();
        peliculas.add(new Pelicula("Rapido y furioso", "Director 1", 3.2));
        peliculas.add(new Pelicula("Harry Potter y el Caliz de Fuego", "JK Rowling", 2.5));
        peliculas.add(new Pelicula("Star Wars", "George Lucas", 2.3));
        System.out.println("\n\tPeliculas sin ordenamiento");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        System.out.println("\n\tPeliculas ordenadas segun el titulo");
        peliculas.sort(new ComparadorTitulo());
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
        System.out.println("\n\tPeliculas ordenadas segun director");
        peliculas.sort(new ComparadorDirector());
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
        System.out.println("\n\tPeliculas ordenadas segun el tiempo de mayor a menor");
        peliculas.sort(new ComparadorTiempoMayorMenor());
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
        System.out.println("\n\tPeliculas ordenadas segun el tiempo de menor a mayor");
        peliculas.sort(new ComparadorTiempoMenorMayor());
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }
}
