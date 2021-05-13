package pilasycolas;

import java.util.LinkedList;

public class Pila implements PilaCola {

    private LinkedList<String> pila = new LinkedList<String>();

    public Pila() {
    }

    @Override
    public String sacar() {
        return pila.get(0);
    }

    @Override
    public void meter(String o) {
        pila.add(o);
    }

    @Override
    public void listar() {
        System.out.println("-----PILA-----");
        for (int i = 0; i < pila.size(); i++) {
            System.out.println(pila.get(i));
        }
        System.out.println("--------------");
    }

    @Override
    public int tamaño() {
        return pila.size();
    }

}
