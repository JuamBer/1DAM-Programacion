package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        int suma = 0;

        for (int i = 1; i <= num; i++) {
            suma = suma + i;
        }
        System.out.println("La suma es: " + suma);

    }
}
