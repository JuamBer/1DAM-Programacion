package gestionalmacenes;

import java.util.Scanner;

public class GestionAlmacenes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int opcion;

        Almacen a1 = new Almacen(2);
        Almacen a2 = new Almacen(4);
        Almacen a3 = new Almacen(8);

        do {
            System.out.println("1.Almacenar un contenedor \n2.Sacar un contenedor \n3.Ver estado almacenes \n4.Cerrar Programa");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    if (!a1.estaLleno()) {
                        a1.llenar();
                    } else {
                        if (!a2.estaLleno()) {
                            a2.llenar();
                        } else {
                            if (!a3.estaLleno()) {
                                a3.llenar();
                            } else {
                                System.out.println("Todos los almacenes están llenos");
                            }
                        }
                    }
                    break;
                case 2:
                    if (!a1.estaVacio()) {
                        a1.vaciar();
                    } else {
                        if (!a2.estaVacio()) {
                            a2.vaciar();
                        } else {
                            if (!a3.estaVacio()) {
                                a3.vaciar();
                            } else {
                                System.out.println("Todos los almacenes están vacios");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.print(a1);
                    System.out.print(a2);
                    System.out.print(a3);
                    break;
            }
        } while (opcion != 4);

    }

}
