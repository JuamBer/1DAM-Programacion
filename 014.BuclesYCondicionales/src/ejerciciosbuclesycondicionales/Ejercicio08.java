package ejerciciosbuclesycondicionales;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        System.out.println("Introduce el numero de pasos de su llamada: ");
        int pasos = sc.nextInt();
        double coste = 0.00;

        if (pasos <= 5) {
            coste = 0.10;
        } else {
            pasos = pasos - 5;
            coste = 0.10;
            for (int i = 0; i < pasos; i++) {
                coste = coste + 0.05;
                System.out.println("Por hacer un paso más se le cobrará 0.05 adicional(" + coste + ")");
            }
        }
        System.out.println("El coste de la llamada es: " + coste);
    }
}
