package corredor;

public class Corredor {

    private int energia;

    public Corredor(int energia) {
        this.energia = energia;
    }

    public void recargarEnergia(int energia) {
        this.energia = this.energia + energia;
    }

    public void correr() throws AgotadoException {
        System.out.println("Corriendo");
        if (this.energia >= 10) {
            this.energia = this.energia - 10;
        } else {
            throw new AgotadoException("El corredor no tiene más energía");
        }
    }
}
