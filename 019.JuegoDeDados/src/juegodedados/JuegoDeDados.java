package juegodedados;
import java.util.Scanner;

public class JuegoDeDados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int opcion;
        int numPuntosGanar = 1000;
        String jugador1;
        String jugador2;
        do {
            System.out.println("\n1.Configurar \n2.Jugar \n3.Salir");
            opcion = sc.nextInt();
            if(opcion == 1){
                System.out.println("Inserte un número de puntos para ganar, el actual es: "+numPuntosGanar);
                numPuntosGanar = sc.nextInt();
                System.out.println("El número de puntos para ganar ahora es: "+numPuntosGanar);
            }else if(opcion == 2){
                System.out.println("Nombre del primer Jugador: ");
                jugador1 = sc.next();
                System.out.println("Nombre del segundo Jugador: ");
                jugador2 = sc.next();
                Juego(numPuntosGanar,jugador1,jugador2);
            }
        } while (opcion != 3);
        
    }
    
    public static void Juego(int numPuntosGanar, String jugador1, String jugador2){
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int puntosJugador1 = 0;
        int puntosJugador2 = 0;
        int cifraJugador1;
        int cifraJugador2;
        int formaJugador1;
        int formaJugador2;
        
        int turno = 1;
        do {
            System.out.println("\nTURNO "+turno+"\n");
            
            System.out.println(jugador1 + "=> Cifra con la que se obtendrán los puntos:");
            cifraJugador1 = sc.nextInt();
            System.out.println(jugador1 + "=> Forma de obtener los puntos:");
            formaJugador1 = sc.nextInt();
            System.out.println(jugador2 + "=> Cifra con la que se obtendrán los puntos:");
            cifraJugador2 = sc.nextInt();
            System.out.println(jugador2 + "=> Forma de obtener los puntos:");
            formaJugador2 = sc.nextInt();
            
            switch(formaJugador1){
                case 1: puntosJugador1 = puntosJugador1 + Factorial(cifraJugador1); break;
                case 2: puntosJugador1 = puntosJugador1 + Sumatorio(cifraJugador1); break;
                case 3: puntosJugador1 = puntosJugador1 + (cifraJugador1*cifraJugador1); break;
                case 4: puntosJugador1 = puntosJugador1 + 1; break;
                case 5: puntosJugador1 = puntosJugador1 + cifraJugador1; break;
                case 6: puntosJugador1 = puntosJugador1 + 0; break;
            }
            switch(formaJugador2){
                case 1: puntosJugador2 = puntosJugador2 + Factorial(cifraJugador2); break;
                case 2: puntosJugador2 = puntosJugador2 + Sumatorio(cifraJugador2); break;
                case 3: puntosJugador2 = puntosJugador2 + (cifraJugador2*cifraJugador2); break;
                case 4: puntosJugador2 = puntosJugador2 + 1; break;
                case 5: puntosJugador2 = puntosJugador2 + cifraJugador2; break;
                case 6: puntosJugador2 = puntosJugador2 + 0; break;
            }
            System.out.println("Puntos "+jugador1 +": "+puntosJugador1);
            System.out.println("Puntos "+jugador2 +": "+puntosJugador2);
            turno++;
        } while ((puntosJugador1 < numPuntosGanar) && (puntosJugador2 < numPuntosGanar));
        
        if(puntosJugador1 > numPuntosGanar){
            System.out.println(jugador1 + " Ha ganado! \n Resultado Final: "+ jugador1 + ":" + puntosJugador1 + "   " + jugador2 + ":" + puntosJugador2);
        }else{
            System.out.println(jugador2 + " Ha ganado! \n Resultado Final: "+ jugador1 + ":" + puntosJugador1 + "   " + jugador2 + ":" + puntosJugador2);
        }
        
    }
    public static int Factorial(int num){
        int inferior = num-1;
        int resultado = 1;
        
        if(inferior !=0){
            resultado = num*Factorial(inferior);
        }
        
        return resultado;
    }
    public static int Sumatorio(int num){
        int inferior = num-1;
        int resultado = 0;
        
        if(inferior !=0){
            resultado = num+Sumatorio(inferior);
        }
        
        return resultado;
    }
    
}
