/*
 1. Escreva um programa Java para criar uma
  Collection ArrayList de Objetos da Classe String. 
  O programa deverá solicitar ao usuário, 
  que ele digite via teclado 5 cores e deverá 
  adicioná-las individualmente no ArrayList. 
  Em seguida, faça o que se pede:
  Mostre na tela todas as cores que foram adicionadas. 
  Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
 */
package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AtividadeList1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		ArrayList <String> cores = new ArrayList<String>(); 
		
		String cor;
		
		for(int i = 0; i <5; i++)
		{
			System.out.println("Digite uma cor: ");
			cor = leia.next();
			cores.add(cor);
		}
		
		System.out.println("\nListar todas as cores: " + cores);
	
		Collections.sort(cores);
		
		System.out.println("\nOrdenar as cores: " + cores);
	}
}