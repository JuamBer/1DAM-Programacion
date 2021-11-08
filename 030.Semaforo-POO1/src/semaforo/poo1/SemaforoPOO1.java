package semaforo.poo1;

public class SemaforoPOO1 {

    public static void main(String[] args) {

        Semaforo misemaforo = new Semaforo();
        Semaforo semaforodemicalle = new Semaforo();
        Semaforo otrosemaforo = new Semaforo();

        misemaforo.PonColor("Rojo");
        otrosemaforo.PonColor("Verde");

        System.out.println(otrosemaforo.DimeColor());
        System.out.println(semaforodemicalle.DimeColor());

        if (misemaforo.DimeColor().equals("Rojo")) {
            System.out.println("No Pasar");
        }
    }
}
