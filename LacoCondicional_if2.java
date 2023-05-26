/*Escreva um algoritmo em Java, que leia um número 
 * inteiro via teclado e mostre na tela uma mensagem 
 * indicando se este número é par ou ímpar e 
 * se o número é positivo ou negativo.
 * Na construção do Algoritmo, utilize os seguintes conteúdos:
Entrada e Saída de dados, Operadores, Laço Condicional IF
 * */

package Exercicios;

import java.util.Scanner;

public class LacoCondicional_if2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num;

		System.out.println("Digite um número inteiro: ");
		num = ler.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("O número "+num+ " é Par,");
			
		}	
		else
		{
			System.out.println("O número "+num+ " é impar,");
		}
		
		if(num >= 0)
		{
			System.out.println("e positivo!");
		}
		else
		{
			System.out.println("e negativo!");
		}
	}
}
