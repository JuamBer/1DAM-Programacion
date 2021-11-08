package ficheros3;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ficheros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        //System.out.println("(ENTRADA)Introduce la url del fichero1:");
        String urlfichero1 = "src\\ficheros3\\fichero1.txt";
        //System.out.println("(SALIDA)Introduce la url del fichero2:");
        String urlfichero2 = "src\\ficheros3\\fichero2.txt";

        File fichero1, fichero2 = null;

        try {
            fichero1 = new File(urlfichero1);
            fichero2 = new File(urlfichero2);

            escribirFichero(leerFichero(fichero1), fichero2);
            System.out.println("FIN");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static String leerFichero(File fichero) {
        String texto = "";
        String linea;
        try {
            FileReader readerfichero = new FileReader(fichero);
            BufferedReader bufferfichero = new BufferedReader(readerfichero);

            while ((linea = bufferfichero.readLine()) != null) {
                texto = texto + "\n" + linea;
            }
        } catch (FileNotFoundException ex1) {
            System.out.println(ex1.getMessage());
        } catch (IOException ex2) {
            System.out.println(ex2.getMessage());
        }
        return texto;
    }

    public static void escribirFichero(String msg, File fichero) {
        FileWriter writerfichero = null;
        PrintWriter printwriter = null;
        try {

            writerfichero = new FileWriter(fichero, true);
            printwriter = new PrintWriter(writerfichero);

            printwriter.println(msg);

        } catch (Exception ex1) {
            System.out.println(ex1.getMessage());
        } finally {
            try {
                printwriter.close();
            } catch (Exception ex1) {
                System.out.println(ex1.getMessage());
            }
        }
    }
}
