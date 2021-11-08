package bancoinversionscanner;

import java.util.Scanner;

public class BancoInversionScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dinero Inicial: ");
        double cantidadinicial = sc.nextInt();
        double rentabilidad = 1.0275;
        double retencion = 0.82;

        double cantidadfinalsinhacienda = cantidadinicial * rentabilidad;
        double sinhacienda = cantidadinicial - cantidadfinalsinhacienda;
        double conhacienda = sinhacienda * retencion;
        double cantidadfinal = cantidadfinalsinhacienda - conhacienda;

        System.out.println("Cantidad Inicial: " + cantidadinicial);
        System.out.println("Cantidad Final: " + cantidadfinal);

    }

}
