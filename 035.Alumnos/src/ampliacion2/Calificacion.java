package ampliacion2;

public class Calificacion {

    private String nombre;
    private int eval1;
    private int eval2;
    private int eval3;

    public Calificacion(String nombre, int eval1, int eval2, int eval3) {
        this.nombre = nombre;
        this.eval1 = eval1;
        this.eval2 = eval2;
        this.eval3 = eval3;
    }

    public void setEval1(int nota) {
        this.eval1 = nota;
    }

    public void setEval2(int nota) {
        this.eval2 = nota;
    }

    public void setEval3(int nota) {
        this.eval3 = nota;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEval1() {
        return this.eval1;
    }

    public int getEval2() {
        return this.eval2;
    }

    public int getEval3() {
        return this.eval3;
    }

    public float mediaAlumno() {
        float media = (this.eval1 + this.eval2 + this.eval3) / 3;
        return media;
    }

    @Override
    public String toString() {
        return this.nombre + ": " + this.eval1 + ", " + this.eval2 + ", " + this.eval3;
    }
}
