package bombilla;

public class MainBombilla {

    public static void main(String[] args) {

        Bombilla B1 = new Bombilla(false);
        Bombilla B2 = new Bombilla(true);
        Bombilla B3 = new Bombilla(true);

        System.out.println(B1);
        System.out.println(B2);
        System.out.println(B3);
        System.out.println("EstadoGeneral: " + Bombilla.estadointerructorgeneral);

        B1.apretarInterructor();
        B3.apretarInterructor();

        System.out.println(B1);
        System.out.println(B2);
        System.out.println(B3);
        System.out.println("EstadoGeneral: " + Bombilla.estadointerructorgeneral);

        Bombilla.apretarInterructorGeneral();

        System.out.println(B1);
        System.out.println(B2);
        System.out.println(B3);
        System.out.println("EstadoGeneral: " + Bombilla.estadointerructorgeneral);
    }
}
