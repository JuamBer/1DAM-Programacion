package aparcamiento;


public class Puerta {

    Aparcamiento aparcamiento;

    Puerta(Aparcamiento parking) {
        this.aparcamiento = parking;
    }

    public void entrarCoche() {
        if (aparcamiento.hayHuecos()) {
            System.out.println("Puerta abierta, pase");
            aparcamiento.aparcarCoche();
        } else {
            System.out.println("Está lleno");
        }
    }

    public void salirCoche() {
        if (aparcamiento.hayCoches()) {
            System.out.println("Puerta abierta, pase");
            aparcamiento.sacarCoche();
        }
    }

    @Override
    public String toString() {
        return aparcamiento.toString();
    }
}
