package arraysunidimensionales;

import java.util.Scanner;

public class ArraysUnidimensionales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int num = 0;
        do {
            System.out.println("1. Ejercicio1 \n2. Ejercicio2 \n3. Ejercicio3 \n4. Ejercicio4 \n5. Ejercicio5 \n6. Ejercicio6 \n7. EjercicioRepaso1 \n8. EjercicioRepaso2 \n9. EjercicioRepaso3 \n10.salir");
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
                    EjercicioRepaso1();
                case 8 ->
                    EjercicioRepaso2();
                case 9 ->
                    EjercicioRepaso3();
            }
        } while (num != 10);

    }

    public static void EjercicioRepaso1() {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int array[];
        array = new int[50];
        int pos = -1;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce El número de la posición " + i);
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println(" No hay ningún cero en el array");
        } else {
            System.out.println("El primer cero está en la posición " + pos);
        }
        System.out.println("___________________________________________________");
    }

    public static void EjercicioRepaso2() {
        System.out.println("No lo entiendo");
        System.out.println("___________________________________________________");
    }

    public static void EjercicioRepaso3() {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int P[];
        P = new int[10];

        int lon = 0;

        for (int i = 0; i < P.length; i++) {
            System.out.println("Introduce El número de la posición " + i);
            P[i] = sc.nextInt();
            if (P[i] > 10) {
                lon++;
            }
        }
        int V[];
        V = new int[lon];
        int v = 0;
        for (int i = 0; i < P.length; i++) {
            if (P[i] > 10) {
                V[v] = P[i];
                v++;
            }

        }
        mostrarEnPantalla(P);
        mostrarEnPantalla(V);
        System.out.println("___________________________________________________");
    }

    public static void mostrarEnPantalla(int[] array) {
        System.out.println("");
        System.out.println("_______ARRAY________");
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print("}");
        System.out.println("");
    }

    public static void mostrarEnPantallaAlreves(int[] array) {
        System.out.println("");
        System.out.println("_______ARRAY________");
        System.out.print("{");
        int num = array.length;
        for (int i = 0; i < array.length; i++) {
            int pos = num - i - 1;
            System.out.print(array[pos] + ",");
        }
        System.out.print("}");
        System.out.println("");
    }

    public static void Ejercicio1() {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int array[];
        array = new int[10];
        int n;
        int suma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un elemento en la posición " + i + " del array:");
            int num = sc.nextInt();
            array[i] = num;
        }

        do {
            System.out.println("Introduce un número N (del 1 al 10):");
            n = sc.nextInt();
        } while (n > 10 || n < 1);

        for (int i = 0; i < n; i++) {
            suma = suma + array[i];
        }
        System.out.println("La suma de los N primeros númeors es: " + suma);
        System.out.println("___________________________________________________");
    }

    public static void Ejercicio2() {

        int[] array = new int[]{10, 25, 26, 40, 37, 45, 90, 76, 78, 81, 58, 32};

        int destino[];
        destino = new int[12];

        for (int i = 0; i < 12; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("En la posición " + i + " hay un número par");
            }
        }
        int i = 0;
        for (int j = 0; j < 10; j++) {
            if ((array[j] % 2 == 0) && (array[j] > 25)) {
                destino[i] = array[j];
                i++;
            }
        }
        mostrarEnPantalla(array);
        mostrarEnPantalla(destino);
        System.out.println("___________________________________________________");

    }

    public static void Ejercicio3() {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int array[];
        array = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un elemento en la posición " + i + " del array:");
            int num = sc.nextInt();
            array[i] = num;
        }
        mostrarEnPantallaAlreves(array);
        System.out.println("___________________________________________________");
    }

    public static void Ejercicio4() {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int num;
        int array[];
        int mayor = 0;
        int posmayor = 0;
        array = new int[10];
        do {
            System.out.println("1. Introducir elementos manualmente \n2.Introducir elementos aleatóriamente");
            num = sc.nextInt();
        } while (num == 1 && num == 2);
        if (num == 1) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Introduce un elemento en la posición " + i + " del array:");
                int numero = sc.nextInt();
                array[i] = numero;
            }
        } else {
            for (int i = 0; i < 10; i++) {
                array[i] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < 10; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
                posmayor = i;
            }
        }
        System.out.println("El mayor número en el array es: " + mayor + " y está en la posición: " + posmayor);

        System.out.println("___________________________________________________");
    }

    public static void Ejercicio5() {
        System.out.println("No entiendo el enunciado");
        System.out.println("___________________________________________________");
    }

    public static void Ejercicio6() {
        System.out.println("No entiendo el enunciado");
        int array[];
        array = new int[100];
        int tiempoEquipo[];
        tiempoEquipo = new int[10];
        int arraytiempo[];
        arraytiempo = new int[100];
        int v = 0;
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
            arraytiempo[i] = (int) (90 + Math.random() * 10);
            switch (v) {
                case 0 ->
                    tiempoEquipo[0] = tiempoEquipo[0] + arraytiempo[i];
                case 1 ->
                    tiempoEquipo[1] = tiempoEquipo[1] + arraytiempo[i];
                case 2 ->
                    tiempoEquipo[2] = tiempoEquipo[2] + arraytiempo[i];
                case 3 ->
                    tiempoEquipo[3] = tiempoEquipo[3] + arraytiempo[i];
                case 4 ->
                    tiempoEquipo[4] = tiempoEquipo[4] + arraytiempo[i];
                case 5 ->
                    tiempoEquipo[5] = tiempoEquipo[5] + arraytiempo[i];
                case 6 ->
                    tiempoEquipo[6] = tiempoEquipo[6] + arraytiempo[i];
                case 7 ->
                    tiempoEquipo[7] = tiempoEquipo[7] + arraytiempo[i];
                case 8 ->
                    tiempoEquipo[8] = tiempoEquipo[8] + arraytiempo[i];
                case 9 ->
                    tiempoEquipo[9] = tiempoEquipo[9] + arraytiempo[i];
            }
            if (v == 9) {
                v = 0;
            } else {
                v++;
            }

        }
        for (int i = 0; i < 10; i++) {
            System.out.println("El tiempo del equipo " + i + " es: " + tiempoEquipo[i]);
        }
        System.out.println("___________________________________________________");
    }
}
