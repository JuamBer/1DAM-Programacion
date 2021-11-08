package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();

        if (num > 0) {
            for (int j = 0; j < num; j++) {
                System.out.println("*");
            }
        } else {
            System.out.println("*");
        }

    }
}
