package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("Introduce un número: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro número: ");
        int num2 = sc.nextInt();
        int veces = 0;
        if (num2 > num1) {
            veces = num2 - num1;
            for (int i = 0; i <= veces; i++) {
                System.out.println(num1 + i);
            }
        } else {
            veces = num1 - num2;
            for (int i = 0; i <= veces; i++) {
                System.out.println(num2 + i);
            }
        }
    }
}
