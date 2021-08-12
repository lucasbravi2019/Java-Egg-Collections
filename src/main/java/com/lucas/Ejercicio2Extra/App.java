package com.lucas.Ejercicio2Extra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.lucas.Ejercicio2Extra.Entidades.CantanteFamoso;
import com.lucas.Ejercicio2Extra.Servicios.CantanteFamosoService;

public class App {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        List<CantanteFamoso> cantantes = new ArrayList<CantanteFamoso>();
        CantanteFamosoService s = CantanteFamosoService.getInstance();
        int operacion = 0;
        for (int i = 0; i < 5; ++i) {
            cantantes.add(s.crearCantante("Cerati", "Naturaleza muerta"));
        }
        while (operacion != 4) {
            System.out.println("\tMENU");
            System.out.println("1. Agregar cantante");
            System.out.println("2. Mostrar cantantes");
            System.out.println("3. Eliminar cantante");
            System.out.println("4. Salir");
            operacion = Integer.valueOf(scan.nextLine());
            if (operacion == 1) {
                System.out.println("Ingrese el nombre del cantante");
                String nombre = scan.nextLine();
                System.out.println("Ingrese el disco mas vendido");
                String disco = scan.nextLine();
                cantantes.add(s.crearCantante(nombre, disco));
            }
            if (operacion == 2) {
                System.out.println(cantantes);
            }
            if (operacion == 3) {
                System.out.println("Ingrese el nombre del cantante a borrar");
                String nombre = scan.nextLine();
                Iterator<CantanteFamoso> it = cantantes.iterator();
                while (it.hasNext()) {
                    if (it.next().getNombre().equalsIgnoreCase(nombre)) {
                        it.remove();
                        System.out.println("Eliminado");
                    }
                }
            }
            if (operacion == 4) {
                System.out.println("Finalizado");
                return;
            }
        }

    }
}
