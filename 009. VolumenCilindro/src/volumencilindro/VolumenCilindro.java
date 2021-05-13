package volumencilindro;

public class VolumenCilindro {

    public static void main(String[] args) {
        final double pi = 3.1416;
        double diametro = 15.5;
        double altura = 42.4;

        double circulosuperficie = pi * (diametro / 2);
        double volumen = circulosuperficie * altura;

        System.out.println("El volumen es: " + volumen);

    }

}
