package ejerciciosbuclesycondicionales;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        System.out.println("Introduce un número: ");
        int num1 = sc.nextInt();

        System.out.println("Introduce otro número: ");
        int num2 = sc.nextInt();

        System.out.println("Introduce otro número: ");
        int num3 = sc.nextInt();

        int max = 0;
        int min = 0;

        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }
        if (max < num3) {
            max = num3;
        } else {
            if (min > num3) {
                min = num3;
            }
        }

        System.out.println("El menor es: " + min + " y el mayor es: " + max);

    }
}
