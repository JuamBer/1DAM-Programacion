package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("Introduce un número:");
        int num = sc.nextInt();
        boolean paso = false;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = i * factorial;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
