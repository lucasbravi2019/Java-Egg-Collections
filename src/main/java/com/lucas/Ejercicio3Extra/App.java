package com.lucas.Ejercicio3Extra;

import java.util.HashSet;
import java.util.Scanner;

import com.lucas.Ejercicio3Extra.Entidades.Libro;
import com.lucas.Ejercicio3Extra.Servicios.LibroService;

public class App {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        LibroService s = LibroService.getInstance();
        HashSet<Libro> libros = new HashSet<>();
        int operacion = 0;
        while (operacion != 5) {
            System.out.println("\tMenu");
            System.out.println("1. Crear libro");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Mostrar libros");
            System.out.println("5. Salir");
            operacion = Integer.valueOf(scan.nextLine());
            if (operacion == 1) {
                libros.add(s.crearLibro());
            }
            if (operacion == 2) {
                s.prestarLibro(libros);
            }
            if (operacion == 3) {
                s.devolverLibro(libros);
            }
            if (operacion == 4) {
                System.out.println(libros);
            }
            if (operacion == 5) {
                System.out.println("Finalizado");
                return;
            }
        }
    }
}
