package juegodedados;
import java.util.Scanner;
import java.lang.Math;

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
        int puntosJugador1Momentaneo = 0;
        int puntosJugador2Momentaneo = 0;
        
        int turno = 1;
        do {
            System.out.println("\nTURNO "+turno+"\n");
            
            cifraJugador1 = (int) (Math.random()*6);
            formaJugador1 = (int) (Math.random()*6);
            cifraJugador2 = (int) (Math.random()*6);
            formaJugador2 = (int) (Math.random()*6);
            
            switch(formaJugador1){
                case 1: puntosJugador1Momentaneo = Factorial(cifraJugador1); break;
                case 2: puntosJugador1Momentaneo = Sumatorio(cifraJugador1); break;
                case 3: puntosJugador1Momentaneo = (cifraJugador1*cifraJugador1); break;
                case 4: puntosJugador1Momentaneo = 1; break;
                case 5: puntosJugador1Momentaneo = cifraJugador1; break;
                case 6: puntosJugador1Momentaneo = 0; break;
            }
            switch(formaJugador2){
                case 1: puntosJugador2Momentaneo = Factorial(cifraJugador2); break;
                case 2: puntosJugador2Momentaneo = Sumatorio(cifraJugador2); break;
                case 3: puntosJugador2Momentaneo = (cifraJugador2*cifraJugador2); break;
                case 4: puntosJugador2Momentaneo = 1; break;
                case 5: puntosJugador2Momentaneo = cifraJugador2; break;
                case 6: puntosJugador2Momentaneo = 0; break;
            }
            if(puntosJugador1Momentaneo > puntosJugador2Momentaneo){
                puntosJugador1 = puntosJugador1 + puntosJugador1Momentaneo;
                puntosJugador2 = puntosJugador2 - puntosJugador2Momentaneo;
            }else{
                puntosJugador2 = puntosJugador2 + puntosJugador2Momentaneo;
                puntosJugador1 = puntosJugador1 - puntosJugador1Momentaneo;
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
        
        if(inferior > 0){
            resultado = num*Factorial(inferior);
        }
        
        return resultado;
    }
    public static int Sumatorio(int num){
        int inferior = num-1;
        int resultado = 0;
        
        if(inferior > 0){
            resultado = num+Sumatorio(inferior);
        }
        
        return resultado;
    }
    
}
