package com.lucas.Ejercicio3.Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lucas.Ejercicio3.Entidades.Alumno;

public class AlumnoService {
    private static AlumnoService instance;
    Scanner scan = new Scanner(System.in);

    private AlumnoService() {

    }

    public static AlumnoService getInstance() {
        if (instance == null) {
            instance = new AlumnoService();
        }
        return instance;
    }

    public Alumno crearAlumno() {
        System.out.println("Ingrese el nombre del alumno");
        String nombre = scan.nextLine();
        System.out.println("Ingrese la nota 1");
        double nota1 = Integer.valueOf(scan.nextLine());
        System.out.println("Ingrese la nota 2");
        double nota2 = Integer.valueOf(scan.nextLine());
        System.out.println("Ingrese la nota 3");
        double nota3 = Integer.valueOf(scan.nextLine());
        List<Double> notas = new ArrayList<Double>();
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        return new Alumno(nombre, notas);
    }

    public double notaFinal(Alumno alumno) {
        double promedio = 0;
        for (double notas : alumno.getNotas()) {
            promedio += notas;
        }
        return promedio / 3;
    }

}
