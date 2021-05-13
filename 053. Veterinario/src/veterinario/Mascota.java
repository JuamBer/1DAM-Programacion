package veterinario;

import java.util.Date;
import java.io.Serializable;

public class Mascota implements Serializable {

    private int id;
    private String dni_propietario;
    private String tipo;
    private String nombre;
    private boolean vacunado;
    private Date fechavacunacion;
    public final String verde = "\033[32m";
    public final String rojo = "\u001B[31m";

    public Mascota(int id, String dni_propietario, String tipo, String nombre, boolean vacunado, Date fechavacunacion) {
        this.id = id;
        this.dni_propietario = dni_propietario;
        this.tipo = tipo;
        this.nombre = nombre;
        this.vacunado = vacunado;
        this.fechavacunacion = fechavacunacion;
    }

    public Mascota(int id, String dni_propietario, String tipo, String nombre) {
        this.id = id;
        this.dni_propietario = dni_propietario;
        this.tipo = tipo;
        this.nombre = nombre;
        this.vacunado = false;
        this.fechavacunacion = null;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public Date getFechavacunacion() {
        return fechavacunacion;
    }

    public void setFechavacunacion(Date fechavacunacion) {
        this.fechavacunacion = fechavacunacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni_propietario() {
        return dni_propietario;
    }

    public void setDni_propietario(String dni_propietario) {
        this.dni_propietario = dni_propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return verde + "\nMascota{" + verde + "id=" + id + verde + ", dni_propietario=" + dni_propietario + verde + ", tipo=" + tipo + verde + ", nombre=" + nombre + verde + ", vacunado=" + vacunado + verde + ", fechavacunacion=" + fechavacunacion + verde + "}" + rojo;
    }

}
