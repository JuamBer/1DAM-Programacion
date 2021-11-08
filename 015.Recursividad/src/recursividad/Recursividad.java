package recursividad;

import java.util.Scanner;

public class Recursividad {

    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        do {
            System.out.println("1.SumaRecursiva \n2.FactorialRecursiva\n3.Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce un número :");
                    int num = sc.nextInt();
                    System.out.println(" ");
                    System.out.print("El Suma desde " + num + " hasta 0 es:");
                    System.out.println(Suma(num));
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Introduce un número :");
                    int num2 = sc.nextInt();
                    System.out.println(" ");
                    System.out.print("El Factorial de " + num2 + " es:");
                    System.out.println(Factorial(num2));
                    System.out.println(" ");
                    break;
                case 3:
                    break;
            }
        } while (opcion != 3);

        System.out.println(Suma(5));
        System.out.println(Factorial(6));
    }

    public static int Suma(int num) {
        int inferior = num - 1;
        int resultado = 0;

        if (inferior != 0) {
            resultado = num + Suma(inferior);
        }

        return resultado;
    }

    public static int Factorial(int num) {
        int inferior = num - 1;
        int resultado = 1;

        if (inferior != 0) {
            resultado = num * Factorial(inferior);
        }

        return resultado;
    }

}
