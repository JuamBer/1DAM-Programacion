package arraysbidimensionales;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ArraysBidimensionales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int num = 0;
        do {
            System.out.println("1. Ejercicio1 \n2. Ejercicio2 \n3. Ejercicio3 \n4. Ejercicio4 \n5. Ejercicio5 \n6. Ejercicio6 \n7. Ejercicio7 \n8. Ejercicio8 \n9. Ejercicio9 \n10.salir");
            num = sc.nextInt();
            switch (num) {
                case 1 ->
                    Ejercicio1();
                case 2 ->
                    Ejercicio2();
                case 3 ->
                    Ejercicio3();
                case 4 ->
                    Ejercicio4();
                case 5 ->
                    Ejercicio5();
                case 6 ->
                    Ejercicio6();
                case 7 ->
                    Ejercicio7();
                case 8 ->
                    Ejercicio8();
                case 9 ->
                    Ejercicio9();
            }
        } while (num != 10);
    }

    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("\n_______MATRIZ________\n{");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("{");

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + ",");
            }
            System.out.println("}");
        }
        System.out.print("}\n");
    }

    public static void mostrarMatrizDouble(double[][] matriz) {
        System.out.println("\n_______MATRIZ________\n{");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("{");

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + ",");
            }
            System.out.println("}");
        }
        System.out.print("}\n");
    }

    public static void llenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 5);
            }
        }
    }

    public static void Ejercicio1() {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int matriz[][] = new int[5][7];
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.print("\n Fila cinco: {");
        for (int j = 0; j < matriz[4].length; j++) {
            System.out.print(matriz[4][j] + ",");
        }
        System.out.print("}\n");
        System.out.print("\n Elemento cuarta fila tercera columna: {" + matriz[3][2] + ",}\n");
        System.out.print("\n Elemento quinta fila tercera columna: {" + matriz[4][2] + ",}\n");
        int valor = matriz[3][2];
        matriz[3][2] = matriz[4][2];
        matriz[4][2] = valor;
        mostrarMatriz(matriz);

        System.out.print("\n Primera Columna: {");
        for (int j = 0; j < 5; j++) {
            System.out.print(matriz[j][0] + ",");
        }
        System.out.print("}\n");
        System.out.print("\n Cuarta Columna: {");
        for (int j = 0; j < 5; j++) {
            System.out.print(matriz[j][3] + ",");
        }
        System.out.print("}\n");
        for (int i = 0; i < 5; i++) {
            valor = matriz[i][0];
            matriz[i][0] = matriz[i][3];
            matriz[i][3] = valor;
        }
        mostrarMatriz(matriz);
        System.out.println("___________________________________________________");
    }

    public static void Ejercicio2() {
        int TB[][] = new int[10][10];
        int valor;
        for (int i = 0; i < TB.length; i++) {
            if (i % 2 == 0) {
                valor = 1;
            } else {
                valor = 0;
            }
            for (int j = 0; j < TB[i].length; j++) {
                TB[i][j] = valor;
            }
        }
        mostrarMatriz(TB);
        System.out.println("___________________________________________________");

    }

    public static void Ejercicio3() {
        int matriz1[][] = new int[7][5];
        int matriz2[][] = new int[7][7];
        int suma[] = new int[7];
        llenarMatriz(matriz1);
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                if (i == 5) {
                    matriz2[j][i] = suma[j];
                } else {

                    if (i == 6) {
                        matriz2[j][i] = suma[j] / matriz2[i].length;

                    } else {
                        matriz2[j][i] = matriz1[j][i];
                        suma[j] = suma[j] + matriz2[j][i];

                    }
                }
            }

        }
        mostrarMatriz(matriz2);
        System.out.println("___________________________________________________");
    }

    public static void Ejercicio4() {
        int matriz[][] = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((i == j) || (i + j == matriz.length - 1)) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        mostrarMatriz(matriz);
        System.out.println("___________________________________________________");
    }

    public static void Ejercicio5() {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int matriz1[][] = new int[5][4];
        int matriz2[][] = new int[5][4];
        int suma[][] = new int[5][4];
        int valor;
        for (int x = 0; x < matriz1.length; x++) {
            for (int y = 0; y < matriz1[x].length; y++) {
                System.out.println("Introduce el valor de la primera matriz, posición x,y: " + x + "," + y);
                valor = sc.nextInt();
                matriz1[x][y] = valor;
            }
        }
        for (int x = 0; x < matriz2.length; x++) {
            for (int y = 0; y < matriz2[x].length; y++) {
                System.out.println("Introduce el valor de la segunda matriz, posición x,y: " + x + "," + y);
                valor = sc.nextInt();
                matriz2[x][y] = valor;
            }
        }
        for (int x = 0; x < suma.length; x++) {
            for (int y = 0; y < suma[x].length; y++) {
                suma[x][y] = matriz1[x][y] + matriz2[x][y];
            }
        }
        mostrarMatriz(matriz1);
        mostrarMatriz(matriz2);
        mostrarMatriz(suma);
        System.out.println("___________________________________________________");
    }

    public static void Ejercicio6() {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int matriz[][] = new int[3][6];
        int max[] = new int[2];
        int min[] = new int[2];
        int maxFila[] = new int[2];
        int minFila[] = new int[2];
        int suma = 0;
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.println("Introduce el valor de la matriz, posición x,y: " + x + "," + y);
                matriz[x][y] = sc.nextInt();
            }
        }

        int maxi = matriz[0][0];
        int mini = matriz[0][0];
        int maxFilaAbs;
        int minFilaAbs;
        mostrarMatriz(matriz);
        int cont = 1;
        for (int x = 0; x < matriz.length; x++) {
            maxFilaAbs = matriz[x][0];
            minFilaAbs = matriz[x][0];
            for (int y = 0; y < matriz[x].length; y++) {
                cont++;
                suma = suma + matriz[x][y];
                if (matriz[x][y] > maxFilaAbs) {
                    maxFilaAbs = matriz[x][y];
                    maxFila[0] = x + 1;
                    maxFila[1] = y + 1;
                } else {
                    if (matriz[x][y] < minFilaAbs) {
                        minFilaAbs = matriz[x][y];
                        minFila[0] = x + 1;
                        minFila[1] = y + 1;
                    }
                }
                if (matriz[x][y] > maxi) {
                    maxi = matriz[x][y];
                    max[0] = x + 1;
                    max[1] = y + 1;
                } else {
                    if (matriz[x][y] < mini) {
                        mini = matriz[x][y];
                        min[0] = x + 1;
                        min[1] = y + 1;
                    }
                }
            }
            System.out.println("maxFila: " + maxFilaAbs + "(" + maxFila[0] + "," + maxFila[1] + ") minFila: " + minFilaAbs + "(" + minFila[0] + "," + minFila[1] + ")");

        }
        System.out.println("max: " + maxi + "(" + max[0] + "," + max[1] + ") min: " + mini + "(" + min[0] + "," + min[1] + ")");
        System.out.println("media: " + suma / cont + ", suma todos: " + suma);
        System.out.println("___________________________________________________");
    }

    public static void Ejercicio7() {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int matriz[][] = new int[4][4];
        boolean llave = true;
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.println("Introduce el valor de la matriz, posición x,y: " + x + "," + y);
                matriz[x][y] = sc.nextInt();
            }
        }
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (matriz[x][y] != matriz[y][x]) {
                    llave = false;
                    break;
                }
            }
        }
        if (llave == true) {
            System.out.println("Es una matríz simétrica");
        } else {
            System.out.println("No es una matríz simétrica");
        }
        System.out.println("___________________________________________________");
    }

    public static void Ejercicio8() {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        double matriz[][] = {{7.30, 7.35, 9.30, 9.30, 9.30, 13.00}, {7.30, 12.30, 13.06, 17.17, 19.00, 9.32}, {7.30, 12.00, 13.27, 15.40, 17.07, 18.00}, {9.00, 13.06, 7.30, 7.30, 9.30, 17.07}, {9.14, 9.30, 17.07, 13.06, 15.40, 15.40
        }, {12.30, 17.07, 7.30, 9.30, 15.40, 13.06}, {9.00, 9.30, 13.06, 17.07, 7.30, 9.30}};
        mostrarMatrizDouble(matriz);
        List horasAntes = new ArrayList();
        System.out.println("Sinceramente no entiendo el enunciado, muchos enunciados no se entienden por si mismos.");
        System.out.println("Todos los empleados que llegaron antes de la hora que introduzcas:");
        double hora = sc.nextDouble();

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (matriz[x][y] < hora) {
                    horasAntes.add(String.valueOf(x) + String.valueOf(y));
                }

            }
        }
        System.out.println(horasAntes);
        System.out.println("Inicio hora:");
        double inicio = sc.nextDouble();
        System.out.println("Fin hora:");
        double fin = sc.nextDouble();
        int cont = 0;
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 1; y < matriz[x].length; y++) {
                if (inicio < matriz[x][y] && fin > matriz[x][y]) {
                    cont++;
                }

            }
        }

        System.out.println(cont);
        System.out.println("___________________________________________________");
    }

    public static void Ejercicio9() {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("Este ejercicio lo entiendo aún menos");
        System.out.println("___________________________________________________");
    }
}
