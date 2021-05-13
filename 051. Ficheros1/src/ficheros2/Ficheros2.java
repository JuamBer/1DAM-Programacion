package ficheros2;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ficheros2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("");
        //System.out.println("(ENTRADA)Introduce la url del fichero1:");
        String urlfichero = "src\\ficheros2\\fichero1.txt";
        //System.out.println("(ENTRADA)Introduce la url del fichero2:");
        //System.out.println("(SALIDA)Introduce la url del fichero3:");

        File fichero = null;
        FileReader readerfichero = null;
        BufferedReader bufferfichero = null;

        String linea;
        LinkedList<Integer> longitudlineas = new LinkedList<Integer>();

        try {
            fichero = new File(urlfichero);
            readerfichero = new FileReader(fichero);
            bufferfichero = new BufferedReader(readerfichero);

            while ((linea = bufferfichero.readLine()) != null) {
                longitudlineas.add(linea.length());
            }
            System.out.println("Número de Líneas: " + longitudlineas.size());
            System.out.println(longitudlineas);

        } catch (FileNotFoundException ex1) {
            System.out.println(ex1.getMessage());
        } catch (IOException ex2) {
            Logger.getLogger(Ficheros2.class.getName()).log(Level.SEVERE, null, ex2);
            System.out.println(ex2.getMessage());
        }

    }

}
