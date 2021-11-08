package estructurarepetitiva2;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int num;
        do {
            System.out.println("1.-Opción 1\n"
                    + "2.-Opción 2\n"
                    + "3.- Opción 3\n"
                    + "4.- Finaliza");
            System.out.println("\n\nElige una opción:");
            num = sc.nextInt();

        } while (num != 4);

    }
}
