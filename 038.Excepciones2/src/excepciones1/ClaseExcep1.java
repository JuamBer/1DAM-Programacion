package excepciones1;

public class ClaseExcep1 {

    public static void main(String[] args) {
        int a = 2;
        int[] array = {-2, -1, 0, 1, 2};

        dividirEntreArray(a, array);
    }

    public static void dividirEntreArray(int a, int[] array) {
        for (int i = 0; i < array.length; i++) {
            try {
                int resultado = a / array[i];
                System.out.println(a + "/" + array[i] + "=" + resultado);
            } catch (Exception e) {
                System.out.println("No se puede dividir: " + e.getMessage());
            }
        }
    }
}
