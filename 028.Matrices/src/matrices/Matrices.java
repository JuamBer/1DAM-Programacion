package matrices;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        int A[][] = {{2, 3, 5}, {0, 0, 1}, {1, 0, 1}};
        int B[][] = {{1, 1, 1}, {0, 2, 1}, {1, 1, 0}};

        mostrarMatriz(multiplicarMatrices(A, B));

        mostrarMatriz(rellenarMatriz());

    }

    public static int[][] rellenarMatriz() {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        // Pedimos como quiere la matriz
        System.out.println("¿De cuantas filas quieres la matriz?");
        int filas = sc.nextInt();
        System.out.println("¿De cuantas columnas quieres la matriz?");
        int columnas = sc.nextInt();

        // Creamos la matriz del tamaño que quiera el usuario
        int B[][] = new int[filas][columnas];

        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                // Pedimos valores y los introducimos en la nueva matriz
                System.out.println("Introduce el valor para la posición " + (f + 1) + "," + (c + 1) + " de la matriz:");
                B[f][c] = sc.nextInt();
            }
        }
        // Devolvemos matriz
        return B;
    }

    public static void mostrarMatriz(int[][] A) {
        for (int c = 0; c < A[0].length; c++) {
            System.out.print("[ ");
            for (int f = 0; f < A.length; f++) {
                if (f + 1 == A[f].length) {
                    System.out.print("[" + A[f][c] + "]");
                } else {
                    System.out.print("[" + A[f][c] + "],");
                }
            }
            if (c + 1 == A.length) {
                System.out.print(" ]\n");
            } else {
                System.out.print(" ],\n");
            }
        }
    }

    public static int[][] multiplicarMatrices(int[][] A, int[][] B) {
        int C[][] = new int[3][3];
        for (int c = 0; c < B[0].length; c++) {
            for (int f = 0; f < A.length; f++) {
                int suma = 0;
                for (int i = 0; i < A[0].length; i++) {
                    suma += A[f][i] * B[i][c];
                }
                C[f][c] = suma;
            }

        }
        return C;
    }
}
