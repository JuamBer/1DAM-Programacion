package vehículos;

public class Vehiculo {

    protected String matricula;
    protected int velocidad;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public void acelerar(int velocidad) throws DemasiadoRapidoException {
        this.velocidad += velocidad;
    }

    @Override
    public String toString() {
        return "Vehiculo: { Matricula: " + this.matricula + ", Velocidad: " + this.velocidad + " }";
    }
}
