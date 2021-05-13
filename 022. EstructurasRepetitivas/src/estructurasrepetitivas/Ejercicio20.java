package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int resultado = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un número");
            int num = sc.nextInt();

            resultado = resultado * num;
        }

        System.out.println("El resultado es: " + resultado);

    }
}
