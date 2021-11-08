package strings;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        System.out.println("Introduce una frase: ");
        String texto = sc.nextLine();
        System.out.println(expresionesRegulares(texto));

    }

    public static int expresionesRegulares(String texto) {
        int palabras = 0;
        for (int i = 0; i < texto.length(); i++) {
            String valor = texto.substring(i, i + 1);
            if (valor.equals("\\s")) {
                palabras++;
            }
        }
        return palabras;
    }
}
