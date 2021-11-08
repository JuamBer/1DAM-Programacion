package ampliacion2;

import java.util.Arrays;

public class Alumnos2 {

    private String nombre;
    private String apellido;
    public Calificacion notas;

    public Alumnos2(String nombre, String apellido, int eval1, int eval2, int eval3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = new Calificacion(nombre, eval1, eval2, eval3);
    }

    public void setNotaFinal(int eval1, int eval2, int eval3) {
        this.notas.setEval1(eval1);
        this.notas.setEval2(eval2);
        this.notas.setEval3(eval3);
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int[] getNotasFinal() {
        int notasAlumno[] = {this.notas.getEval1(), this.notas.getEval2(), this.notas.getEval3()};
        return notasAlumno;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido + ": " + this.notas;
    }
}
