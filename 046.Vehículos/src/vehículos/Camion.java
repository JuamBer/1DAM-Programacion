package vehículos;

public class Camion extends Vehiculo {

    private Remolque r;

    public Camion(String matricula) {
        super(matricula);
        this.r = null;
    }

    public void ponRemolque(Remolque r) {
        this.r = r;
    }

    public void quitaRemolque() {
        this.r = null;
    }

    @Override
    public void acelerar(int velocidad) throws DemasiadoRapidoException {
        if (!((this.r != null) && ((this.velocidad + velocidad) > 100))) {
            this.velocidad += velocidad;
        } else {
            throw new DemasiadoRapidoException("Demasiado Rapido");
        }
    }

    @Override
    public String toString() {
        return "Camion: { Matricula: " + this.matricula + ", Velocidad: " + this.velocidad + ", Remolque: " + this.r + " }";
    }
}
