package bucles;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        
        
        int numerosecreto = 33;
        boolean paso = false;
        do{
            System.out.println("Introduce un número: ");
            int num = sc.nextInt();
            if(num == numerosecreto){
                paso = true;
            }else{
                if(num > numerosecreto){
                    System.out.println("El número secreto es menor que "+num);
                }else{
                    System.out.println("El número secreto es mayor que "+num);
                }
            }
        }while(paso == false);
            
        
        
        System.out.println("correcto!");
    
    }
}