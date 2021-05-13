package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int resultado = 0;
        System.out.println("Introduce el número de números que quieres sumar");
        int veces = sc.nextInt();

        for (int i = 0; i < veces; i++) {
            System.out.println("Introduce un número:");
            int num = sc.nextInt();

            resultado = resultado + num;
        }

        System.out.println("El resultado es: " + resultado);

    }
}
