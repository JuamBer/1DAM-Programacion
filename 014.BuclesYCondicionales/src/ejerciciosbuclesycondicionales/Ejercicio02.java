package ejerciciosbuclesycondicionales;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        int max = 0;

        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        System.out.println("Introduce un número: ");
        int num1 = sc.nextInt();

        System.out.println("Introduce otro número: ");
        int num2 = sc.nextInt();

        System.out.println("Introduce otro número: ");
        int num3 = sc.nextInt();

        if (num1 > max) {
            max = num1;
        }
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        if (num1 < num2) {
            int min = num1;
            if (num3 < min) {
                min = num3;
            }
            System.out.println("El menor es: " + min);
        } else {
            int min = num2;
            if (num3 < min) {
                min = num3;
            }
            System.out.println("El menor es: " + min);
        }

        System.out.println("El mayor es: " + max);

    }

}
