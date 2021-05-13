/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalmultiple;

/**
 *
 * @author DAM6J_GB
 */
import java.util.Scanner;

/**
 *
 * @author DAM6J_GB
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("Escribe la nota ");
        int nota = sc.nextInt();      
        
        switch(nota){
            case 1:
                System.out.println("MD");                
            break;
            case 2:
                System.out.println("MD");                
            break;
            case 3:
                System.out.println("INS");                  
            break;
            case 4:
                System.out.println("INS");                
            break;
            case 5:
                System.out.println("BIEN");                 
            break;
            case 6:
                System.out.println("BIEN");         
            break;
            case 7:
                System.out.println("NOT");                
            break;
            case 8:
                System.out.println("NOT");                
            break;
            case 9:
                System.out.println("SOB");                
            break;
            case 10:
                System.out.println("SOB");                
            break;
            default:
                System.out.println("Error");  
        }
    }
    
}