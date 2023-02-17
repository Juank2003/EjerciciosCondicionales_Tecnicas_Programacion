package org.example;


import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Apellido de la persona?");
        String apellido = sc.nextLine();
        System.out.println("¿Nombre de la persona?");
        String nombre = sc.nextLine();
        System.out.println("¿Puesto?");
        System.out.println("1 - Agente de servicio");
        System.out.println("2 - Empleado de oficina");
        System.out.println("3 - Directivo");
        int puesto = sc.nextInt();
        System.out.println("Número de horas trabajadas");
        int horas = sc.nextInt();
        System.out.println("¿Tarifa horaria?");
        double tarifa = sc.nextDouble();
        System.out.println("¿Número de hijos?");
        int hijos = sc.nextInt();
        double salarioBruto = 0;
        double deducciones = 0;
        double salarioNeto = 0;
        double primaFamiliar = 0;
        double salarioNetoPagar = 0;
        String puestoTexto = "";
        if (puesto == 1) {
            puestoTexto = "Agente de servicio";
        } else if (puesto == 2) {
            puestoTexto = "Empleado de oficina";
        } else if (puesto == 3) {
            puestoTexto = "Directivo";
        }
        if (horas < 169) {
            salarioBruto = horas * tarifa;
        } else if (horas >= 169 && horas <= 180) {
            salarioBruto = (horas - 169) * (tarifa * 1.5) + 169 * tarifa;
        } else if (horas > 180) {
            salarioBruto = (horas - 180) * (tarifa * 1.6) + 11 * (tarifa * 1.5) + 169 * tarifa;
        }
        deducciones = salarioBruto * 0.0349 + salarioBruto * 0.0615 + salarioBruto * 0.0095 + salarioBruto * 0.0844 + salarioBruto * 0.0305 + salarioBruto * 0.0381 + salarioBruto * 0.0102;
        salarioNeto = salarioBruto - deducciones;
        if (hijos == 1) {
            primaFamiliar = 20;
        } else if (hijos == 2) {
            primaFamiliar = 50;
        } else if (hijos > 2) {
            primaFamiliar = 70 + (hijos - 2) * 20;
        } else {
            primaFamiliar = 0;
        }
        salarioNetoPagar = salarioNeto + primaFamiliar;
        System.out.println("Nómina de " + nombre + " " + apellido);
        System.out.println("Estado : " + puestoTexto);
        System.out.println("Salario bruto: " + salarioBruto + " € (169 horas sin incremento, 11 horas con incremento del 50 %, 10 horas con incremento del 60 %)");
        System.out.println("Cálculo de deducciones:");
        System.out.println("Contribución para el pago de la deuda social y contingencias comunes imponible");
        System.out.println(salarioBruto + " € × 3,49 % = " + salarioBruto * 0.0349 + " €");
        System.out.println("Contribución de contingencias comunes no imponible");
        System.out.println(salarioBruto + " € × 6,15 % = " + salarioBruto * 0.0615 + " €");
        System.out.println("Seguro médico");
        System.out.println(salarioBruto + " € × 0,95 % = " + salarioBruto * 0.0095 + " €");
        System.out.println("Fondo de pensiones");
        System.out.println(salarioBruto + " € × 8,44 % = " + salarioBruto * 0.0844 + " €");
        System.out.println("Seguro de desempleo");
        System.out.println(salarioBruto + " € × 3,05 % = " + salarioBruto * 0.0305 + " €");
        System.out.println("Pensión complementaria (Entidad privada)");
        System.out.println(salarioBruto + " € × 3,81 % = " + salarioBruto * 0.0381 + " €");
        System.out.println("Contribución de jubilación anticipada");
        System.out.println(salarioBruto + " € × 1,02 % = " + salarioBruto * 0.0102 + " €");
        System.out.println("Deducciones totales de los empleados: " + deducciones + " €");
        System.out.println("Salario neto: " + salarioNeto + " €");
        System.out.println("Prima familiar: " + primaFamiliar + " €");
        System.out.println("Salario neto a pagar: " + salarioNetoPagar + " €");
    }
}