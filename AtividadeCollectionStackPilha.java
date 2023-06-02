package Exercicios;

import java.util.Scanner;
import java.util.Stack;

public class AtividadeCollectionStackPilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		Scanner ler = new Scanner(System.in);
		
		int opcao = 1;
		String livro;
		
		System.out.println("\n\t1: Adicionar um novo livro na pilha\r\n"
						+  "\t2: Listar todos os livros da Pilha\r\n"
						+  "\t3: Retirar um livro da pilha\r\n"
						+  "\t0: Sair\r\n");
		
		while(opcao != 0)
		{
			System.out.println("\nDigite uma opção: ");
			opcao = ler.nextInt();
			switch(opcao) 
			{
				case 0:
						System.out.println("\nPrograma finalizado!");
						break;
				
				case 1:
						System.out.println("\nInforme o nome do livro: ");
						ler.nextLine();
						livro= ler.nextLine();
						pilha.add(livro);
						System.out.println("\nPilha\n"+pilha);
						System.out.println("\n\nLivro adicionado!\n");
						break;
				
				case 2:
						System.out.println("\nLista de Livros na Pilha:\n "+pilha+"\n");
						break;
					
				case 3:
						if(pilha.size()== 0)
						{
							System.out.println("\nA Pilha está vazia!");
						} else
						{
							System.out.println("\nPilha\n"+pilha);
							System.out.println(pilha.pop()+"\n\nUm Livro foi retirado da pilha!");
						}
						break;

					
				default:
						System.out.println("\nOpção inválida!");
			}
		}
	}
}