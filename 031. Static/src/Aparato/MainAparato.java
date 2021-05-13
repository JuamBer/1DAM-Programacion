package Aparato;

public class MainAparato {

    public static void main(String[] args) {
        Aparato bombilla = new Aparato(100);
        Aparato radiador = new Aparato(2000);
        Aparato plancha = new Aparato(1200);

        System.out.println(bombilla);
        System.out.println(radiador);
        System.out.println(plancha);

        System.out.println("Consumo Total: " + Aparato.consumoTotal);

        bombilla.encender();
        plancha.encender();

        System.out.println(bombilla);
        System.out.println(radiador);
        System.out.println(plancha);

        System.out.println("Consumo Total: " + Aparato.consumoTotal);

        radiador.encender();
        plancha.apagar();

        System.out.println(bombilla);
        System.out.println(radiador);
        System.out.println(plancha);

        System.out.println("Consumo Total: " + Aparato.consumoTotal);

    }

}
