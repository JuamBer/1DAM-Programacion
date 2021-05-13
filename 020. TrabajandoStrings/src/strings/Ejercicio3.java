package strings;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        System.out.println("Introduce una frase: ");
        String texto = sc.nextLine();
        System.out.println(expresionesRegulares(texto));

    }

    public static String expresionesRegulares(String texto) {
        String textofinal = "";
        String valor;
        for (int i = 0; i < texto.length(); i++) {
            valor = texto.substring(i, i + 1);
            if (valor.equals("a") || valor.equals("e") || valor.equals("i") || valor.equals("o") || valor.equals("u")) {
                textofinal = textofinal + "a";
            } else {
                textofinal = textofinal + valor;
            }
        }
        return textofinal;
    }

}
