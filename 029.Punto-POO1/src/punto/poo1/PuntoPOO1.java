package punto.poo1;

public class PuntoPOO1 {

    public static void main(String[] args) {
        Punto a = new Punto();
        Punto b = new Punto();
        Punto c = new Punto();
        Punto d = new Punto();

        a.constructorOrigen();
        b.constructor(5, 3);
        c.constructor(2, -1);

        double Dx = (b.mostrarX() + c.mostrarX()) / 2;
        double Dy = (b.mostrarY() + c.mostrarY()) / 2;

        d.constructor(Dx, Dy);

        Punto e = new Punto();
        e.constructor(4, 3);
        System.out.println(e.calcularDistanciaInicio());
    }
}
