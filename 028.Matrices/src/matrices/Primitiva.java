

package matrices;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Primitiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        int opcion;
        do {
            System.out.println("1.Sorteo y Jugar\n2.Terminar");
            opcion = sc.nextInt();
            if(opcion == 1){
                int [] combinacionG = generarCombinacion();
                int complementarioG = generarComplementario();
                int reintegroG = generarReintegro();
        
                int [] combinacion = generarCombinacion();
                int complementario = generarComplementario();
                int reintegro = generarReintegro();
                
                System.out.println("\nResultado: "+comprobarPrimitiva(combinacionG,complementarioG,reintegroG,combinacion,complementario,reintegro));
            }
        } while (opcion == 1);
    }
    public static String comprobarPrimitiva(int[] combinacionG, int complementarioG, int reintegroG, int[] combinacion, int complementario, int reintegro){
        int aciertosCombinacion = 0;
        String resultado = "";
        
        System.out.println("SORTEO");
        System.out.println("Cominación ganadora: "+combinacionG[0]+"-"+combinacionG[1]+"-"+combinacionG[2]+"-"+combinacionG[3]+"-"+combinacionG[4]+"-"+combinacionG[5]);
        System.out.println("Número complementario: "+complementarioG);
        System.out.println("Reintegro: "+reintegroG+"\n");
        
        System.out.println("TU VOLETO");
        System.out.println("Cominación: "+combinacion[0]+"-"+combinacion[1]+"-"+combinacion[2]+"-"+combinacion[3]+"-"+combinacion[4]+"-"+combinacion[5]);
        System.out.println("Número: "+complementario);
        System.out.println("Reintegro: "+reintegro+"\n");
        
        for (int i = 0; i < combinacion.length; i++) {
            for (int j = 0; j < combinacionG.length; j++) {
                if(combinacion[i] == combinacionG[j]){
                    aciertosCombinacion++;
                }
            }
        }
        if(aciertosCombinacion >= 3){
            switch(aciertosCombinacion){
                case 3 -> resultado = "5º";
                case 4 -> resultado = "4º";
                case 5 -> { 
                    if(complementario == complementarioG){
                        resultado = "2º";
                    }else{
                        resultado = "3º";
                    }
                }
                case 6 -> {
                    if(reintegro == reintegroG){
                        resultado = "Especial";
                    }else{
                        resultado = "1º";
                    }
                }

            } 
            
        }else{
            if(reintegroG == reintegro){
                resultado = "Reintegro";
            }else{
                resultado = "Nada";
            }
        }
        
        return resultado;
    }
    public static int[] generarCombinacion(){
        int [] combinacion = new int [6];
        for (int i = 0; i < combinacion.length; i++) {
            combinacion[i] = generarNumerosCombinacion(combinacion[0],combinacion[1],combinacion[2],combinacion[3],combinacion[4],combinacion[5]);
        }
        Arrays.sort(combinacion);
        return combinacion;
    }
    public static int generarNumerosCombinacion(int n1, int n2, int n3, int n4, int n5, int n6){
        int valor = (int) (1 + (Math.random()*48));
        if(valor != n1 && valor != n2 && valor != n3 && valor != n4 && valor != n5 && valor != n6){ 
            return valor;
        }else{
            return generarNumerosCombinacion(n1,n2,n3,n4,n5,n6);
        }
    }
    public static int generarComplementario(){
        int num = (int) (1 + (Math.random()*48));
        return num;
    }    
    public static int generarReintegro(){
        int num = (int) (Math.random()*9);
        return num;
    }    
}

