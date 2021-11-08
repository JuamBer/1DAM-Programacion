package strings;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        System.out.println("Introduce una frase: ");
        String texto = sc.nextLine();
        System.out.println(expresionesRegulares(texto));

    }

    public static String expresionesRegulares(String texto) {

        String siglas = "";
        for (int i = 0; i < texto.length(); i++) {
            String valor = texto.substring(i, i + 1);
            if (valor.equals("\\s")) {
                siglas = siglas + texto.substring(i + 1, i + 2).toUpperCase();
            }
        }
        return siglas;
    }
}
