package ejerciciosbuclesycondicionales;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        double dinero = 0.00;
        double valormonedas = 0.00;
        double monedas[];
        monedas = new double[100];
        boolean paso = true;

        System.out.println("Introduce el dinero real: ");
        dinero = sc.nextDouble();

        int i = 0;
        while (paso) {
            valormonedas = valormonedas + 2;
            if (valormonedas > dinero) {
                paso = false;
                valormonedas = valormonedas - 2;
            } else {
                monedas[i] = 2;
                i = i + 1;
            }
        }
        paso = true;
        while (paso) {
            valormonedas = valormonedas + 1;
            if (valormonedas > dinero) {
                paso = false;
                valormonedas = valormonedas - 1;
            } else {
                monedas[i] = 1;
                i = i + 1;
            }
        }
        paso = true;
        while (paso) {
            valormonedas = valormonedas + 0.50;
            if (valormonedas > dinero) {
                paso = false;
                valormonedas = valormonedas - 0.50;
            } else {
                monedas[i] = 0.50;
                i = i + 1;
            }
        }
        paso = true;
        while (paso) {
            valormonedas = valormonedas + 0.20;
            if (valormonedas > dinero) {
                paso = false;
                valormonedas = valormonedas - 0.20;
            } else {
                monedas[i] = 0.20;
                i = i + 1;
            }
        }
        paso = true;
        while (paso) {
            valormonedas = valormonedas + 0.10;
            if (valormonedas > dinero) {
                paso = false;
                valormonedas = valormonedas - 0.10;
            } else {
                monedas[i] = 0.10;
                i = i + 1;
            }
        }
        paso = true;
        while (paso) {
            valormonedas = valormonedas + 0.05;
            if (valormonedas > dinero) {
                paso = false;
                valormonedas = valormonedas - 0.05;
            } else {
                monedas[i] = 0.05;
                i = i + 1;
            }
        }
        paso = true;
        while (paso) {
            valormonedas = valormonedas + 0.02;
            if (valormonedas > dinero) {
                paso = false;
                valormonedas = valormonedas - 0.02;
            } else {
                monedas[i] = 0.02;
                i = i + 1;
            }
        }
        paso = true;
        while (paso) {
            valormonedas = valormonedas + 0.01;
            if (valormonedas > dinero) {
                paso = false;
                valormonedas = valormonedas - 0.01;
            } else {
                monedas[i] = 0.01;
                i = i + 1;
            }
        }
        System.out.println("Valor Introducido: " + dinero);
        System.out.println("Valor en monedas: " + valormonedas);

        for (int o = 0; o <= i; o++) {
            System.out.println("Una moneda de: " + monedas[o] + "€");
        }

    }
}
