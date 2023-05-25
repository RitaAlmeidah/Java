/*
 * */

package Exercicios;

import java.util.Scanner;

public class LacoCondicionalSwitch2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int opcao;
		float salario;
		
		System.out.println("Informe o nome do(a) Colaborador(a):  "); 
		nome = ler.next();
		
		System.out.println("- Digite 1 para o cargo de Gerente.");
		System.out.println("- Digite 2 para o cargo de Vendedor.");
		System.out.println("- Digite 3 para o cargo de Supervisor.");
		System.out.println("- Digite 4 para o cargo de Motorista.");
		System.out.println("- Digite 5 para o cargo de Estoquista.");
		System.out.println("- Digite 6 para o cargo de TI.");
		opcao = ler.nextInt();
		
		System.out.println("Informe o valor do salário atual: R$ "); 
		salario = ler.nextFloat();
		
		switch(opcao) 
		{
		case 1:
		{
			System.out.println("Cargo: Gerente, novo Salário reajustado: R$ "+(salario+ (10*salario)));
		}
			break;
			
		case 2:
		{
			System.out.println("Cargo: Vendedor, novo Salário reajustado: R$ "+(salario+ (7*salario)));
		}
			break;
		case 3:
		{
			System.out.println("Cargo: Supervisor, novo Salário reajustado: R$ "+(salario+ (9*salario)));
		}
			break;
			
		case 4:
		{
			System.out.println("Cargo: Motorista, novo Salário reajustado: R$ "+(salario+ (6*salario)));
		}
			break;
			
		case 5:
		{
			System.out.println("Cargo: Estoquista, novo Salário reajustado: R$ "+(salario+ (5*salario)));
		}
			break;
			
		case 6:
		{
			System.out.println("Cargo: Técnico de TI, novo Salário reajustado: R$ "+(salario+ (8*salario)));
		}
			break;
			
		default:
			System.out.println("Opção inválida!");
		}
	}
}