package circulo;

public class Circulo {

    private Punto centro;
    private double radio;

    public Circulo() {
        this.centro = new Punto(1, 1);
        this.radio = 1;
    }

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public Circulo(double x, double y, double radio) {
        this.centro = new Punto(x, y);
        this.radio = radio;
    }

    public Punto getCentro() {
        return this.centro;
    }

    public double getRadio() {
        return this.radio;
    }

    public double calcularDistanciaDesde(Punto p2) {
        double cateto1 = this.centro.getX() - p2.getX();
        double cateto2 = this.centro.getY() - p2.getY();
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2) - this.radio;
        return hipotenusa;
    }

    public double calcularArea() {
        double area = Math.PI + Math.pow(this.radio, 2);
        return area;
    }

    public double calcularPerimetro() {
        double perimetro = 2 * Math.PI + this.radio;
        return perimetro;
    }

    @Override
    public String toString() {
        return "";
    }
}
