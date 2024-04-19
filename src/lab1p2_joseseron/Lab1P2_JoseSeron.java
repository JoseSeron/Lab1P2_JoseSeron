package lab1p2_joseseron;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joser fila 3 asiento 6
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
                matriz[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Matriz Original");
        imprimirMatriz(matriz);
        System.out.println("");

        int[] array = matriz[0];

        int[][] matrizSorted = new int[tamanioMatriz][tamanioMatriz];

        for (int i = 0; i < matriz.length; i++) {
            matrizSorted[i] = bubbleSort(matriz[i]);
        }

        System.out.println("Matriz Ordenada");
        imprimirMatriz(matrizSorted);
        
        ArrayList medianas = new ArrayList();
     
        for (int i = 0; i < matrizSorted.length; i++) {
            medianas.add(matrizSorted[i][((matrizSorted.length+1)/2)-1]);
        }
        
        
        System.out.println("\nArreglo Medianas");
        for (int i = 0; i < medianas.size(); i++) {
            System.out.print("["+medianas.get(i)+"]");
        }
        
        
        
        System.out.println("\n\nArreglo Medianas Ordenado");
        
     
        
        ArrayList medianasSorted = new ArrayList();
             medianasSorted = bubbleSortAL(medianas);
             
             
        for (int i = 0; i < medianasSorted.size(); i++) {
            System.out.print("["+medianasSorted.get(i)+"]");
        }
       
        System.out.println("\n\nMediana de medianas");
        System.out.println(medianasSorted.get(((medianasSorted.size()+1)/2)-1));
        
        System.out.println("");

    }

    public static int[] bubbleSort(int[] arreglo) {
        //  System.out.println("entro");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if ((j != arreglo.length - 1) && arreglo[j] > arreglo[j + 1]) {
                    int var = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = var;
                    bubbleSort(arreglo);
                } else {
                }
            }
        }
        return arreglo;

    }

    
        public static ArrayList bubbleSortAL(ArrayList arreglo) {
        //  System.out.println("entro");
        for (int i = 0; i < arreglo.size(); i++) {
            for (int j = 0; j < arreglo.size(); j++) {
                if ( (j != arreglo.size() - 1) && (int)arreglo.get(j) > (int)arreglo.get(j+1) ){
                    
                    int var1 = (int)arreglo.get(j);
                    arreglo.set(j, arreglo.get(j+1));
                    arreglo.set(j+1, var1);
                    bubbleSortAL(arreglo);
                } else {
                }
            }
        }
        return arreglo;

    }
    
    
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
