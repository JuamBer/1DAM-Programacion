package metodos1;
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("Introduce un número N");
        int num = sc.nextInt();    
        
        System.out.println(Funcion(num));
    }
    
    public static int Funcion(int num){
        int numPotencia;
        for (numPotencia = 1; Math.pow(2,numPotencia) < num ; numPotencia++) {}
        return numPotencia;
    }
}

