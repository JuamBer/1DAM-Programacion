package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("Introduce un número: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro número: ");
        int num2 = sc.nextInt();
        int resultado = 0;
        for (int i = 0; i < num2; i++) {
            resultado = resultado + num1;
        }
        System.out.println(num1 + " * " + num2 + " = " + resultado);

    }
}
