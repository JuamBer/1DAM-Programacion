package strings;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println(mitadInicial("Hola que tal"));
        System.out.println(mitadInicial("Adios"));
        System.out.println(concurrenciasEs("esto1234es5678bueno900"));
        System.out.println(caracterVeces("En un lugar de la mancha, de cuyo nombre no puedo acordarme", "o"));

    }

    public static String mitadInicial(String texto) {
        String mitadtexto;
        mitadtexto = texto.substring(0, texto.length() / 2);
        return mitadtexto;
    }

    public static String concurrenciasEs(String texto) {
        String textoFinal;
        textoFinal = texto.replace("es", "no es");
        return textoFinal;
    }

    public static int caracterVeces(String texto, String caracter) {
        int veces = 0;
        String valor;
        for (int i = 0; i < texto.length(); i++) {
            valor = texto.substring(i, i + 1);
            if (valor.equals(caracter)) {
                veces++;
            }
        }
        return veces;
    }
}
