package lab1p2_joseseron;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joser
 * fila 3 asiento 6
 */
public class Lab1P2_JoseSeron {

  
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
        
        int [] array = matriz[0];
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        
        
        System.out.println("bubblesort");
        
        int []arraySorted = bubbleSort(array);
          for (int i = 0; i < arraySorted.length; i++) {
            System.out.print(arraySorted[i]+" ");
        }
     
    }
    
    public static int[] bubbleSort (int[] arreglo){
    System.out.println("entro");
        for (int i = 0; i < arreglo.length; i++) {
                
            for (int j = 0; j < arreglo.length; j++) {
                if (     (j!=arreglo.length-1)  && arreglo[j]>arreglo[j+1] ) {
                    int var = arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=var;
                    
                    bubbleSort(arreglo);
                    
                }else {
                
                }
            }
            
        }
      
        return arreglo;
        



        
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
