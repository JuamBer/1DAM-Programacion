package ampliacion1;

import java.util.Arrays;

public class Alumnos1 {

    private String nombre;
    private String apellido;
    private int notasfinal[] = new int[3];

    public Alumnos1(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Alumnos1(String nombre, String apellido, int[] notasFinal) {
        this.nombre = nombre;
        this.apellido = apellido;
        for (int i = 0; i < this.notasfinal.length; i++) {
            this.notasfinal[i] = notasFinal[i];
        }
    }

    public void setNotaFinal(int[] notasFinal) {
        for (int i = 0; i < this.notasfinal.length; i++) {
            this.notasfinal[i] = notasFinal[i];
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getNotasFinal() {
        return Arrays.toString(this.notasfinal);
    }

    public float media(int notasFinal[]) {
        float media = 0;
        for (int i = 0; i < notasFinal.length; i++) {
            media = media + notasFinal[i];
        }
        media = media / notasFinal.length;
        return media;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido + ": " + this.media(notasfinal);
    }
}
