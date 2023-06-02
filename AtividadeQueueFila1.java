/*
 Escreva um programa Java contendo uma Collection Queue(Fila)
 de Objetos da Classe String, para organizar a ordem de chegada
  dos Clientes de um Banco. O programa deverá ter um 
  Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
2: Listar todos os Clientes na fila
3: Chamar (retirar) uma pessoa da fila 
0: O programa deve ser finalizado. 
Caso a fila esteja vazia, o programa deverá informar que 
a fila está vazia ao tentar retirar (chamar) um cliente da fila..

 */
package Exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeQueueFila1 {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();

		Scanner ler = new Scanner(System.in);
		int opcao = 1;
		String nome;
		
		System.out.println("\n\t1: Adicionar Cliente na fila\r\n"
						+  "\t2: Listar todos os Clientes\r\n"
						+  "\t3: Retirar Cliente da Fila\r\n"
						+  "\t0: Sair\r\n");

		
		while(opcao != 0)
		{
			System.out.println("\nDigite uma opção: ");
			opcao = ler.nextInt();
			switch(opcao) 
			{
				case 1:
						System.out.println("\nInforme o nome do novo cliente: ");
						nome=ler.next();
						fila.offer(nome);
						System.out.println("\nFila:\n\n"+nome+"\n\nCliente adicionado!\n");
						break;
				
				case 2:
						System.out.println("\nLista de todos os Clientes na fila:\n "+fila+"\n");
						break;
					
				case 3:
						System.out.println("\nO Cliente: "+fila.remove()+" foi Chamado!\n");
						System.out.println("\nLista de todos os Clientes na fila atualizada:\n "+fila);
						break;
				
				case 0:
						System.out.println("\nPrograma finalizado!");
						break;
				
				default:
				System.out.println("\nOpção inválida!");
			}
		}
	}
}