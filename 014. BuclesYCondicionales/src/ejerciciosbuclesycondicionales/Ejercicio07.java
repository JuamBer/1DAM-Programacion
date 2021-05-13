package ejerciciosbuclesycondicionales;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        System.out.println("Introudce el número de horas trabajadas por la mañana: ");
        double horasmañana = sc.nextDouble();

        System.out.println("Introudce el número de horas trabajadas por la tarde: ");
        double horastarde = sc.nextDouble();

        System.out.println("Introudce el número de horas trabajadas por la noche: ");
        double horasnoche = sc.nextDouble();

        double sueldo = (horasmañana * 600) + (horastarde * 800) + (horasnoche * 1000);

        System.out.println("Cobrará: " + sueldo + " pesetas");
    }
}
