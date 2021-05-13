package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        boolean paso = false;

        do {
            System.out.println("Introduce la edad: ");
            int num = sc.nextInt();

            if ((num > 4 && num < 26) && ((num % 2) == 0)) {
                paso = true;
            }

        } while (paso == false);

        System.out.println("Correcto!");
    }
}
