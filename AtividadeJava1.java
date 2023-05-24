/*Atividades: 1.Dado o Fluxograma abaixo, 
 * desenvolva o algoritmo abaixo na 
 * Linguagem Java: inicio, Digite o Salário,
 * Leia o Salário, Digito o abono, Leia o abono,
 * NovoSalário= Salário + Abono, 
 * Exibe o NovoSalário,Fim.*/
package Exercicios;

import java.util.Scanner;

public class AtividadeJava1 {

	public static void main(String[] args) 
	{
		float salario, abono, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor do salário: R$ "); 
		salario = leia.nextFloat();

		System.out.println("Digite o valor do abono: R$  ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("\nO novo salário é o valor de: R$ %.2f", novoSalario);

	}

}
