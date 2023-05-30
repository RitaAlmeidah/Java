/*
3. Escreva um programa Java para criar uma Collection Set 
de Objetos da Classe Wrapper Integer. O programa deverá 
solicitar ao usuário, que ele digite via teclado 
10 valores inteiros não repetidos e adicione-os 
individualmente na Collection Set. Em seguida, 
faça o que se pede:
Mostre na tela todos os elementos 
da Collection Set, utilizando a Classe Iterator. 
*/
package Exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class AtividadeSet1 {

	public static void main(String[] args) {
		Set<Integer> setNum = new HashSet<>();
		
		Scanner Ler = new Scanner(System.in);
		Integer numInt = 0;
		
		for(int i = 0; i < 10; i++) 
		{
			System.out.println("Digite números inteiros: ");
			numInt = Ler.nextInt();
			setNum.add(numInt);
		}
		System.out.println("\nListar dados do Set: " + setNum.contains(numInt));

		Iterator<Integer> isetNum = setNum.iterator();

		while (isetNum.hasNext()) 
		{
			System.out.println(isetNum.next());
		}
	}
}