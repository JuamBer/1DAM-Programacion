package Aparato;

public class Aparato {

    private int consumo;
    private boolean estado = false;
    public static int consumoTotal = 0;

    public Aparato(int consumo) {
        this.consumo = consumo;

    }

    public void encender() {
        if (!this.estado) {
            this.estado = true;
            this.consumoTotal = this.consumoTotal + this.consumo;
        }
    }

    public void apagar() {
        if (this.estado) {
            this.estado = false;
            this.consumoTotal = this.consumoTotal - this.consumo;
        }

    }

    @Override
    public String toString() {
        return "Aparato: consumo:" + this.consumo + " estado: " + this.estado;
    }

}
