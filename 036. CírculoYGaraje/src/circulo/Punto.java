package circulo;

public class Punto {

    private double x;
    private double y;

    public Punto() {
        this.x = 1;
        this.y = 1;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double calcularDistanciaDesde(Punto p2) {
        double cateto1 = this.x - p2.getX();
        double cateto2 = this.y - p2.getY();
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        return hipotenusa;
    }

    @Override
    public String toString() {
        return "Punto: x:" + this.x + " y:" + this.y;
    }
}
