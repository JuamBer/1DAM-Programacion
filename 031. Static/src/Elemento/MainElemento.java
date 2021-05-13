package Elemento;

public class MainElemento {

    public static void main(String[] args) {
        System.out.println(Elemento.numElementos);
        Elemento elemento1 = new Elemento("Elemento1");
        System.out.println(Elemento.numElementos);
        Elemento elemento2 = new Elemento("Elemento2");
        System.out.println(Elemento.numElementos);
        Elemento elemento3 = new Elemento("Elemento3");
        System.out.println(Elemento.numElementos);
    }

}
