package Item;

public class Item {

    private int id;
    private String name;

    private static int contadorid = 0;

    public Item(String name) {
        this.name = name;
        this.id = this.contadorid;
        this.contadorid++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Id: " + this.id;
    }

}
