package estructurarepetitiva2;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        double volumen, peso;
        double sumavolumen = 0;
        double sumapeso = 0;
        boolean pasopeso = false;
        boolean pasovolumen = false;
        boolean paso = false;
        do {
            System.out.println("Introduce el volumen: ");
            volumen = sc.nextInt();
            System.out.println("Introduce el peso ");
            peso = sc.nextInt();

            sumavolumen = sumavolumen + volumen;
            sumapeso = sumapeso + peso;

            if (sumavolumen >= 26.75) {
                pasovolumen = true;
                paso = true;
            }
            if (sumapeso >= 27800) {
                pasopeso = true;
                paso = true;
            }
        } while (paso == false);

        if (pasovolumen == true) {
            System.out.println("Demasiado volumen");
        }
        if (pasopeso == true) {
            System.out.println("Demasiado peso");
        }

    }
}
