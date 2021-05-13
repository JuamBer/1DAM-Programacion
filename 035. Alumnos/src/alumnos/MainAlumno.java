package alumnos;

import java.util.Scanner;

public class MainAlumno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        Alumnos al[] = new Alumnos[3];
        String nombre;
        String apellido;
        int notafinal;
        int suma = 0;
        int contador = 0;

        for (int i = 0; i < al.length; i++) {
            System.out.println("Introduce el nombre del alumno " + i + ": ");
            nombre = sc.nextLine();
            System.out.println("Introduce el apellido del alumno " + i + ": ");
            apellido = sc.nextLine();
            System.out.println("Introduce la nota final del alumno " + i + ": ");
            notafinal = sc.nextInt();
            sc.nextLine();

            al[i] = new Alumnos(nombre, apellido, notafinal);
        }

        for (int i = 0; i < al.length; i++) {
            System.out.println(al[i]);
        }

        System.out.println("La media de los Alumnos es: " + media(al));

        for (int i = 0; i < al.length; i++) {
            if (al[i].getNotaFinal() > media(al)) {
                contador++;
                System.out.println("El alumno " + i + " (" + al[i].getNombre() + "), Supera la media (" + al[i].getNotaFinal() + ")");
            }
        }
        System.out.println(contador + " Alumnos superan la media");
    }

    public static float media(Alumnos al[]) {
        float media = 0;
        for (int i = 0; i < al.length; i++) {
            media = media + al[i].getNotaFinal();
        }
        media = media / al.length;
        return media;
    }
}
