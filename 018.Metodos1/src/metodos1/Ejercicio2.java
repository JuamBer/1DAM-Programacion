package metodos1;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("Introduce un número texto");
        String text = sc.nextLine();    
        
        System.out.println(Funcion(text));
    }
    
    public static int Funcion(String texto){
        int numDigitos = 0;
        
        for (int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);
            int uno;
            uno = Character.getNumericValue(letra);
            if(uno == 1 || uno == 2 || uno == 3 || uno == 4 || uno == 5 || uno == 6 || uno == 7 || uno == 8 || uno == 9 || uno == 0){
                numDigitos++;
            }
        }
        return numDigitos;
    }
}

