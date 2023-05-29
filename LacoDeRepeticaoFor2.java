package Exercicios;

import java.util.Scanner;

public class LacoDeRepeticaoFor2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num=0, contador, par, impar;
		
		for(contador = 1 ; contador < 11; contador++) 
		{
			System.out.println("Digite o " + contador + "º número: ");
			num = ler.nextInt();
		}
		if(num % 2 == 0);
				{
					for(contador = num ; contador == num; contador++)
					{
				System.out.println("Total de números pares: "+num); 
				}
				}
		if(num % 2 == 1);
		{
			for(contador = num ; contador == num; contador++)
			{
				System.out.println("Total de números ímpares: "+num);
			}
		}
	}
}