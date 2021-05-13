package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        int suma = 0;

        do {
            System.out.println("Introduce un número: ");
            int num = sc.nextInt();

            suma = suma + num;

        } while (suma <= 1000);

        System.out.println("la suma es: " + suma);

    }
}
