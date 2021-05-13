package ejerciciosbuclesycondicionales;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        int segrestante;
        int minrestante;
        int horarestante;

        System.out.println("Introduce la hora: ");
        int hora = sc.nextInt();

        System.out.println("Introduce el minuto: ");
        int min = sc.nextInt();

        System.out.println("Introduce el segundo: ");
        int seg = sc.nextInt();

        System.out.println("La hora actual es: " + hora + ":" + min + ":" + seg);

        seg = seg + 60;

        if (seg >= 60) {
            segrestante = seg - 60;
            seg = segrestante;
            min = min + 1;
            if (min >= 60) {
                minrestante = min - 60;
                min = minrestante;
                hora = hora + 1;
                if (hora >= 24) {
                    hora = 0;
                }
            }
        }

        System.out.println("La hora dentro de un minuto es actual es: " + hora + ":" + min + ":" + seg);

    }
}
