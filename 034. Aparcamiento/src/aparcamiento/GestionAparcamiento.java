package aparcamiento;


import java.util.Scanner;

public class GestionAparcamiento {

    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        Aparcamiento a1 = new Aparcamiento(5);
        Puerta p1 = new Puerta(a1);
        Puerta p2 = new Puerta(a1);
        Puerta p; //Puerta comodín, para asignarle la puerta seleccionada

        int puerta;
        do {
            System.out.println("Parking:" + p1);
            puerta = elegirPuerta();

            if (puerta != 0) {
                if (puerta == 1) { //asigno a la puerta p, la puerta elegida
                    p = p1;
                } else {
                    p = p2;
                }
                if (entrarSalir() == 'E') {
                    //Dependiendo de si entra o sale, lo hago con la puerta elegida: p
                    p.entrarCoche();
                } else {
                    p.salirCoche();
                }
            }
        } while (puerta != 0);
    }

    public static int elegirPuerta() {
        return (int) (Math.random());
        /*MUESTRA LAS 2 PUERTAS Y DEVULEVE UNA CORRECTA */
    }

    public static char entrarSalir() {
        int i = (int) (Math.random());
        char var;
        if (i == 0) {
            var = 'E';
        } else {
            var = 'S';
        }
        return var;
        /*DEVUELVE SI QUIERE ENTRAR (E) O SALIR (S)*/
    }
}
