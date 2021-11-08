package Adivinan;

import java.util.Scanner;

public class Adivinan {

    public static void main(String[] args) {
        int num_adiv = 0;
        int num_usu = 0;
        int veces = 0;
        Scanner sc = new Scanner(System.in);
        num_adiv = (int) (Math.random() * 100);
        do {
            System.out.println("Dame número");

            num_usu = sc.nextInt();
            sc.nextLine();
            veces++;
            if (num_usu < num_adiv) {
                System.out.println("El num buscado es mayor");
            } else {
                if (num_usu > num_adiv) {
                    System.out.println("El num buscado es menor");
                } else {
                    System.out.println("Acertaste en " + veces);
                }
            }
        } while (num_adiv != num_usu);
    }
}
