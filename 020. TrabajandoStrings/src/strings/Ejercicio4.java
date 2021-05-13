package strings;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        System.out.println("Introduce una frase: ");
        String texto = sc.nextLine();
        System.out.println(expresionesRegulares(texto));

    }

    public static String expresionesRegulares(String texto) {
        String textofinal = texto.replaceAll("\\d+", "*");

        return textofinal;
    }

}
