/*
 Elabore um algoritmo que leia as notas 
 de uma classe com 10 participantes durante 4 
 bimestres de um ano. As 4 notas de cada participante 
 serão armazenadas em uma linha de uma matriz de 
 números reais, logo cada linha da matriz serão as 
 notas de um participante. Em um vetor de números reais, 
 armazene as médias de cada participante e 
 exiba as médias de cada um na tela.
*/
package Exercicios;

import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double[][] notas = new double[10][4];
		double[] medias = new double[10];
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Digite as notas dos alunos "+(i + 1) + ":");
			for(int j = 0; j < 4; j++)
			{
				System.out.print("Nota " + (j+1)+ ": ");
				notas[i][j] = leia.nextDouble();
			}
		}
		for(int i = 0; i < 10; i++)
		{
			double soma = 0;
			for(int j = 0; j < 4; j++)
			{
				soma += notas[i][j];
			}
			medias[i] = soma / 4;
		}
		System.out.println("\nMédia dos alunos: ");
		for(int i = 0; i < 10; i++)
		{
			System.out.printf("Alunos %d: %.1f\n",(i + 1), medias[i]);
		}
	}
}