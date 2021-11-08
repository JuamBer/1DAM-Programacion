package bucles;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
           int positivos = 0;
         Scanner sc = new Scanner(System.in, "ISO-8859-1");
          
        for (int i = 0; i <= 100; i++) {
            System.out.println("Introduce un número: ");
            int num = sc.nextInt(); 
            if(num > -1){ positivos++;}
        }
            System.out.println("Hay "+ positivos + " números positivos");        
       
    }
}