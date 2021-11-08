package Ejercicios;

import java.util.Scanner;
import multimedia.ListaMultimedia;
import pelicula.Pelicula;

public class ListaPeliculas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaMultimedia lista = new ListaMultimedia(10);
        int i = 0;
        do {
            System.out.println("Introduce Una Película: ");
            String pelicula = sc.nextLine();

            Pelicula peli = new Pelicula(pelicula, "Ben E. King", 2.55, "mp3", "ActorPrincipal", "ActrizPrincipal");
            lista.add(peli);
            i++;
        } while (i != 3);
        System.out.println(lista);
    }
}
