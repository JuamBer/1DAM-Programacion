package excepciones2;

import java.io.EOFException;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;

public class Exepxiones2 {

    public static void main(String[] args) {
        float valor = 0;
        boolean continuar = true;
        do {
            try {
                valor = leerReal();
                continuar = false;
            } catch (Exception e2) {
                System.out.println("Introduce un valor correcto (Un real funciona con punto no con coma)");
            }
        } while (continuar);

        System.out.println("valor Real: " + valor);
    }

    public static float leerReal() throws Exception {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        String cadena;
        float valor;
        try {
            System.out.println("Introduce un número real");
            cadena = sc.nextLine();
            valor = Float.parseFloat(cadena);
        } catch (Exception ex) {
            System.out.println("Error");
            throw ex;
        }
        return valor;
    }
}
