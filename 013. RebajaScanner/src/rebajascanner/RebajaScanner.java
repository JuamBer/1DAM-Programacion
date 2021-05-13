package rebajascanner;

import java.util.Scanner;

public class RebajaScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Precio: ");
        double precio = sc.nextInt();
        System.out.println("Descuento: ");
        double rebaja = sc.nextInt();

        double preciofinal = (100 - rebaja) * precio;

        System.out.println("Precio final con el descuento aplicado es: " + preciofinal);
    }

}
