package garaje;

public class Garaje {

    private Coche[] coches;
    private String[] averiaasociada;
    private int cochesatendidos;
    public static final String rojo = "\u001B[31m";
    public static final String verde = "\u001B[32m";
    public static final String reset = "\u001B[0m";
    public static final String morado = "\u001B[35m";

    public Garaje(int capacidad) {
        this.coches = new Coche[capacidad];
        this.averiaasociada = new String[capacidad];
    }

    public int verCapacidad() {
        int capacidad = 0;
        for (int i = 0; i < coches.length; i++) {
            if (coches[i] == null) {
                capacidad++;
            }
        }
        return capacidad;
    }

    public void aceptarCoche(Coche ch) {
        boolean llave = true;
        for (int i = 0; i < coches.length; i++) {
            if (coches[i] == null) {
                coches[i] = ch;
                System.out.println("El coche " + this.morado + ch.getMarca() + this.reset + " a " + this.verde + " ENTRADO " + this.reset + " al garaje. Capacidad del garaje: " + this.verCapacidad());
                int num = (int) (Math.random() * 4);
                String averia = null;
                double precioAveria = 0;
                switch (num) {
                    case 0:
                        averia = "Ruedas";
                        precioAveria = 300;
                        break;
                    case 1:
                        averia = "Amortiguadores";
                        precioAveria = 800;
                        break;
                    case 2:
                        averia = "Parabrisas";
                        precioAveria = 100;
                        break;
                    case 3:
                        averia = "Aceite";
                        precioAveria = 150;
                        break;
                }
                averiaasociada[i] = averia;
                if (averia.equals("Aceite")) {
                    ch.getMotor().setLitrosDeAceite(ch.getMotor().getLitrosDeAceite() + 10);
                }
                ch.acumularAverias(precioAveria);
                i = coches.length;
                llave = false;
            }
        }
        if (llave) {
            System.out.println("\nEl garaje está lleno, no se puede añadir ningun coche más. Capacidad del garaje: " + this.verCapacidad() + "\n");
        }
    }

    public void devolverCoche(Coche ch) {
        boolean llave = true;
        for (int i = 0; i < coches.length; i++) {
            if (coches[i] == ch) {
                coches[i] = null;
                System.out.println("El coche " + this.morado + ch.getMarca() + this.reset + " a " + this.rojo + " SALIDO " + this.reset + " salido del garaje. Capacidad del garaje: " + this.verCapacidad());
                i = coches.length;
                llave = false;
                cochesatendidos++;
            }
        }
        if (llave) {
            System.out.println("El coche que has introducido no está en el garaje");
        }
    }
}
