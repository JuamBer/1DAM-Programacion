package coche.poo1;

public class Coche {

    private String modelo;
    private String color;
    private String matrícula;
    private String añoMatriculación;
    private String tipoSeguro;

    public void imprimeCoche() {
        System.out.println("Modelo: " + this.modelo + ", Color: " + this.color);
    }

    public void constructor1(String modelo, String matrícula) {
        this.modelo = modelo;
        this.matrícula = matrícula;
    }

    public void constructor2(String modelo, String color, String matrícula, String añoMatriculación, String tipoSeguro) {
        this.constructor1(modelo, matrícula);
        this.color = color;
        this.añoMatriculación = añoMatriculación;
        this.tipoSeguro = tipoSeguro;
    }

    public void actualizarModelo(String modelo) {
        this.modelo = modelo;
    }

    public void actualizarColor(String color) {
        this.color = color;
    }

    public void actualizarMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }

    public void actualizarAñoMatriculación(String añoMatriculación) {
        this.añoMatriculación = añoMatriculación;
    }

    public void actualizarTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public String mostrarModelo() {
        return modelo;
    }

    public String mostrarColor() {
        return color;
    }

    public String mostrarMatrícula() {
        return matrícula;
    }

    public String mostrarAñoMatriculación() {
        return añoMatriculación;
    }

    public String mostrarTipoSeguro() {
        return tipoSeguro;
    }
}
