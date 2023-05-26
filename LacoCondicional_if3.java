package Exercicios;

import java.util.Scanner;

public class LacoCondicional_if3 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	Boolean primeiraDoacao = true;
	String nome;
	int idade;
	
	System.out.println("Primeira doação de sangue? \nPara sim digite true, ou false para não: ");
	primeiraDoacao = ler.nextBoolean();
	
	System.out.println("\nInforme sua nome: ");
	nome = ler.next();
	
	System.out.println("\nInforme sua idade: ");
	idade = ler.nextInt();
	
	if (idade >=18 && idade <=60)
	{
		System.out.println("\n"+nome+" está apto(a) para doar sangue!");
	} 
	else if (idade >=60 && idade <=69)
	{
		if(primeiraDoacao == true)
		{
		System.out.println("\n"+nome+" está apto(a) para doar sangue!");
		}
		else
		{
		System.out.println("\n"+nome+" não está apto(a) para doar sangue!");
		}
	}
	else {
		System.out.println("\n"+nome+" não está apto para doar sangue!");
	}
	}
}
