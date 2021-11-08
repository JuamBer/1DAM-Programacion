package ejerciciosbuclesycondicionales;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        int numeros[];
        numeros = new int[10];

        for (int i = 0; i <= 9; i++) {
            System.out.println("Introduce un número: ");
            int numero = sc.nextInt();
            numeros[i] = numero;
        }

        double media = 0.0;
        int longitud = numeros.length;
        for (int i = 0; i < longitud; i++) {
            media = media + numeros[i];
        }

        media = media / longitud;

        System.out.println("La media de los " + longitud + " números introducidos es: " + media);
    }
}
