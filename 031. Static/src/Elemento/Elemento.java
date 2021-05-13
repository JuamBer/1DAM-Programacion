package Elemento;

public class Elemento {

    private String name;

    public static int numElementos = 0;

    public Elemento(String name) {
        this.name = name;
        this.numElementos++;
    }
}
