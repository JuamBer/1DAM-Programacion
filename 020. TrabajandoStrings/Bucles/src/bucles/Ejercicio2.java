package bucles;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("1. Suma\n 2. Resta\n 3. Multiplica\n 4. Salir");
        
        int num = sc.nextInt();
        boolean valido = false;
        
        while(valido == false){
            if((num > 0) && (num < 5)){
                valido = true;
            }else {
                System.out.println("Introduce un número válido: ");
                num = sc.nextInt();
            }
        }
        
        
    }
}
