package autopista;

import java.util.Scanner;

public class Autopista {

    public static void main(String[] args) {
        Cola EFECTIVO = new Cola();
        Cola IMPORTE = new Cola();
        Cola TARJETA = new Cola();

        Menu1(EFECTIVO, IMPORTE, TARJETA);
    }

    public static void Menu1(Cola EFECTIVO, Cola IMPORTE, Cola TARJETA) {
        System.out.println("----------------PRINCIPAL------------------");
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        boolean llave = true;
        do {
            System.out.println("1. EFECTIVO \n2. IMPORTE EXACTO \n3. TARJETA\n4. SALIR DEL PROGRAMA");
            int op = sc.nextInt();
            switch (op) {
                case 1 ->
                    Menu2(EFECTIVO);
                case 2 ->
                    Menu2(IMPORTE);
                case 3 ->
                    Menu2(TARJETA);
                case 4 ->
                    llave = false;
            }
            System.out.println("-------------------------------------------");
        } while (llave);

    }

    public static void Menu2(Cola cola) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("----------------OPCION------------------");
        System.out.println("1. ENTRA \n2. SALE \n3. MOSTRAR");
        int opc = sc.nextInt();

        switch (opc) {
            case 1 ->
                entra(cola);
            case 2 ->
                sale(cola);
            case 3 ->
                mostrar(cola);
            default ->
                Menu2(cola);
        }
        System.out.println("------------------------------------------");
    }

    private static void entra(Cola cola) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("------ENTRA COCHE-------");
        System.out.println("Matrícula: ");
        String matricula = sc.nextLine();
        System.out.println("Modelo: ");
        String modelo = sc.nextLine();
        System.out.println("Color: ");
        String color = sc.nextLine();

        Coche coche = new Coche(matricula, modelo, color);

        cola.meter(coche);
        System.out.println("------EL COCHE HA ENTRADO-------");
    }

    private static void sale(Cola cola) {
        cola.sacar();
    }

    private static void mostrar(Cola cola) {
        cola.listar();
    }
}
