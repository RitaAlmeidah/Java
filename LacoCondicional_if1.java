/*Faça um algoritmo em Java que leia 3 valores inteiros A, B e C 
 * e imprima na tela se a soma de A + B é maior, menor ou igual a C.
 * Na construção do Algoritmo, utilize os seguintes conteúdos:
Entrada e Saída de dados, Operadores, Laço Condicional IF
*/
package Exercicios;

import java.util.Scanner;

public class LacoCondicional_if1 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		int a, b, c, soma;

		System.out.println("Digite um valor para A: ");
		a = ler.nextInt();
		
		System.out.println("Digite um valor para B: ");
		b = ler.nextInt();
		
		System.out.println("Digite um valor para C: ");
		c = ler.nextInt();
		
		soma = a + b;
		
		if(soma > c) 
		{
			System.out.printf("\nA soma dos valores A + B: "+soma+ ", é Maior que o valor C.");
		}
		else if(soma < c)
		{
			System.out.printf("\nA soma dos valores A + B: "+soma+ ", é Menor que o valor C.");
		}
		else 
		{
			System.out.printf("\nA soma dos valores A + B: "+soma+ ", é Igual ao valor C.");
		}
	}
}
