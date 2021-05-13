/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalmultiple;
import java.util.Scanner;

/**
 *
 * @author DAM6J_GB
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("Escribe un día de la semana: ");
        String dia = sc.nextLine();      
        
        switch(dia){
            case "Lunes":
                System.out.println(dia + " es lectivo");                
            break;
            case "Martes":
                System.out.println(dia + " es lectivo");                
            break;
            case "Miercoles":
                System.out.println(dia + " es lectivo");                
            break;
            case "Jueves":
                System.out.println(dia + " es lectivo");                
            break;
            case "Viernes":
                System.out.println(dia + " es lectivo");                
            break;
            case "Sábado":
                System.out.println(dia + " es festivo");                
            break;
            case "Domingo":
                System.out.println(dia + " es festivo");                
            break;
            default:
                System.out.println("No es ningun día");  
        }
    }
    
}