/*Com base na tabela abaixo, escreva um algoritmo
 *  em Java que leia o código de um item 
 *  (número inteiro de 1 a 6) 
 *  e a quantidade comprada deste item (número inteiro). 
 *  A seguir, mostre na tela o valor total 
 *  da conta e o nome do produto que foi comprado.
 *  Valor total = quantidade * preço
 *  Na construção do Algoritmo, utilize os seguintes conteúdos:
 *  Entrada e Saída de dados, Operadores, Laço Condicional Switch.
 * */
package Exercicios;

import java.util.Scanner;

public class LacoCondicionalSwitch1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Boolean pesistencia = false;
		int opcao;
		float quant;
		
		System.out.println("######################  CARDÁPIO  #######################");

		System.out.println("\n--Digite 1 para o produto Cachorro Quente--R$10.00");
		System.out.println("--Digite 2 para o produto X-Salada-----------R$15.00");
		System.out.println("--Digite 3 para o produto X-Bacon------------R$18.00");
		System.out.println("--Digite 4 para o produto Bauru--------------R$12.00");
		System.out.println("--Digite 5 para o produto Refrigerante-------R$8.00");
		System.out.println("--Digite 6 para o produto Suco de laranja----R$13.00");
		opcao = ler.nextInt();
		
		System.out.println("Informe a quantidade: "); 
		quant = ler.nextFloat();
		
		switch(opcao) 
		{
		case 1:
		{
			System.out.println("Produto: Cachorro Quente, "+quant+ " unidades. \nValor total da compra: R$ "+(10*quant));
		}
			break;
			
		case 2:
		{
			System.out.println("Produto: X-Salada, "+quant+" unidades. \nValor total da compra: R$ "+(15*quant));
		}
			break;
		case 3:
		{
			System.out.println("Produto: X-Bacon, "+quant+" unidades.  \nValor total da compra: R$ "+(18*quant));
		}
			break;
			
		case 4:
		{
			System.out.println("Produto: Bauru, "+quant+" unidades.  \nValor total da compra: R$ "+(12*quant));
		}
			break;
			
		case 5:
		{
			System.out.println("Produto: Refrigerante, "+quant+" unidades.  \nValor total da compra: R$ "+(8*quant));
		}
			break;
			
		case 6:
		{
			System.out.println("Produto: Suco de laranja, "+quant+" unidades.  \nValor total da compra: R$ "+(13*quant));
		}
			break;
			
		default:
			System.out.println("Opção inválida!");
		}
	}
}
