package com.lucas.Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

import com.lucas.Ejercicio3.Entidades.Alumno;
import com.lucas.Ejercicio3.Servicios.AlumnoService;

public class App {
    public static void main(String[] args) {
        AlumnoService s = AlumnoService.getInstance();
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        Scanner scan = new Scanner(System.in);
        alumnos.add(s.crearAlumno());
        alumnos.add(s.crearAlumno());
        alumnos.add(s.crearAlumno());
        System.out.println("Ingrese el nombre del alumno a calcular su nota");
        String nombre = scan.nextLine();
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("La nota final del alumno " + alumno.getNombre() + " es: " + s.notaFinal(alumno));
            }
        }
        System.out.println(alumnos.toString());
        scan.close();
    }
}
