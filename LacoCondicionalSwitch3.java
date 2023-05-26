package Exercicios;

import java.util.Scanner;

public class LacoCondicionalSwitch3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Boolean pesistencia = false;
		int opcao;
		float num1, num2;
		
		System.out.println("Informe o primeiro número: "); 
		num1 = ler.nextFloat();
		
		System.out.println("\nInforme o segundo número: "); 
		num2 = ler.nextFloat();
		
		System.out.println("- Digite 1 para Soma.");
		System.out.println("- Digite 2 para Subtração.");
		System.out.println("- Digite 3 para Multiplicação.");
		System.out.println("- Digite 4 para Divisão.");
		opcao = ler.nextInt();
		
		switch(opcao) 
		{
		case 1:
		{
			System.out.println("\n"+num1+" + "+num2+" = "+(num1+num2));
		}
			break;
			
		case 2:
		{
			System.out.println("\n"+num1+" - "+num2+" = "+(num1-num2));
		}
			break;
		case 3:
		{
			System.out.println("\n"+num1+" * "+num2+" = "+(num1*num2));
		}
			break;
			
		case 4:
		{
			System.out.println("\n"+num1+" / "+num2+" = "+(num1/num2));
		}
			break;
			
		default:
			System.out.println("\nOperação inválida!");
		}
	}
}
