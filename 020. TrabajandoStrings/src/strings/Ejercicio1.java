package strings;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        System.out.println("Nombre: ");
        String nombre = sc.next();
        System.out.println("Primer Apellido: ");
        String primerapellido = sc.next();
        System.out.println("Segundo Apellido: ");
        String segundoapellido = sc.next();

        String nombrecompleto = nombre + primerapellido + segundoapellido;
        System.out.println(nombrecompleto.toLowerCase() + "--" + nombrecompleto.toUpperCase() + "--" + nombrecompleto.length());

        if (nombrecompleto.length() > 4) {
            System.out.println(nombrecompleto.substring(0, 2));
            System.out.println(nombrecompleto.substring(nombrecompleto.length() - 2, nombrecompleto.length()));
        }

        String ultimo = nombrecompleto.substring(nombrecompleto.length() - 1, nombrecompleto.length());
        int numveces = 0;
        for (int i = 0; i < nombrecompleto.length(); i++) {
            if (ultimo.equals(nombrecompleto.substring(i, i + 1))) {
                numveces++;
            }
        }
        System.out.println("La " + ultimo + " Aparece " + numveces + " Veces");

        String primer = nombrecompleto.substring(0, 1);
        System.out.println(primer);
        String concurrencias = "";
        for (int i = 0; i < nombrecompleto.length(); i++) {
            if (primer.equals(nombrecompleto.substring(i, i + 1))) {
                concurrencias = concurrencias + nombrecompleto.substring(i, i + 1).toUpperCase();
            } else {
                concurrencias = concurrencias + nombrecompleto.substring(i, i + 1).toLowerCase();
            }
        }
        System.out.println(concurrencias);

        System.out.println("***" + nombrecompleto.substring(2, nombrecompleto.length() - 3) + "***");

        String nombrecompletoalreves = "";
        char valor;
        for (int i = 1; i <= nombrecompleto.length(); i++) {
            valor = nombrecompleto.charAt(nombrecompleto.length() - i);
            nombrecompletoalreves = nombrecompletoalreves + valor;
        }
        System.out.println(nombrecompletoalreves);
    }

}
