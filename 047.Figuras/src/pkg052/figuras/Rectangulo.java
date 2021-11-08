package pkg052.figuras;

public class Rectangulo extends Figura {

    private int base;
    private int altura;

    public Rectangulo(String color, int x, int y, int base, int altura) {
        super(color, x, y);
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(int x, int y, int base, int altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float getArea() {
        return (float) (this.base * this.altura);
    }

    @Override
    public float getPerimetro() {
        return (float) (2 * (this.base + this.altura));
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

}
