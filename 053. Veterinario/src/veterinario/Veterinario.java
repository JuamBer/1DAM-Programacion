package veterinario;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;

public class Veterinario implements Serializable {

    private String nombre;
    private String dirección;
    private LinkedList<Cliente> clientes;
    public final String azul = "\u001B[34m";

    public Veterinario(String nombre, String dirección) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.clientes = new LinkedList<Cliente>();
    }

    public Veterinario(String nombre, String dirección, LinkedList<Cliente> clientes) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.clientes = clientes;
    }

    public void vacunar(Mascota mascota) {
        mascota.setVacunado(true);
        mascota.setFechavacunacion(new Date());
    }

    public void añadirCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void añadirCliente(String dni, String nombre, String apellidos) {
        this.clientes.add(new Cliente(dni, nombre, apellidos));
    }

    public void borrarCliente(Cliente cliente) {
        for (int i = 0; i < this.clientes.size(); i++) {
            if (this.clientes.equals(cliente)) {
                this.clientes.remove(i);
            }
        }
    }

    public void borrarCliente(String dni) {
        for (int i = 0; i < this.clientes.size(); i++) {
            if (this.clientes.get(i).getDni().equals(dni)) {
                this.clientes.remove(i);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarCliente(String dni) {
        Cliente cliente = null;
        for (int i = 0; i < this.clientes.size(); i++) {
            if (this.clientes.get(i).getDni().equals(dni)) {
                cliente = clientes.get(i);
            }
        }
        return cliente;
    }

    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return azul + "Veterinario{" + "nombre=" + nombre + ", direcci\u00f3n=" + dirección + ", clientes=" + clientes + azul + "}";
    }

}
