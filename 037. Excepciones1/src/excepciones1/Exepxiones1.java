package excepciones1;

import java.io.EOFException;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;

public class Exepxiones1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        boolean llave = true;
        do {
            try {
                System.out.println("Introduce un número: ");
                int a = sc.nextInt();
                System.out.println("Introduce otro número: ");
                int b = sc.nextInt();
                System.out.println(a / b);
                llave = false;
            } catch (ArithmeticException ex1) {
                System.out.println("Disivión entre 0");
            } catch (InputMismatchException ex2) {
                System.out.println("No s epuede dividir texto");
            } catch (Exception ex3) {
                System.out.println("Error desconocido");
            } finally {
                sc.nextLine();
                System.out.println("El programa ya ha acabado");
            }
        } while (llave);

    }
}
