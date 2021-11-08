package bombilla;

public class Bombilla {

    private boolean estadobombilla;
    public static boolean estadointerructorgeneral = true;

    public Bombilla(boolean estadobombilla) {
        this.estadobombilla = estadobombilla;
    }

    public boolean getEstadoBombilla() {
        return this.estadobombilla;
    }

    public void apretarInterructor() {
        this.estadobombilla = !this.estadobombilla;
    }

    public static void apretarInterructorGeneral() {
        Bombilla.estadointerructorgeneral = !Bombilla.estadointerructorgeneral;
    }

    public boolean getEstadoBombillaReal() {
        if (Bombilla.estadointerructorgeneral) {
            if (this.estadobombilla) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "EstadoBombilla: " + this.getEstadoBombillaReal();
    }

}
