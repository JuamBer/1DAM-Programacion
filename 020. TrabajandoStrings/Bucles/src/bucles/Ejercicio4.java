package bucles;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        for (int i = 0; i < 40; i++) {
            System.out.println("Introduce un número: ");
            int num = sc.nextInt();  
            if((num%3)==0){
                System.out.println(num + " Es múltiplo de 3");

            }
        }
      
        
        
        
    }
}