/*
 2.Escreva um programa Java para criar uma Collection ArrayList
  de Objetos da Classe Wrapper Integer, inicializada com 
  10 valores inteiros. O programa deverá solicitar ao usuário, 
  que ele digite via teclado 1 número inteiro e caso ele seja 
  encontrado no ArrayList, exiba na tela a posição deste número 
  na Collection. Caso o número não seja encontrado, ele deverá 
  exibir na tela a mensagem: O número NN não foi encontrado!
 */
package Exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AtividadeList2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> listNotas = new ArrayList<Integer>();
		
		Scanner Ler = new Scanner(System.in);
		Integer numInt = 0, num;
		
		for(int i = 0; i < 10; i++) 
		{
			System.out.println("Digite números inteiros: ");
			numInt = Ler.nextInt();
			listNotas.add(numInt);
		}
		System.out.println("\nList: " + listNotas);
		

		System.out.println("\nDigite o número que você deseja encontrar: ");
		num = Ler.nextInt();
		
		if (num < 0)
		{
		System.out.println("\nO número: "+num+ " esta localizado na posição: " + listNotas.indexOf(num));
		}
		else
		{
			System.out.println("\nO número " +num+ " não foi encontrado!");
		}
	}
}