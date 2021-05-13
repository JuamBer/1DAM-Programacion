package herencia2;

public class ListaMultimedia {

    private final int num;
    private Multimedia lista[];

    public ListaMultimedia(int num) {
        this.num = num;
        this.lista = new Multimedia[num];
    }

    public int size() {
        int contador = 0;
        for (int i = 0; i < this.num; i++) {
            if (!(lista[i] == null)) {
                contador++;
            }
        }
        return contador;
    }

    public boolean add(Multimedia objeto) {
        if (size() >= this.num) {
            return false;
        } else {
            for (int i = 0; i < this.num; i++) {
                if ((lista[i] == null)) {
                    lista[i] = objeto;
                    i = this.num;
                }
            }
            return true;
        }
    }

    public Multimedia get(int pos) {
        return this.lista[pos];
    }

    public int indexOf(Multimedia objeto) {
        int pos = -1;
        for (int i = 0; i < this.num; i++) {
            if ((lista[i].equals(objeto))) {
                pos = i;
            }
        }
        return pos;
    }

    public String recorrerLista() {
        String lista = "\n";
        for (int i = 0; i < this.num; i++) {
            lista = lista + i + ": " + this.lista[i] + "\n";
        }
        return lista;
    }

    @Override
    public String toString() {

        return "ListaMultimedia{" + "num=" + this.num + ", lista=" + recorrerLista();

    }
}
