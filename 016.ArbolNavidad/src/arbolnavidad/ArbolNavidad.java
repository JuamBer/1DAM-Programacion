package arbolnavidad;

import java.util.Scanner;
import java.lang.Math;

public class ArbolNavidad {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("Número de ramas: ");
        int ramas = sc.nextInt();
        DibujarArbol(ramas);
    }

    static void DibujarArbol(int ramas) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int rama;
        int ramasrama;
        int anchurarama = 0;
        int ramasramaprueba;
        int ramasprueba = ramas;
        boolean hola = true;
        boolean paso = true;

        for (rama = 1; rama <= ramasprueba; rama++) {
        }

        for (rama = 1; rama <= ramas; rama++) {

            ramasprueba--;

            for (ramasramaprueba = 1; ramasramaprueba < rama + 1; ramasramaprueba++) {
            }

            for (ramasrama = 1; ramasrama < rama + 2; ramasrama++) {

                if (hola == true) {
                    hola = false;
                    for (int i = ramasprueba; i > 0; i--) {
                        System.out.print(ANSI_BLACK + "  ");
                    }
                    System.out.print(ANSI_GREEN + " *");
                    System.out.println("");
                }
                for (int i = ramasprueba; i > 0; i--) {
                    System.out.print(ANSI_BLACK + "  ");
                }
                for (anchurarama = ramasramaprueba - 1; anchurarama > 0; anchurarama--) {
                    System.out.print(ANSI_CYAN + " ");
                }

                ramasramaprueba--;

                for (anchurarama = 0; anchurarama < ramasrama + rama - 1; anchurarama++) {

                    if (Math.floor(Math.random() * (3 - 0 + 1) + 0) == 3) {
                        System.out.print(ANSI_RED + "*");
                        System.out.print(ANSI_GREEN + "*");
                    } else {
                        System.out.print(ANSI_GREEN + "**");
                    }
                }

                System.out.println("");
            }

        }
        for (int i = 0; i < 2; i++) {
            for (int j = (anchurarama / 2) + (rama / 2) - 1; j >= 0; j--) {
                System.out.print(ANSI_CYAN + " ");
            }
            for (int a = 0; a < rama - 1; a++) {

                System.out.print(ANSI_BLACK + "*");
            }
            System.out.println("");
        }

    }

}
