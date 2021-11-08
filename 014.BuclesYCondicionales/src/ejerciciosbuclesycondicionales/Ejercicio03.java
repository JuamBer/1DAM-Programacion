package ejerciciosbuclesycondicionales;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("No eres mayor de edad");

        }
    }
}
