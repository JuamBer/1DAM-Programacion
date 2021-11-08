package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        boolean paso = false;

        do {
            System.out.println("Introduce un número: ");
            int num = sc.nextInt();

            if (num > 0 && num < 6) {
                paso = true;
            }

        } while (paso == false);

        System.out.println("Correcto!");
    }
}
