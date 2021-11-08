package garaje;

public class Motor {

    private int litrosdeaceite;
    private int caballos;

    public Motor(int caballos) {
        this.caballos = caballos;
        this.litrosdeaceite = 0;
    }

    public int getCaballos() {
        return this.caballos;
    }

    public int getLitrosDeAceite() {
        return this.litrosdeaceite;
    }

    public void setLitrosDeAceite(int litrosdeaceite) {
        this.litrosdeaceite = litrosdeaceite;
    }
}
