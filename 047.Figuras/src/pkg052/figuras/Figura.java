package pkg052.figuras;

public abstract class Figura implements Comparable<Figura> {

    private String color;
    private int posicion[];

    public Figura(String color, int x, int y) {
        this.color = color;
        this.posicion = new int[2];
        this.posicion[0] = x;
        this.posicion[1] = y;
    }

    public Figura(int x, int y) {
        this.color = "NEGRO";
        this.posicion = new int[2];
        this.posicion[0] = x;
        this.posicion[1] = y;
    }

    public abstract float getArea();

    public abstract float getPerimetro();

    @Override
    public int compareTo(Figura f) {
        int res = 0;
        if (this.getArea() > f.getArea()) {
            res = 1;
        } else {
            res = -1;
        }
        return res;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int[] getPosicion() {
        return posicion;
    }

    public void setPosicion(int[] posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Figura{" + "color=" + color + ", posicion=" + posicion + '}';
    }

}
