package circulo;

public class Practica_1 {

    public static void main(String[] args) {
        Punto p1 = new Punto(0, 1);
        Punto p2 = new Punto(2, 1);
        System.out.println("Distancia entre los dos puntos: " + p1.calcularDistanciaDesde(p2));

        Circulo circ = new Circulo(p1, 1);
        System.out.println("Area: " + circ.calcularArea());
        System.out.println("Perimetro: " + circ.calcularPerimetro());
        System.out.println("Distancia entre los dos puntos: " + circ.calcularDistanciaDesde(p2));
    }
}
