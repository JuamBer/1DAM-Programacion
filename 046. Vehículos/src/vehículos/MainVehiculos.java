package vehículos;

public class MainVehiculos {

    public static void main(String[] args) {

        Vehiculo vehiculos[] = new Vehiculo[4];

        vehiculos[0] = new Camion("45217 DCD");
        vehiculos[1] = new Camion("78290 QKN");
        vehiculos[2] = new Coche("23474 ASD", 4);
        vehiculos[3] = new Coche("67100 FCG", 2);

        Remolque r1 = new Remolque(750);
        Remolque r2 = new Remolque(5000);

        System.out.println("INICIALIZANDO VEHÍCULOS");
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println(vehiculos[i]);
        }

        System.out.println("\nAÑADIENDO VELOCIDAD A VEHICULOS");
        for (int i = 0; i < vehiculos.length; i++) {
            try {
                int velocidad = (int) (Math.random() * 50);
                vehiculos[i].acelerar(velocidad);
            } catch (DemasiadoRapidoException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(vehiculos[i]);
        }

        System.out.println("\nAÑADIENDO REMOLQUES A LOS CAMIONES");
        if (vehiculos[0] instanceof Camion) {
            ((Camion) vehiculos[0]).ponRemolque(r1);
        }
        if (vehiculos[1] instanceof Camion) {
            ((Camion) vehiculos[1]).ponRemolque(r2);
        }
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println(vehiculos[i]);
        }

        System.out.println("\nPROBANDO LA EXCEPCÍON");
        try {
            vehiculos[0].acelerar(130);
        } catch (DemasiadoRapidoException e) {
            System.out.println(e.getMessage());
        }

    }
}
