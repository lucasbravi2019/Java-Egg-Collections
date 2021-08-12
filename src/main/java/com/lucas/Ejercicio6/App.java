package com.lucas.Ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in);

    public static void agregar(Map<Integer, Producto> productos) {
        boolean agregar = true;
        String nuevoElemento = "s";
        String producto;
        double precio;
        int i = 1;
        while (agregar) {
            if (nuevoElemento.equalsIgnoreCase("s")) {
                System.out.println("Nombre producto");
                producto = scan.nextLine();
                System.out.println("Precio producto");
                precio = Double.valueOf(scan.nextLine());
                productos.put(i, new Producto(producto, precio));
                i++;
            }
            System.out.println("Desea agregar un nuevo elemento? S/N");
            nuevoElemento = scan.nextLine();
            if (nuevoElemento.equalsIgnoreCase("n")) {
                agregar = false;
            }
        }
    }

    public static void modificar(Map<Integer, Producto> productos) {
        System.out.println("Que producto quiere modificar?");
        String producto = scan.nextLine();
        for (Map.Entry<Integer, Producto> entry : productos.entrySet()) {
            Integer key = entry.getKey();
            Producto value = entry.getValue();
            if (producto.equalsIgnoreCase(value.getProducto())) {
                System.out.println("Indique el nuevo nombre");
                value.setProducto(scan.nextLine());
                System.out.println("Indique el nuevo precio");
                value.setPrecio(Double.valueOf(scan.nextLine()));
            }
        }
    }

    public static void eliminar(Map<Integer, Producto> productos) {
        String producto;
        System.out.println("Que producto desea eliminar?");
        System.out.println(productos.values());
        producto = scan.nextLine();
        for (Map.Entry<Integer, Producto> entry : productos.entrySet()) {
            Integer id = entry.getKey();
            Producto value = entry.getValue();
            if (producto.equalsIgnoreCase(value.getProducto())) {
                productos.remove(id);
                System.out.println("Producto eliminado");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Map<Integer, Producto> productos = new HashMap<>();
        int operacion = 0;
        while (operacion != 5) {
            System.out.println("\tMENU");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar producto");
            System.out.println("3. Borrar producto");
            System.out.println("4. Ver productos");
            System.out.println("5. Salir");
            operacion = Integer.valueOf(scan.nextLine());
            if (operacion == 1) {
                agregar(productos);
            }
            if (operacion == 2) {
                modificar(productos);
            }
            if (operacion == 3) {
                eliminar(productos);
            }
            if (operacion == 4) {
                System.out.println(productos.values());
            }
            if (operacion == 5) {
                return;
            }
        }
    }
}
