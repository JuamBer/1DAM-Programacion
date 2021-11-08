package ficheros1;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ficheros1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("USAREMOS LOS FICHEROS: fichero1.txt, fichero2.txt y fichero3.txt");
        //System.out.println("(ENTRADA)Introduce la url del fichero1:");
        String urlfichero1 = "src\\ficheros1\\fichero1.txt";
        //System.out.println("(ENTRADA)Introduce la url del fichero2:");
        String urlfichero2 = "src\\ficheros1\\fichero2.txt";
        //System.out.println("(SALIDA)Introduce la url del fichero3:");
        String urlfichero3 = "src\\ficheros1\\fichero3.txt";

        File fichero1, fichero2, fichero3 = null;
        FileReader readerfichero1, readerfichero2, readerfichero3 = null;
        BufferedReader bufferfichero1, bufferfichero2, bufferfichero3 = null;
        FileWriter writerfichero3 = null;
        PrintWriter printwriter = null;

        String linea;
        String lineacompleta = "";
        try {
            fichero1 = new File(urlfichero1);
            fichero2 = new File(urlfichero2);
            fichero3 = new File(urlfichero3);
            readerfichero1 = new FileReader(fichero1);
            readerfichero2 = new FileReader(fichero2);
            readerfichero3 = new FileReader(fichero3);
            bufferfichero1 = new BufferedReader(readerfichero1);
            bufferfichero2 = new BufferedReader(readerfichero2);
            bufferfichero3 = new BufferedReader(readerfichero3);
            writerfichero3 = new FileWriter(fichero3);
            printwriter = new PrintWriter(writerfichero3);

            while ((linea = bufferfichero1.readLine()) != null) {
                System.out.println("Leyendo: '" + linea + "' de fichero1.txt");
                lineacompleta = "";
                lineacompleta = lineacompleta + linea;
                linea = bufferfichero2.readLine();
                System.out.println("Leyendo: '" + linea + "' de fichero2.txt");
                lineacompleta = lineacompleta + linea;
                System.out.println("Escribiendo '" + lineacompleta + "' en fichero3.txt...");
                printwriter.println(lineacompleta);
            }
            System.out.println("Cambios realizados en fichero3.txt");

        } catch (FileNotFoundException ex1) {
            System.out.println(ex1.getMessage());
        } catch (IOException ex2) {
            Logger.getLogger(Ficheros1.class.getName()).log(Level.SEVERE, null, ex2);
            System.out.println(ex2.getMessage());
        } finally {
            try {
                if (null != fichero3) {
                    printwriter.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

}
