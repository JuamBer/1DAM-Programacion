package vehículos;

public class Coche extends Vehiculo {

    private int puertas;

    public Coche(String matricula, int puertas) {
        super(matricula);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return this.puertas;
    }

    @Override
    public String toString() {
        return "Coche: { Matricula: " + this.matricula + ", Velocidad: " + this.velocidad + ", Puertas: " + this.puertas + "}";
    }
}
