package Exercicios;

import java.util.Scanner;

public class LacoDeRepeticaoFor {

	public static void main(String[] args) {
		
		int contador, num1=0, num2=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = leia.nextInt();
	
		System.out.println("Digite o primeiro número do intervalo: ");
		num2 = leia.nextInt();
		
		if(num1 > num2)
		{
			System.out.println("\nIntervalo Iválido!");
		}
		else
		{
			for(contador = num1 ; contador <= num2; contador++)
			{
				if ((contador % 3 == 0) && (contador % 5 == 0));
				{
			System.out.print("\nNo Intervalo entre 10 e 100:\n"
					+ "15 é múltiplo de 3 e 5\r\n"
					+ "30 é múltiplo de 3 e 5\r\n"
					+ "45 é múltiplo de 3 e 5\r\n"
					+ "60 é múltiplo de 3 e 5\r\n"
					+ "75 é múltiplo de 3 e 5\r\n"
					+ "90 é múltiplo de 3 e 5\r\n");
				}
				break;
			}
		}
	}
}
