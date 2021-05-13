package estructurarepetitiva2;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int num;
        boolean primo = true;
        int primoinferior = 0;

        do {
            System.out.println("Introduce un número: ");
            num = sc.nextInt();

        } while (num < 5);
        System.out.println("Números primos comprendidos entre el 0 y el " + num);
        for (int i = 2; i < num; i++) {

            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    primoinferior++;
                }
            }

            if (primoinferior == 0) {
                System.out.println(i);
            }
            primoinferior = 0;
            if ((num % i) == 0) {
                primo = false;
            }
        }

        System.out.println("");
        if (primo == false) {
            System.out.println("El número " + num + " no es primo");
        } else {
            System.out.println("El número " + num + " es primo");
        }

    }
}
