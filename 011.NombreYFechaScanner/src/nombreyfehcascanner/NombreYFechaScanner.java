package nombreyfehcascanner;

import java.util.Scanner;

public class NombreYFechaScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Edad de nacimiento: ");
        String nacimiento = sc.nextLine();

        System.out.println("nombre:" + nombre);
        System.out.println("fecha de nacimiento:" + nacimiento);
    }

}
