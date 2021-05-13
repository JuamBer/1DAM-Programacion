package veterinario;

import java.util.LinkedList;
import java.io.Serializable;

public class Cliente implements Serializable {

    private String dni;
    private String nombre;
    private String apellidos;
    private LinkedList<Mascota> mascotas;
    public final String rojo = "\u001B[31m";
    public final String azul = "\u001B[34m";

    public Cliente(String dni, String nombre, String apellidos) {
        this.mascotas = new LinkedList<Mascota>();
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Mascota buscarMascota(int id) {
        Mascota mascota = null;
        for (int i = 0; i < this.mascotas.size(); i++) {
            if ((this.mascotas.get(i).getId()) == id) {
                mascota = mascotas.get(i);
            }
        }
        return mascota;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LinkedList<Mascota> getMascotas() {
        return mascotas;
    }

    public void añadirMascota(Mascota mascota) {
        this.mascotas.add(mascota);
    }

    public void añadirMascota(int id, String tipo, String nombre) {
        this.mascotas.add(new Mascota(id, this.dni, tipo, nombre));
    }

    public boolean equals(Cliente cliente) {
        if (this.dni == cliente.getDni()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return rojo + "\ncliente{" + "dni=" + this.dni + rojo + ", nombre=" + this.nombre + rojo + ", apellidos=" + this.apellidos + rojo + ", mascotas=\n" + this.mascotas + rojo + "}" + azul;
    }

}
