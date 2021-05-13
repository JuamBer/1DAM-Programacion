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
public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("Introduce un número: ");
        int num1 = sc.nextInt();
        
        System.out.println("Introduce otro número: ");
        int num2 = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("Introduce la operación (+,-,/,*): ");
        String operacion = sc.nextLine();
        
        int resultado;
        switch(operacion){
            case "+":
                resultado = num1 + num2;
                System.out.println("El resultado es: " + resultado);
            break; 
            case "-":
                resultado = num1 - num2;
                System.out.println("El resultado es: " + resultado);
            break; 
            case "*":
                resultado = num1 * num2;
                System.out.println("El resultado es: " + resultado);
            break; 
            case "/":
                resultado = num1 / num2;
                System.out.println("El resultado es: " + resultado);
            break; 

        }
        
    }
}
