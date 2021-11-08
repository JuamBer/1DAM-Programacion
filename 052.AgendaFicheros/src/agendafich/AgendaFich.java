package agendafich;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AgendaFich {

    public static void main(String[] args) {
        ArrayList<Contacto> agenda = new ArrayList<Contacto>();

        agenda.add(new Contacto("Juan Sáez García", 665020636));
        agenda.add(new Contacto("Ivan Soriano Zapata", 876845432));
        agenda.add(new Contacto("Francisco Javier Peris", 997745248));

        Menu(agenda);
    }

    public static void Menu(ArrayList<Contacto> agenda) {
        boolean llave = true;
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        do {
            System.out.println("1.Ver Agenda\n2.Buscar Contacto\n3.Añadir Contacto\n4.Borrar Contacto\n5.Exportar Contactos\n6.Salir");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    verAgenda(agenda);
                    break;
                case 2:
                    buscarContacto(agenda);
                    break;
                case 3:
                    añadirContacto(agenda);
                    break;
                case 4:
                    borrarContacto(agenda);
                    break;
                case 5:
                    exportarContactos(agenda);
                    break;
                case 6:
                    exportarBinario(agenda);
                    llave = false;
                    break;
            }
        } while (llave);
    }

    public static void verAgenda(ArrayList<Contacto> agenda) {
        System.out.println("\n--AGENDA--");
        for (int i = 0; i < agenda.size(); i++) {
            System.out.println(agenda.get(i));
        }
        System.out.println("\n");
    }

    public static void buscarContacto(ArrayList<Contacto> agenda) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("\n Introduce un nombre: ");
        String nombre = sc.nextLine();
        boolean a = false;
        for (int i = 0; i < agenda.size(); i++) {
            if (agenda.get(i).getNombre().equals(nombre)) {
                System.out.println(agenda.get(i));
                a = true;
                i = agenda.size();
            }
        }
        if (a == false) {
            System.out.println("No se ha encontrado ningún contacto\n");
        }
    }

    public static void añadirContacto(ArrayList<Contacto> agenda) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("\n Introduce su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("\n Introduce su teléfono: ");
        int telefono = sc.nextInt();
        agenda.add(new Contacto(nombre, telefono));
    }

    public static void borrarContacto(ArrayList<Contacto> agenda) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("\n Introduce un nombre: ");
        String nombre = sc.nextLine();
        boolean a = false;
        for (int i = 0; i < agenda.size(); i++) {
            if (agenda.get(i).getNombre().equals(nombre)) {
                agenda.remove(i);
                System.out.println("Contacto Borrado");
                a = true;
                i = agenda.size();
            }
        }
        if (a == false) {
            System.out.println("No se ha encontrado ningún contacto\n");
        }
    }

    public static void exportarContactos(ArrayList<Contacto> agenda) {
        String urlcarpeta = "src\\agendafich\\exportaciones";
        String urlfichero = "src\\agendafich\\exportaciones\\agenda.txt";
        File carpeta = null;
        File fichero = null;
        FileWriter writerfichero = null;
        PrintWriter printwriter = null;

        try {
            carpeta = new File(urlcarpeta);
            carpeta.mkdirs();
            fichero = new File(urlfichero);
            writerfichero = new FileWriter(fichero);
            printwriter = new PrintWriter(writerfichero);

            for (int i = 0; i < agenda.size(); i++) {
                printwriter.println(agenda.get(i));
            }
            System.out.println("Exportado con éxito");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (printwriter != null) {
                printwriter.close();
            }
        }
    }

    public static void exportarBinario(ArrayList<Contacto> agenda) {
        String urlfichero = "src\\agendafich\\agenda.dat";
        File fichero = null;
        FileOutputStream fileoutput = null;
        DataOutputStream dataoutput = null;

        try {
            fichero = new File(urlfichero);
            fileoutput = new FileOutputStream(fichero);
            dataoutput = new DataOutputStream(fileoutput);

            for (int i = 0; i < agenda.size(); i++) {
                dataoutput.writeUTF(agenda.get(i).getNombre());
                dataoutput.writeInt(agenda.get(i).getTelefono());
            }
            System.out.println("Exportado con éxito");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (dataoutput != null) {
                try {
                    dataoutput.close();
                } catch (IOException ex) {
                    Logger.getLogger(AgendaFich.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
