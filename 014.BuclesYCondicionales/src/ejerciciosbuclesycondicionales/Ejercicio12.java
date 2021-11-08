package ejerciciosbuclesycondicionales;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        int añonacimiento = 0;
        int mesnacimiento = 0;
        int dianacimiento = 0;

        int año = 0;
        int mes = 0;
        int dia = 0;

        System.out.println("Escribe tu año de nacimiento: ");
        añonacimiento = sc.nextInt();

        System.out.println("Escribe tu mes de nacimiento: ");
        mesnacimiento = sc.nextInt();

        System.out.println("Escribe tu día de nacimiento: ");
        dianacimiento = sc.nextInt();

        System.out.println("Escribe el año actual: ");
        año = sc.nextInt();

        System.out.println("Escribe el mes actual: ");
        mes = sc.nextInt();

        System.out.println("Escribe el día actual: ");
        dia = sc.nextInt();

        if ((año - añonacimiento) <= 18) {
            if (mes <= mesnacimiento) {
                if (dia <= dianacimiento) {
                    System.out.println("Eres mayor de edad ");
                } else {
                    System.out.println("Eres menor de edad 1");
                }
            } else {
                System.out.println("Eres menor de edad 2");
            }
        } else {
            System.out.println("Eres menor de edad 3");
        }

    }
}
