package alumnos;

public class Alumnos {

    private final String nombre;
    private final String apellido;
    private int notaFinal;

    public Alumnos(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Alumnos(String nombre, String apellido, int notaFinal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notaFinal = notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getNotaFinal() {
        return this.notaFinal;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido + ": " + this.notaFinal;
    }
}
