package pilasycolas;

public class AplicacionPilaCola {

    public static void main(String[] args) {
        Pila pila = new Pila();
        Cola cola = new Cola();

        pila.meter("Juan Sáez");
        pila.meter("Ivan Soriano");
        pila.meter("Javier Peris");

        pila.listar();

        System.out.println(pila.sacar());

        cola.meter("Juan Sáez");
        cola.meter("Ivan Soriano");
        cola.meter("Javier Peris");

        cola.listar();

        System.out.println(cola.sacar());
    }

}
