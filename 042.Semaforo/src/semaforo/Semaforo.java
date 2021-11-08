package semaforo;

public class Semaforo {

    private enum Estados {
        VERDE, AMARILLO, ROJO;
    };
    private Estados estado;

    public Semaforo(String estadoString) {
        switch (estadoString) {
            case "VERDE" ->
                estado = Estados.VERDE;
            case "AMARILLO" ->
                estado = Estados.AMARILLO;
            case "ROJO" ->
                estado = Estados.ROJO;
        }
    }

    public void setSemaforo(String estadoString) {
        switch (estadoString) {
            case "VERDE" ->
                estado = Estados.VERDE;
            case "AMARILLO" ->
                estado = Estados.AMARILLO;
            case "ROJO" ->
                estado = Estados.ROJO;
        }
    }

    public Estados getSemaforo() {
        return this.estado;
    }
}
