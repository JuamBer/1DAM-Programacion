package pilasycolas;

import java.util.LinkedList;

public class Cola implements PilaCola {

    private LinkedList<String> cola = new LinkedList<String>();

    @Override
    public String sacar() {
        return cola.getLast();
    }

    @Override
    public void meter(String o) {
        cola.addLast(o);
    }

    @Override
    public void listar() {
        System.out.println("-----COLA-----");
        for (int i = 0; i < cola.size(); i++) {
            System.out.println(cola.get(i));
        }
        System.out.println("--------------");
    }

    @Override
    public int tamaño() {
        return cola.size();
    }

}
