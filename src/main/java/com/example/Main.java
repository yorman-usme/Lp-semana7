package com.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String item;

        System.out.println("Introduce los items de tu lista de compras. Escribe 'salir' para terminar.");

        while (true) {
            item = scanner.nextLine();

            // Usar continue si el item está vacío
            if (item.trim().isEmpty()) {
                System.out.println("El item no puede estar vacío. Por favor, introduce un item.");
                continue; // Regresa al inicio del bucle
            }

            // Usar break para salir del bucle
            if (item.equalsIgnoreCase("salir")) {
                break; // Sale del bucle
            }

            // Añadir el item a la lista
            lista.add(item);
            System.out.println("Item añadido: " + item);
        }

        System.out.println("\nTu lista de compras:");
        for (String listaItem : lista) {
            System.out.println("- " + listaItem);
        }

        scanner.close();
    }
}