package notamediascanner;

import java.util.Scanner;

public class NotaMediaScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota parcial 1: ");
        double parcial1 = sc.nextInt();
        System.out.println("Nota parcial 2: ");
        double parcial2 = sc.nextInt();
        double notafinal = (parcial1 + parcial2) / 2;

        System.out.println("PROGRAMACÓN\n"
                + "\nParcial 1 = " + parcial1
                + "\nParcial 2 = " + parcial2
                + "\nFinal = " + notafinal);
    }

}
