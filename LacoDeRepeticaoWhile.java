package Exercicios;

import java.util.Scanner;

public class LacoDeRepeticaoWhile {

	public static void main(String[] args) {
		
		int idade, maior = 0, menor = 0;
		
		Scanner ler = new Scanner(System.in);

		System.out.print("Informe uma idade: ");
		idade = ler.nextInt();
		
		while(idade >= 0)
		{
			if(idade < 21)
			{
				menor++;
			}
			if(idade > 50)
			{
				maior++;
			}
			System.out.print("Informe uma idade: ");
			idade = ler.nextInt();
		}
		if(idade <= 0)
		{
		System.out.println("Total de pessoas menores de 21 anos: "+menor);
		System.out.println("Total de pessoas maiores de 50 anos: "+maior);
		}
	}
}