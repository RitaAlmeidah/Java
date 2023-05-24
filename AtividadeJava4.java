/*Leia quatro valores float (n1, n2, n3, n4). 
 * A seguir, calcule e mostre a diferença do 
 * produto entre o n1 e n2 pelo produto 
 * entre o n3 e o n4. 
 * */
package Exercicios;

import java.util.Scanner;

public class AtividadeJava4 {

	public static void main(String[] args) 
	{
		float num1, num2, num3, num4, calculo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o número 1 para o produto 1:  "); 
		num1 = leia.nextFloat();
		
		System.out.println("Informe o número 2 para o produto 1:  "); 
		num2 = leia.nextFloat();
		
		System.out.println("Informe o número 3 para o produto 2:  "); 
		num3 = leia.nextFloat();
		
		System.out.println("Informe o número 4 para o produto 2:  "); 
		num4 = leia.nextFloat();
		
		calculo = (num1 * num2) - (num3 * num4);
		
		System.out.printf("\nA diferença entre o produto 1 pelo produto 2 é de:  %.1f", calculo);

	}

}
