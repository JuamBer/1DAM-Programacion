package metodos1;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int num;
           
        do {
            System.out.println("Introduce un número:");
            num = sc.nextInt(); 
        } while (num <= 0);
        
        System.out.println(Factorial(num));
    }
    
    public static int Factorial(int num){
        int factorial = 1;
        
        for (int i = 1; i <= num; i++){
            factorial = factorial * i;
        }
        
        return factorial;
    }
}

