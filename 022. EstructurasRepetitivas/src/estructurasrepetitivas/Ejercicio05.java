package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        boolean paso = false;
        int num = 0;
        int suma = 0;

        do {
            System.out.println("Introduce un número:");
            num = sc.nextInt();
            if (num >= 0) {
                suma = suma + num;
            } else {
                System.out.println("La suma es: " + suma);
                paso = true;
            }
        } while (paso == false);
    }
}
