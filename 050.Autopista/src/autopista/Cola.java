package autopista;

import java.util.LinkedList;

public class Cola implements PilaCola {

    private LinkedList<Object> cola = new LinkedList<Object>();

    @Override
    public Object sacar() {
        return cola.remove(0);
    }

    @Override
    public void meter(Object o) {
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

    @Override
    public String toString() {
        return "Cola{" + "cola=" + cola + '}';
    }

}
