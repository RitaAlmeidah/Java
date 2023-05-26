package Exercicios;

import java.util.Scanner;

public class LacosDeRepeticaoDoWhile {

	public static void main(String[] args) {
		
	int num, soma = 0;	
	Scanner ler = new Scanner(System.in);

	do
	{
		System.out.println("\nDigite um número inteiro(digite 0 para finalizar): ");
		num = ler.nextInt();
		if (num > 0)
		{
			soma = soma + num;
		}
	}
	while (num != 0);
	System.out.println("\nA soma dos números positivos é: " + soma);
	}
}

