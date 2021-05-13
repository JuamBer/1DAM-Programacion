package agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAgenda {

    public static void main(String[] args) {
        ArrayList<Contacto> agenda = new ArrayList<Contacto>();

        agenda.add(new Contacto("Juan Sáez García", 665020636));
        agenda.add(new Contacto("Ivan Soriano Zapata", 876845432));
        agenda.add(new Contacto("Francisco Javier Peris", 997745248));
    }

    public static void Menu(ArrayList agenda) {
        boolean llave = true;
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        do {
            System.out.println("1.Ver Agenda\n1.Buscar Contacto\n3.Añadir Contacto\n4.Borrar Contacto\n5.Salir");
            int op = sc.nextInt();

            switch (op) {
                case 1 ->
                    verAgenda(agenda);
                case 2 ->
                    buscarContacto(agenda);
                case 3 ->
                    añadirContacto(agenda);
                case 4 ->
                    borrarContacto(agenda);
                case 5 ->
                    llave = false;
            }
        } while (llave);
    }

    public static void verAgenda(ArrayList agenda) {
        System.out.println(agenda);
    }

    public static void buscarContacto(ArrayList agenda) {

    }

    public static void añadirContacto(ArrayList agenda) {

    }

    public static void borrarContacto(ArrayList agenda) {

    }
}
