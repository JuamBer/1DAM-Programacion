package ampliacion2;

import java.util.Scanner;

public class MainAlumnos2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        Alumnos2 al[] = new Alumnos2[3];
        String nombre;
        String apellido;
        int primera, segunda, tercera;
        int contador = 0;
        float mediasalmunos[] = new float[al.length];
        float mediaalumnos = 0;

        for (int i = 0; i < al.length; i++) {
            System.out.println("Introduce el nombre del alumno " + i + ": ");
            nombre = sc.nextLine();
            System.out.println("Introduce el apellido del alumno " + i + ": ");
            apellido = sc.nextLine();

            System.out.println("Introduce la nota de la primera ev: ");
            primera = sc.nextInt();
            System.out.println("Introduce la nota de la segunda ev: ");
            segunda = sc.nextInt();
            System.out.println("Introduce la nota de la tercera ev: ");
            tercera = sc.nextInt();
            sc.nextLine();

            al[i] = new Alumnos2(nombre, apellido, primera, segunda, tercera);
            mediasalmunos[i] = al[i].notas.mediaAlumno();
        }

        for (int i = 0; i < al.length; i++) {
            System.out.println(al[i]);
        }
        mediaalumnos = media(mediasalmunos);
        System.out.println("La media de los Alumnos es: " + mediaalumnos);

        for (int i = 0; i < al.length; i++) {
            if (mediasalmunos[i] > mediaalumnos) {
                contador++;
                System.out.println("El alumno " + i + " (" + al[i].getNombre() + "), Supera la media (" + mediasalmunos[i] + ")");
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
