package vehículos;

public class Remolque {

    public int peso;

    public Remolque(int peso) {
        this.peso = peso;
    }

    public void setPeso() {
        this.peso = peso;
    }

    public int getPeso() {
        return this.peso;
    }

    @Override
    public String toString() {
        return "Remolque: { Peso: " + this.peso + " }";
    }
}
