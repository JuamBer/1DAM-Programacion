package excepciones3;

public class Excepciones3 {

    public static void main(String[] args) {
        String[] x = {"Hola", "Pepe", "Maria", "Miguel Angel"};
        String[] y = new String[5];
        String[] z = {"hola", null, "pepe", "", "quinta"};

        mostrarCadenasArray(x);
        mostrarCadenasArray(y);
        mostrarCadenasArray(z);
    }

    public static void mostrarCadenasArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            try {
                char resultado = array[i].charAt(0);
                System.out.println(resultado);
            } catch (NullPointerException ex1) {
                System.out.println("El valor es Nulo: " + ex1.getMessage());
            } catch (StringIndexOutOfBoundsException ex2) {
                System.out.println("Es una cadena vacía: " + ex2.getMessage());
            } catch (Exception ex3) {
                System.out.println("Error desconocido: " + ex3.getMessage());
            }
        }
    }
}
