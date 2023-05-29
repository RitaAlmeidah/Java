/*
 Dado um vetor contendo 10 números inteiros não ordenados 
 e não repetidos, construa um algoritmo que consiga pesquisar
 dados no vetor, onde o usuário irá digitar um número e o 
 programa deve exibir na tela a posição deste número no vetor. 
 Caso o número não seja encontrado, a mensagem: 
 “Não foi encontrado!” deve ser exibida na tela.
*/
package Exercicios;

import java.util.Scanner;
import java.util.Arrays;

public class Vetor1 {

	public static void main(String[] args) {
		int vetorInt[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int i, num;
		Scanner leia = new Scanner(System.in);

		System.out.print("Vetor ");
		for (i = 0; i < 10; i++) 
			{
				System.out.print(vetorInt[i] + "|");
			}
			
		Arrays.sort(vetorInt);

		System.out.println("\nDigite o número que você deseja encontrar: ");
		num = leia.nextInt();

		int posicao = Arrays.binarySearch(vetorInt, num);

		if (posicao >= 0)
			{
				System.out.println("\nO número " + num + " está localizado na posição: " + posicao);
			}
		else
			{
				System.out.println("\nO número " + num + " não foi encontrado!");
			}
	}
}