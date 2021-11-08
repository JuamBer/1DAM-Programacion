package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        int positivos = 0;
        int negativos = 0;
        int nulos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un número:");
            int num = sc.nextInt();
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                nulos++;
            }
        }
        System.out.println(positivos + " números positivos");
        System.out.println(negativos + " números negativos");
        System.out.println(nulos + " números nulos");

    }
}
