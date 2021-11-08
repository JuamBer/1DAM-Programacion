package enumeración;

import java.util.Scanner;

public class Enumeración {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        Maderas ejemplo = null;
        System.out.println("Elije madera: ");
        String madera = sc.nextLine();
        switch (madera) {
            case "ROBLE" ->
                ejemplo = Maderas.ROBLE;
            case "CAOBA" ->
                ejemplo = Maderas.CAOBA;
            case "NOGAL" ->
                ejemplo = Maderas.NOGAL;
            case "CEREZO" ->
                ejemplo = Maderas.CEREZO;
            case "BOJ" ->
                ejemplo = Maderas.BOJ;
        }

        System.out.println("Madera elegida: " + ejemplo.getMadera() + "\nColor: " + ejemplo.color + "\nPeso: " + ejemplo.getPesoPalet());

        Maderas roble = Maderas.ROBLE;
        Maderas caoba = Maderas.CAOBA;
        Maderas nogal = Maderas.NOGAL;
        Maderas cerezo = Maderas.CEREZO;
        Maderas boj = Maderas.BOJ;

        System.out.println("________________TABLA_________________");
        System.out.println("Madera elegida: " + roble.getMadera() + "\nColor: " + roble.color + "\nPeso: " + roble.getPesoPalet());
        System.out.println("Madera elegida: " + caoba.getMadera() + "\nColor: " + caoba.color + "\nPeso: " + caoba.getPesoPalet());
        System.out.println("Madera elegida: " + nogal.getMadera() + "\nColor: " + nogal.color + "\nPeso: " + nogal.getPesoPalet());
        System.out.println("Madera elegida: " + cerezo.getMadera() + "\nColor: " + cerezo.color + "\nPeso: " + cerezo.getPesoPalet());
        System.out.println("Madera elegida: " + boj.getMadera() + "\nColor: " + boj.color + "\nPeso: " + boj.getPesoPalet());
    }

    public enum Maderas {
        ROBLE("Roble", "Castaño verdoso", 800),
        CAOBA("Caoba", "Marrón oscuro", 770),
        NOGAL("Nogal", "Marrón rojizo", 820),
        CEREZO("Cereza", "Marrón cereza", 790),
        BOJ("Boj", "Marrón negruzco", 675);

        private final double volumenpalet = 2.27;
        private String madera;
        private String color;
        private int pesoespecífico;

        private Maderas(String madera, String color, int pesoespecífico) {
            this.madera = madera;
            this.color = color;
            this.pesoespecífico = pesoespecífico;
        }

        public String getMadera() {
            return this.madera;
        }

        public String getColor() {
            return this.color;
        }

        public int getPesoPalet() {
            return (int) (this.volumenpalet * pesoespecífico);
        }
    }
}
