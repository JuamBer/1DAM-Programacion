package asignatura.poo1;

public class Asignatura {

    private int id;
    private String nombre;
    private String curso;

    public void asignarValores(int id, String nombre, String curso) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
    }

    public int mostrarId() {
        return this.id;
    }

    public String mostrarNombre() {
        return this.nombre;
    }

    public String mostrarCurso() {
        return this.curso;
    }
}
