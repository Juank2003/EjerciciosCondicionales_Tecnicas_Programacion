package org.example;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tipo de carne (vacuno, cordero): ");
        String carne = sc.nextLine();
        System.out.println("Introduce el modo de cocción (casi crudo, al punto, bien hecha): ");
        String coccion = sc.nextLine();
        System.out.println("Introduce el peso en gramos: ");
        int peso = sc.nextInt();
        int tiempo = 0;
        if (carne.equals("vacuno")) {
            if (coccion.equals("casi crudo")) {
                tiempo = 10;
            } else if (coccion.equals("al punto")) {
                tiempo = 17;
            } else if (coccion.equals("bien hecha")) {
                tiempo = 25;
            }
            System.out.println("El tiempo de cocción es de " + tiempo * 60 * peso / 500 + " segundos");
        } else if (carne.equals("cordero")) {
            if (coccion.equals("casi crudo")) {
                tiempo = 15;
            } else if (coccion.equals("al punto")) {
                tiempo = 25;
            } else if (coccion.equals("bien hecha")) {
                tiempo = 40;
            }
            System.out.println("El tiempo de cocción es de " + tiempo * 60 * peso / 400 + " segundos");
        }

    }
}