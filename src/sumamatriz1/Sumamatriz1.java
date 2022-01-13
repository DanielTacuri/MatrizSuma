/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumamatriz1;

import java.util.Scanner;

/**
 *
 * @author DANIEL
 */
public class Sumamatriz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner xs=new Scanner(System.in);
		
		System.out.println("Ingrese el numero de filas:    ");   int Filas =xs.nextInt();
		System.out.println("Ingrese el numero de Columnas: ");  int Columnas=xs.nextInt();
		
		int xMatA[][]=new int[Filas][Columnas];   // Declaramos la matriz o el Array de tipo INT
		int xMatB[][]=new int[Filas][Columnas];
		//Ahora la llenamos

		System.out.println("          Llenar Matriz A");
		System.out.println();
		for(int i=0;i<Filas;i++){
			for(int w=0;w<Columnas;w++){
				System.out.print("Ingrese el valor de la Fila " + i + " de la Columna " + w + ": ");
				xMatA[i][w]=xs.nextInt();   // Bueno solo con los 2 For la podemos llenar ya q tiene 2 dimenciones de filas y columnas				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("          Llenar Matriz B");
		System.out.println();
		for(int i=0;i<Filas;i++){
			for(int w=0;w<Columnas;w++){
				System.out.print("Ingrese el valor de la Fila " + i + " de la Columna " + w + ": ");
				xMatB[i][w]=xs.nextInt();   // Bueno solo con los 2 For la podemos llenar ya q tiene 2 dimenciones de filas y columnas				
			}
			System.out.println();
		}
		int xRs[][]=new int[Filas][Columnas];
		for(int i=0;i<Filas;i++){
			for(int w=0;w<Columnas;w++){
				xRs[i][w]=xMatA[i][w]+xMatB[i][w];
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.println("      Suma de las Matrices A y B");
		
		for(int i=0;i<Filas;i++){
			for(int w=0;w<Columnas;w++){
				System.out.println("   " + xMatA[i][w] + " + " + xMatB[i][w] + " = " + xRs[i][w]);
			}
		}
		System.out.println();
		System.out.println();
			System.out.println("      Matriz Resultante");
		
		for(int i=0;i<Filas;i++){
			System.out.print("\t");
			for(int w=0;w<Columnas;w++){
				System.out.print(xRs[i][w] + "\t");
			}
			System.out.println();
		}
                
	}
        

    }
    
