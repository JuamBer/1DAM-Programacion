package gestionalmacenes;

public class Almacen {

    int capacidad[];

    public Almacen(int capacidad) {
        this.capacidad = new int[capacidad];
        for (int i = 0; i < capacidad; i++) {
            this.capacidad[i] = 0;
        }
    }

    public void llenar() {
        for (int i = 0; i < this.capacidad.length; i++) {
            if (this.capacidad[i] == 0) {
                this.capacidad[i] = 1;
                i = this.capacidad.length + 1;
            }
        }
    }

    public void vaciar() {
        for (int i = 0; i < this.capacidad.length; i++) {
            if (this.capacidad[i] == 1) {
                this.capacidad[i] = 0;
                i = this.capacidad.length + 1;
            }
        }
    }

    public boolean estaLleno() {
        boolean resultado = true;
        for (int i = 0; i < this.capacidad.length; i++) {
            if (this.capacidad[i] == 0) {
                resultado = false;
            }
        }
        return resultado;
    }

    public boolean estaVacio() {
        boolean resultado = true;
        for (int i = 0; i < this.capacidad.length; i++) {
            if (this.capacidad[i] == 1) {
                resultado = false;
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        String mensaje = "{";
        for (int i = 0; i < this.capacidad.length; i++) {
            if (i == this.capacidad.length - 1) {
                mensaje = mensaje + this.capacidad[i];
            } else {
                mensaje = mensaje + this.capacidad[i] + ",";
            }
        }
        mensaje = mensaje + "}\n";
        return mensaje;
    }
}
