package metodos1;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int num1,num2;
           
        do {
            System.out.println("Introduce M número:");
            num1 = sc.nextInt(); 
            System.out.println("Introduce N número:");
            num2 = sc.nextInt();
        } while (num1 <= 0 && num2 <= 0);
        
        System.out.println(Combinatorio(num1,num2));
    }
    
    public static int Combinatorio(int num1, int num2){
        int resta = (num1-num2);
        int arriba = Factorial(num1);
        int abajo = Factorial(num2)*resta;
        int combinatorio = arriba/abajo;
        return combinatorio;
    }
    
    public static int Factorial(int num){
        int factorial = 1;
        
        for (int i = 1; i <= num; i++){
            factorial = factorial * i;
        }
        
        return factorial;
    }
    
    
}

