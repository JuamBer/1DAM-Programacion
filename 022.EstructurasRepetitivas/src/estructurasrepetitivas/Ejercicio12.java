package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("Introduce el Dividendo: ");
        int dividendo = sc.nextInt();
        System.out.println("Introduce el Divisor: ");
        int divisor = sc.nextInt();

        int cociente = 0;
        int resto = dividendo;

        while (resto >= divisor) {
            resto -= divisor;
            cociente++;
        }

        System.out.println(divisor + " / " + dividendo + " = " + cociente);
    }
}
