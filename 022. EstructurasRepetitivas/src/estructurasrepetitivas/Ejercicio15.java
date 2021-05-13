package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("Introduce un número N de caracteres a introducir: ");
        int num = sc.nextInt();
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for (int j = 0; j < num; j++) {
            System.out.println("Introduce un caracter: ");
            char letra = sc.next().charAt(0);
            switch (letra) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
        }

        System.out.println("Número de as: " + a);
        System.out.println("Número de es: " + e);
        System.out.println("Número de is: " + i);
        System.out.println("Número de os: " + o);
        System.out.println("Número de us: " + u);

    }
}
