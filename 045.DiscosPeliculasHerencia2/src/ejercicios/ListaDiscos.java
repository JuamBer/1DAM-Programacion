package ejercicios;

import java.util.Scanner;
import multimedia.ListaMultimedia;
import disco.Disco;

public class ListaDiscos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaMultimedia lista = new ListaMultimedia(10);
        int i = 0;
        do {
            System.out.println("Introduce Una Película: ");
            String pelicula = sc.nextLine();

            Disco musica = new Disco(pelicula, "Ben E. King", 2.55, "mp3", "Indie");
            lista.add(musica);
            i++;
        } while (i != 3);
        System.out.println(lista);
    }
}
