package semaforo.poo1;

public class Semaforo {

    private String EstadoSemaforo = "Rojo";

    public void PonColor(String Color) {
        EstadoSemaforo = Color;
    }

    public String DimeColor() {
        return EstadoSemaforo;
    }
}
