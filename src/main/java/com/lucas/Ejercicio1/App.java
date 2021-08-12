package com.lucas.Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<String> perros = new ArrayList<String>();
        boolean seguir = true;
        char sigo;
        Scanner scan = new Scanner(System.in);
        while (seguir) {
            System.out.println("Desea agregar una nueva raza? S/N");
            sigo = scan.nextLine().toUpperCase().charAt(0);
            if (sigo == 'S') {
                System.out.println("Ingrese la raza");
                perros.add(scan.nextLine());
            }
            if (sigo == 'N') {
                break;
            }
        }
        Collections.sort(perros);
        Iterator it = perros.iterator();
        boolean existe = false;
        while (it.hasNext()) {
            if (it.next().equals("caniche")) {
                existe = true;
                it.remove();
            }
        }
        if (!existe) {
            System.out.println("La raza de perro no existe.");
        }
        System.out.println(perros.toString());
        scan.close();
    }
}
