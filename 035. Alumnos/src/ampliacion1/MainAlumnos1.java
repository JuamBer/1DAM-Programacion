package ampliacion1;

import java.util.Scanner;

public class MainAlumnos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        Alumnos1 al[] = new Alumnos1[3];
        String nombre;
        String apellido;
        int notasalumno[] = new int[3];

        float notafinalalumnos[] = new float[3];
        float mediaalumnos;
        int contador = 0;

        for (int i = 0; i < al.length; i++) {
            System.out.println("Introduce el nombre del alumno " + i + ": ");
            nombre = sc.nextLine();
            System.out.println("Introduce el apellido del alumno " + i + ": ");
            apellido = sc.nextLine();

            for (int j = 0; j < notasalumno.length; j++) {
                System.out.println("Introduce la nota " + j + " final del alumno " + i + ": ");
                notasalumno[j] = sc.nextInt();
                sc.nextLine();
            }
            al[i] = new Alumnos1(nombre, apellido, notasalumno);
            notafinalalumnos[i] = al[i].media(notasalumno);
        }
        mediaalumnos = media(notafinalalumnos);

        for (int i = 0; i < al.length; i++) {
            System.out.println(al[i]);
        }

        System.out.println("La media de los Alumnos es: " + mediaalumnos);

        for (int i = 0; i < al.length; i++) {
            if (notafinalalumnos[i] > mediaalumnos) {
                contador++;
                System.out.println("El alumno " + i + " (" + al[i].getNombre() + "), Supera la media (" + notafinalalumnos[i] + ")");
            }
        }
        System.out.println(contador + " Alumnos superan la media");
    }

    public static float media(float notas[]) {
        float media = 0;
        for (int i = 0; i < notas.length; i++) {
            media = media + notas[i];
        }
        media = media / notas.length;
        return media;
    }
}
