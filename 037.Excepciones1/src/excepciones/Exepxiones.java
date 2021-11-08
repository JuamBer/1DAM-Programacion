package excepciones;

import java.util.Scanner;

public class Exepxiones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("Introduce un número: ");
        int a = sc.nextInt();
        System.out.println("Introduce otro número: ");
        int b = sc.nextInt();
        System.out.println(division(a, b));
    }

    public static int division(int a, int b) {
        return a / b;
    }
}
