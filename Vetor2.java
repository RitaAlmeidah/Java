/*
Elabore um algoritmo que leia 10 números inteiros 
e armazene em um vetor. Em seguida, mostre na tela:
Todos os elementos dos índices ímpares do vetor 
Todos os elementos do vetor que são números pares
A Soma de todos os elementos do vetor
A Média de todos os elementos do vetor, armazenada
em uma variável do tipo real
*/
package Exercicios;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorInt[] = new int[10];
		int i, num, soma = 0;

		Scanner ler = new Scanner(System.in);

		for (i = 0; i < 10; i++) 
		{
			System.out.println("Digite o " + (i + 1) + "º Número: ");
			vetorInt[i] = leia.nextInt();
		}
		
		System.out.println("vetor ");
		for (i = 0; i < 10; i++) 
		{
			System.out.print(vetorInt[i] + "|");
		}
		
		System.out.println("\nElementos nos índices ímpares: ");
		for (i = 0; i < 10; i++) 
		{
			if (i % 2 == 1) 
			{
				System.out.print(vetorInt[i] + " ");
			}
		}
		System.out.println("\nElementos pares:");
		for (i = 0; i < 10; i++) 
		{
			if (vetorInt[i] % 2 == 0) 
			{
				System.out.print(vetorInt[i] + " ");
			}
		}
		
		for (i = 0; i < 10; i++) 
		{
			soma += vetorInt[i];
		}
		System.out.println("\nSoma:" + soma);
		float media =  (float)  soma / 10;
		System.out.printf("\nMédia %.2f ", media);
	}
}