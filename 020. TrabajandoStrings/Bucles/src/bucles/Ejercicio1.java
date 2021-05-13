package bucles;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        int num = 1;
        int suma = 0;
        
        while(num <= 5){
            suma = num + suma;
            num++;    
        }
        
        System.out.println("La suma de 1 al 5 es: " + suma);
        
    }
}
