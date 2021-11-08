package punto.poo1;

public class Punto {

    private double x;
    private double y;

    public void constructorOrigen() {
        this.x = 0;
        this.y = 0;
    }

    public void constructor(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcularDistancia(Punto parametros) {
        double cateto1 = this.x - parametros.mostrarX();
        double cateto2 = this.y - parametros.mostrarY();
        double distancia = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        return distancia;
    }

    public double calcularDistanciaInicio() {
        double distancia = Math.sqrt(x * x + y * y);
        return distancia;
    }

    public double mostrarX() {
        return this.x;
    }

    public double mostrarY() {
        return this.x;
    }
}
