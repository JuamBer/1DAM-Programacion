package rebaja;

public class Rebaja {

    public static void main(String[] args) {
        double precio = 85.00;
        double rebaja = 15;
        double preciofinal = (100 - rebaja) * precio;

        System.out.println("Precio final con el descuento aplicado es: " + preciofinal);
    }

}
