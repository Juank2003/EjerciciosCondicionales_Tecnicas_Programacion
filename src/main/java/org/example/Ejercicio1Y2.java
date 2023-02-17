package org.example;

/*
//Escriba un algoritmo que muestre "riesgo de hielo", si la temperatura introducida es inferior a 2°C.

import java.util.Scanner;

public class Ejercicio1Y2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la temperatura: ");
        int temperatura = sc.nextInt();
        if (temperatura < 2) {
            System.out.println("Riesgo de hielo");
        }
    }
}*/

//Modificar el algoritmo anterior para mostrar un mensaje según la temperatura:

import java.util.Scanner;

public class Ejercicio1Y2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la temperatura: ");
        int temperatura = sc.nextInt();
        if (temperatura < 2) {
            System.out.println("Riesgo de hielo");
        } else if (temperatura >= 2 && temperatura < 15) {
            System.out.println("Hace frío");
        } else if (temperatura >= 15 && temperatura < 30) {
            System.out.println("Buena temperatura");
        } else {
            System.out.println("Demasiado calor");
        }
    }
}

