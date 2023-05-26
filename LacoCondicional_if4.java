package Exercicios;

import java.util.Scanner;

public class LacoCondicional_if4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String caracter1, caracter2, caracter3, resultadoFinal;

		System.out.println("Informe a característica do animal: \n---Invertebrado---Vertebrado---");
		caracter1 = leia.next();
		
		System.out.println("Informe a característica: \n--Ave--mamífero--Inseto--Anelídeo--");
		caracter2 = leia.next();
		
		System.out.println("Informe as características: \n--Carnívoro--Onívoro--Herbívoro--Hematófago--");
		caracter3 = leia.next();

		if (caracter1.equalsIgnoreCase("Vertebrado")) 
		{
			if (caracter2.equalsIgnoreCase("Ave")) 
			{
				if (caracter3.equalsIgnoreCase("Carnívoro")) 
				{
					System.out.println("Águia");
				} 
				else 
				{
					System.out.println("Pombo");
				}
			} 
			else 
			{
				if (caracter3.equalsIgnoreCase("Onívoro")) 
				{
					System.out.println("Homem");
				} else 
				{
					if (caracter3.equalsIgnoreCase("Herbívoro"))
					{
					System.out.println("Vaca");
					}
				}
			}
		} 
		else 
		{
			if (caracter2.equalsIgnoreCase("Inseto")) 
			{
				if (caracter3.equalsIgnoreCase("Hematófago")) 
				{
					System.out.println("Pulga");
				} 
				else 
				{
					if (caracter3.equalsIgnoreCase("Herbívoro")) 
					{
						System.out.println("Lagarta");
					}
				}
			} 
			else 
			{
				if (caracter2.equalsIgnoreCase("Anelídeo")) 
				{
					if (caracter3.equalsIgnoreCase("Hematófago")) 
					{
						System.out.println("Sanguessuga");
					} 
					else 
					{
						if (caracter3.equalsIgnoreCase("Onívoro")) 
						{
							System.out.println("Minhoca");
						}
					}
				}
			}
		}
	}
}