package com.lucas.Ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        HashSet<String> paises = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("Ingrese un pais");
            paises.add(scan.nextLine());
            System.out.println("Desea agregar otro pais? S/N");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                salir = true;
            }
        }
        List<String> paisesOrdenadosLista = new ArrayList<>(paises);
        TreeSet<String> paisesOrdenadosTree = new TreeSet<>(paises);
        Collections.sort(paisesOrdenadosLista);
        System.out.println("Lista de paises sin ordenar");
        System.out.println(paises.toString());
        System.out.println("Lista de paises ordenada(List)");
        System.out.println(paisesOrdenadosLista.toString());
        System.out.println("Lista de paises ordenada(TreeSet)");
        System.out.println(paisesOrdenadosTree.toString());
        Iterator<String> it = paises.iterator();
        System.out.println("Ingrese el pais a borrar");
        String paisABorrar = scan.nextLine();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(paisABorrar)) {
                it.remove();
            }
        }
        System.out.println("Nueva lista de paises, despues de remover " + paisABorrar);
        System.out.println(paises.toString());
        scan.close();
    }
}
