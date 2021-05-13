package coche.poo1;

public class CochePOO1 {

    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();

        coche1.actualizarColor("Rojo");
        coche2.actualizarColor("Negro");
        coche3.actualizarColor("Azul");

        coche1.actualizarModelo("Ferrari extreme edition");
        coche2.actualizarModelo("Audi 200C");
        coche3.actualizarModelo("Tesla Model S");

        coche1.imprimeCoche();
        coche2.imprimeCoche();
        coche3.imprimeCoche();

    }
}
