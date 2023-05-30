/*
 4. Escreva um programa Java para criar uma 
 Collection Set de Objetos da Classe Wrapper Integer,
 inicializada com 10 valores inteiros. 
 O programa deverá solicitar ao usuário, que ele 
 digite via teclado 1 número inteiro e caso ele 
 seja encontrado no Set, exiba na tela a mensagem: 
 Número 00 Encontrado! Caso o número não seja encontrado, 
 ele deverá exibir na tela a mensagem: O número NN não foi encontrado!
 */
package Exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AtividadeSet2 {

	public static void main(String[] args) {
		Set<Integer> setNum = new HashSet<Integer>();
	
		Scanner Ler = new Scanner(System.in);
		Integer numInt = 0, num, num2;
		for(int i = 0; i < 5; i++) 
		{
			System.out.println("Digite números inteiros: ");
			numInt = Ler.nextInt();
			setNum.add(numInt);
		}
		System.out.println("\nList: " + setNum);
		
		System.out.println("\nDigite o número que você deseja encontrar: ");
		num2 = Ler.nextInt();
		
		if (setNum.contains(num2))
		{
				System.out.println("\nO número: "+num2+ " foi encontrado!");
		}
		else
		{
			System.out.println("\nO número " +num2+ " não foi encontrado!");
		}
	}
}