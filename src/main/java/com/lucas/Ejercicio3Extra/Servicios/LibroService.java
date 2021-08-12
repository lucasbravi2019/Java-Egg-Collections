package com.lucas.Ejercicio3Extra.Servicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.lucas.Ejercicio3Extra.Entidades.Libro;

public class LibroService {
    private static LibroService instance;
    Scanner scan = new Scanner(System.in);

    private LibroService() {

    }

    public static LibroService getInstance() {
        if (instance == null) {
            instance = new LibroService();
        }
        return instance;
    }

    public Libro crearLibro() {
        System.out.println("Ingrese el nombre del libro");
        String nombre = scan.nextLine();
        System.out.println("Ingrese el autor del libro");
        String autor = scan.nextLine();
        System.out.println("Ingrese la cantidad de ejemplares del libro");
        int ejemplares = Integer.valueOf(scan.nextLine());
        System.out.println("Ingrese la cantidad de ejemplares prestados");
        int ejemplaresPrestados = Integer.valueOf(scan.nextLine());
        return new Libro(nombre, autor, ejemplares, ejemplaresPrestados);
    }

    public void prestarLibro(HashSet<Libro> libros) {
        System.out.println("Ingrese el nombre del libro que desea prestar");
        String nombre = scan.nextLine();
        Iterator<Libro> it = libros.iterator();
        while (it.hasNext()) {
            Libro temp = it.next();
            if (temp.getTitulo().equalsIgnoreCase(nombre)) {
                if ((temp.getEjemplaresPrestados() + 1) > temp.getEjemplares()) {
                    System.out.println("No quedan ejemplares disponibles para prestar");
                } else {
                    temp.setEjemplaresPrestados(temp.getEjemplaresPrestados() + 1);
                    System.out.println("Libro prestado, por favor devolver dentro de una semana");
                }
            }
        }
    }

    public void devolverLibro(HashSet<Libro> libros) {
        System.out.println("Ingrese el nombre del libro que desea devolver");
        String nombre = scan.nextLine();
        Iterator<Libro> it = libros.iterator();
        while (it.hasNext()) {
            Libro temp = it.next();
            if (temp.getTitulo().equalsIgnoreCase(nombre)) {
                if (temp.getEjemplaresPrestados() == 0) {
                    System.out.println("Este libro no ha sido prestado");
                } else {
                    temp.setEjemplaresPrestados(temp.getEjemplaresPrestados() - 1);
                    System.out.println("Libro devuelto. Gracias, vuelva pronto");
                }
            }
        }
    }
}
