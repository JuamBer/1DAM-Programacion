package bucles;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        
        int impares = 1;
        int pares = 0;
        
        for (int i = 0; i < 40; i++) {
            if(i % 2 == 0){
                pares = pares + i;    
            }else{
                impares = impares * i;
            }
        }
        
        System.out.println("La suma de los pares comprendidos del 1 al 20 es: "+pares);
        System.out.println("La suma de los pares comprendidos del 1 al 20 es: "+impares);       
    }
}