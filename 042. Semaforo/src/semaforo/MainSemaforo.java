package semaforo;

import java.util.Scanner;

public class MainSemaforo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean llave = true;
        do {
            System.out.println("Introduce un estado para el semáforo: ");
            String estado = sc.nextLine();
            if (estado.equals("ROJO") || estado.equals("VERDE") || estado.equals("AMARILLO")) {
                Semaforo s1 = new Semaforo(estado);
                System.out.println("EL ESTADO ES:" + s1.getSemaforo());
                llave = false;
            } else {
                System.out.println("El estado debe ser ROJO,AMARILLO o VERDE");
            }

        } while (llave);

    }
}
