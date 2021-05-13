package garaje;

public class Coche {

    private Motor motor;
    private String marca;
    private String modelo;
    private double precioacumuladoaverias;

    public Coche(int caballos, String marca, String modelo) {
        this.motor = new Motor(caballos);
        this.marca = marca;
        this.modelo = modelo;
        this.precioacumuladoaverias = 0;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getPrecioAcumuladoAverias() {
        return this.precioacumuladoaverias;
    }

    public void acumularAverias(double precioreparacion) {
        this.precioacumuladoaverias += precioreparacion;
    }

    @Override
    public String toString() {
        String var = "Marca: " + this.marca + ", Modelo: " + this.modelo + ", Precio Acumulación Averias:" + this.precioacumuladoaverias + "\nMotor del Coche: Caballos: " + this.motor.getCaballos() + ", Litros de Aceite: " + this.motor.getLitrosDeAceite() + "\n";
        return var;
    }
}
