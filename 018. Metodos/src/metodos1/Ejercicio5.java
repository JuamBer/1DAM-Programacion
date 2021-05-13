package metodos1;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int filas;
           
        do {
            System.out.println("Introduce el número de filas:");
            filas = sc.nextInt(); 
        } while (filas <= 0);
        
        Piramide(filas);
    }
    public static void Piramide(int filas){
        System.out.println(Combinatorio(1,0));
        for (int i = 1; i < filas; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(Combinatorio(i,i));
            }
        }
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

