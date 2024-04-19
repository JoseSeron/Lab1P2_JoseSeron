package lab1p2_joseseron;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joser
 */
public class Lab1P2_JoseSeron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("<--------Lab 1 : Jose R. Seron--------->");
        
       int tamanioMatriz;
        do {
            System.out.println("Ingrese tamanio de la matriz");
             tamanioMatriz = input.nextInt();
             if (tamanioMatriz < 4 || (tamanioMatriz % 2) == 0) {
                 System.out.println("El tamanio debe ser un numero impar mayor que 4");
            }
        } while (tamanioMatriz < 4 || (tamanioMatriz % 2) == 0);
        
        
        int[][] matriz = new int[tamanioMatriz][tamanioMatriz];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=random.nextInt(10);
            }
        }
        
        imprimirMatriz(matriz);
        
        System.out.println("salio while");
     
    }
    
    public static void imprimirMatriz(int[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }

}
