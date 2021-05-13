package garaje;

public class Practica_2 {

    public static void main(String[] args) {

        Coche coche1 = new Coche(200, "Seat", "R3");
        Coche coche2 = new Coche(150, "Audi", "Sport Edition");
        Coche coche3 = new Coche(300, "Tesla", "Model 3");
        Coche coche4 = new Coche(600, "Wolsvagen", "Transporter");
        String verde = "\u001B[32m";
        Garaje garaje1 = new Garaje(3);
        System.out.println(verde + "-------------ESTADO GARAJE--------------");
        System.out.println("El Garaje Tiene " + garaje1.verCapacidad() + " Plazas\n\n");
        System.out.println(verde + "-------------ESTADO COCHES--------------");
        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);
        System.out.println(coche4);
        System.out.println(verde + "-------------RELACIONES ENTRE COCHES Y TALLER--------------");
        //Vacio
        garaje1.aceptarCoche(coche1);
        garaje1.aceptarCoche(coche2);
        garaje1.aceptarCoche(coche3);
        //1,2,3
        garaje1.devolverCoche(coche1); //Coche1:1
        //2,3
        garaje1.aceptarCoche(coche4);
        garaje1.aceptarCoche(coche1);
        //2,3,4 -> esta lleno
        garaje1.devolverCoche(coche2); //Coche2:1
        //3,4
        garaje1.devolverCoche(coche3); //Coche3:1
        //4
        garaje1.aceptarCoche(coche1);
        //4,1
        garaje1.aceptarCoche(coche2);
        //4,1,2
        garaje1.devolverCoche(coche4); //Coche4:1
        //1,2
        garaje1.devolverCoche(coche1); //Coche1:2
        //2
        garaje1.aceptarCoche(coche3);
        //2,3
        garaje1.devolverCoche(coche2); //Coche2:2
        //3
        garaje1.aceptarCoche(coche4);
        //3,4
        garaje1.devolverCoche(coche3); //Coche3:2
        //4
        garaje1.devolverCoche(coche4); //Coche4:2
        //VACIO
        System.out.println("\n");
        System.out.println(verde + "-------------ESTADO COCHES DESPÚES DEL TALLER--------------");

        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);
        System.out.println(coche4);
    }
}
