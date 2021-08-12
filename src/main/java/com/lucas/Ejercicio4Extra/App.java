package com.lucas.Ejercicio4Extra;

import java.util.Iterator;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class App {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        JSONArray codigosPostales = new JSONArray();
        int operacion = 0;
        while (operacion != 6) {
            System.out.println("\tMenu");
            System.out.println("1. Agregar 10 paises");
            System.out.println("2. Agregar 1 pais");
            System.out.println("3. Mostrar datos");
            System.out.println("4. Mostrar pais");
            System.out.println("5. Eliminar paises");
            System.out.println("6. Salir");
            operacion = Integer.valueOf(scan.nextLine());
            if (operacion == 1) {
                for (int i = 0; i < 10; ++i) {
                    System.out.println("Ingrese el nombre del pais");
                    String nombre = scan.nextLine();
                    System.out.println("Ingrese el codigo postal");
                    int codigoPostal = Integer.valueOf(scan.nextLine());
                    codigosPostales.put(new JSONObject().put("pais", nombre).put("codigo_postal", codigoPostal));
                }
            }
            if (operacion == 2) {
                System.out.println("Ingrese el nombre del pais");
                String nombre = scan.nextLine();
                System.out.println("Ingrese el codigo postal");
                int codigoPostal = Integer.valueOf(scan.nextLine());
                codigosPostales.put(new JSONObject().put("pais", nombre).put("codigo_postal", codigoPostal));
            }
            if (operacion == 3) {
                System.out.println(codigosPostales.toString(3));
            }
            if (operacion == 4) {
                System.out.println("Ingrese el codigo postal a buscar");
                int codigoPostal = Integer.valueOf(scan.nextLine());
                boolean encontrado = false;
                for (int i = 0; i < codigosPostales.length(); i++) {
                    if (codigosPostales.getJSONObject(i).get("codigo_postal").equals(codigoPostal)) {
                        System.out.println("Pais: " + codigosPostales.getJSONObject(i).get("pais"));
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("El codigo postal no esta registrado");
                }
            }
            if (operacion == 5) {
                System.out.println("Indique el pais a borrar");
                String nombre = scan.nextLine();
                for (int i = 0; i < codigosPostales.length(); ++i) {
                    if (codigosPostales.getJSONObject(i).get("pais").toString().equalsIgnoreCase(nombre)) {
                        codigosPostales.remove(i);
                        System.out.println("Eliminado");
                    }
                }
            }
            if (operacion == 6) {
                System.out.println("Finalizado");
                return;
            }
        }
    }
}
