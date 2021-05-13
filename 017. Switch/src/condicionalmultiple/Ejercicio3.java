package condicionalmultiple;

import java.util.Scanner;

/**
 *
 * @author DAM6J_GB
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("Escribe un número del 1 al 9: ");
        int num = sc.nextInt();      
        
        switch(num){
            case 1:
                System.out.println("Uno");                
            break;
            case 2:
                System.out.println("Dos");                
            break;
            case 3:
                System.out.println("Tres");                  
            break;
            case 4:
                System.out.println("Cuatro");                
            break;
            case 5:
                System.out.println("Cinco");                 
            break;
            case 6:
                System.out.println("Seis");         
            break;
            case 7:
                System.out.println("Siete");                
            break;
            case 8:
                System.out.println("Ocho");                
            break;
            case 9:
                System.out.println("Nueve");                
            break;
            default:
                System.out.println("Error");  
        }
    }
    
}