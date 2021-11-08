package bancoinversion;

public class BancoInversion {

    public static void main(String[] args) {
        double cantidadinicial = 2000;
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
