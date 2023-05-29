/*
 
 */
package Exercicios;

import java.util.Scanner;

public class Matriz1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int matriz[][] = { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 } };
		int diagonal1 = 0, diagonal2 = 0;
		
		System.out.println("Elementos da Diagonal Principal: ");
		for (int iLinha = 0; iLinha < 3; iLinha++) 
		{
			for (int iColuna = 2; iColuna < 3; iColuna++) 
			{
				System.out.print(matriz[iLinha][iLinha] + " ");
				diagonal1 = diagonal1 + matriz[iLinha][iLinha];
			}
		}
		
		System.out.println("\nElementos da Diagonal Secundária: ");
		for (int iLinha = 0; iLinha < 3; iLinha++) 
		{
			for (int iColuna = 2; iColuna < 3; iColuna++) 
			{
				System.out.print(matriz[iLinha][iColuna - iLinha] + " ");
				diagonal2 = diagonal2 + matriz[iLinha][iColuna - iLinha];
			}
		}
		
		System.out.println("\nSoma dos Elementos da Diagonal Principal:\n" + diagonal1);
		System.out.println("Soma dos Elementos da Diagonal Secundária:\n" + diagonal2);
	}
}