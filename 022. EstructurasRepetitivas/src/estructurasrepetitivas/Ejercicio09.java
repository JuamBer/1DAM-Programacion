package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("Introduce la base: ");
        int base = sc.nextInt();
        System.out.println("Introduce el exponente: ");
        int exponente = sc.nextInt();
        int resultado = base;
        for (int i = 1; i < exponente; i++) {
            resultado = base * resultado;
        }
        System.out.println("El resultado es: " + resultado);
    }
}
