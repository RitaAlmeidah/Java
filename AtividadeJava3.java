/*Elabore um algoritmo em Java, que leia o Salário Bruto, 
 * o Adicional Noturno, as Horas Extras e os Descontos de um Colaborador, 
 * em variáveis do tipo float e exiba na tela o Salário Líquido.
 * */
package Exercicios;

import java.util.Scanner;

public class AtividadeJava3 {

	public static void main(String[] args) 
	{
		String nome;
		float salarioBruto, adicNoturno, horasExtras, descontos, salarioLiq;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o valor do salário bruto:  "); 
		salarioBruto = leia.nextFloat();
		
		System.out.println("Informe o valor do adicional noturno:  "); 
		adicNoturno = leia.nextFloat();
		
		System.out.println("Informe o valor das horas extras:  "); 
		horasExtras = leia.nextFloat();
		
		System.out.println("Informe o valor dos descontos:  "); 
		descontos = leia.nextFloat();
		
		salarioLiq = salarioBruto + adicNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("\nO salário líquido é:  %.2f", salarioLiq);

	}

}
