package com.lucas.Ejercicio1Extra;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        int suma = 0;
        int cantidadNumeros = 0;
        for (int i = 0; i < 15; ++i) {
            numeros.add(i * 5);
            suma += numeros.get(i);
            cantidadNumeros++;
        }
        System.out.println(numeros);
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + suma / cantidadNumeros);

    }
}
