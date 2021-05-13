package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("Introduce un número");
        String num = sc.nextLine();
        System.out.println(num + " tiene " + num.length() + " Caracteres");
    }
}
