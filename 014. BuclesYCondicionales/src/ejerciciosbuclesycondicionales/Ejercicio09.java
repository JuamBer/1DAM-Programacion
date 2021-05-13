package ejerciciosbuclesycondicionales;

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        int coste = 500;
        double descuento = 0;

        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();

        sc.nextLine();
        System.out.println("¿Tus padres son socios? (S/N): ");
        String socios = sc.nextLine();

        if (edad > 65) {
            descuento = 0.50;
        } else {
            if (edad < 18) {
                if ("S".equals(socios)) {
                    descuento = 0.35;
                } else {
                    descuento = 0.25;
                }
            }
        }
        System.out.println("La cuota es de: " + coste * (1 - descuento));
    }
}
