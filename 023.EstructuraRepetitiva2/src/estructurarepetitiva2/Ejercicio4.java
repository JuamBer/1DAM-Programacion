package estructurarepetitiva2;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        System.out.println("Introduce un número N");
        int num = sc.nextInt();

        for (int i = 1; i < num; i++) {
            if ((i % 3) == 0) {
                System.out.println("");
                System.out.println("Múltiplo: " + i);

                for (int j = 1; j <= i; j++) {
                    if ((j % 3) == 0) {
                        System.out.println("Divisor: " + j);
                    }
                }
            }
        }

    }
}
