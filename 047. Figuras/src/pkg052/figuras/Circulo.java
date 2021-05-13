package pkg052.figuras;

public class Circulo extends Figura {

    private int radio;

    public Circulo(String color, int x, int y, int radio) {
        super(color, x, y);
        this.radio = radio;
    }

    public Circulo(int x, int y, int radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * this.radio * this.radio);
    }

    @Override
    public float getPerimetro() {
        return (float) (2 * Math.PI * this.radio);
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

}
