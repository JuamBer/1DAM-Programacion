package aparcamiento;


public class Aparcamiento {

    private int capacidad;
    private int coches = 0;

    Aparcamiento(int capacidad) {
        this.capacidad = capacidad;
    }

    public int dimeOcupados() {
        return coches;
    }

    public int dimeCapacidad() {
        return capacidad;
    }

    public void aparcarCoche() {
        coches++;
    }

    public void sacarCoche() {
        coches--;
    }

    public boolean hayHuecos() {
        return capacidad > coches;
    }

    public boolean hayCoches() {
        return coches > 0;
    }

    @Override
    public String toString() {
        return "En el parking hay " + capacidad + " plazas, " + coches
                + " coches " + (capacidad - coches) + " huecos:";
    }
}
