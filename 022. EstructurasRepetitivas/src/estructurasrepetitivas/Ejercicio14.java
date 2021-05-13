package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(num - i);
        }
    }
}
