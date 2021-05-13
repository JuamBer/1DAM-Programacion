package corredor;

public class MainCorredor {

    public static void main(String[] args) throws AgotadoException {
        Corredor juan = new Corredor(50);
        juan.correr();
        juan.correr();
        juan.correr();
        juan.correr();
        juan.correr();
        juan.recargarEnergia(30);
        juan.correr();
        juan.correr();
        juan.correr();
        juan.recargarEnergia(10);
        juan.correr();
    }

}
