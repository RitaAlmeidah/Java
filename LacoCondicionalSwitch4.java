package Exercicios;

import java.util.Scanner;

public class LacoCondicionalSwitch4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Boolean pesistencia = false;
		int opcao,num;
		float saldo, saque, deposito;
		
		System.out.println("- Digite 1 para Saldo.");
		System.out.println("- Digite 2 para Saque.");
		System.out.println("- Digite 3 para Depósito.");
		opcao = ler.nextInt();
		
		saldo = 1000;
		
		switch(opcao) 
		{
		case 1:
		{
			System.out.println("Operação - Saldo \nSaldo: R$ "+saldo);
		}
			break;
			
		case 2:
		{
			System.out.println("Operação - Saque \nDigite o valor do saque: R$ ");
			saque = ler.nextInt();
		}
		if (saque > saldo )
		{
			System.out.println("Saldo Insuficiente!");
		}
		else
		{
			System.out.println("Novo Saldo: R$ "+(saldo-saque));
		}
			break;
			
		case 3:
		{
			System.out.println("Operação - Depósito\nDigite o valor do depósito: R$ ");
			deposito = ler.nextInt();
			
			System.out.println("Novo Saldo: R$ "+(deposito+saldo));
		}
			break;
			
		default:
			System.out.println("Operação inválida!");
		}
	}
}
