/*Elabore um algoritmo em Java que leia 4 notas de um participante, 
 * em variáveis do tipo float e exiba na tela a média final do participante.
 * CALCULAR MÉDIA = (NOTA1 + NOTA2 + NOTA3 + NOTA4) / 4
 */
package Exercicios;

import java.util.Scanner;

public class AtividadeJava2 {

	public static void main(String[] args) {
		float media, nota1, nota2, nota3, nota4;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a nota 1:  "); 
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a nota 2:  "); 
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a nota 3:  "); 
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a nota 4:  "); 
		nota4 = leia.nextFloat();
		
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("\nA média das notas é:  %.1f", media);

	}

}
