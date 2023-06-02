/*
Atividade 02
Utilizando os conceitos de Classe, Objeto e Métodos, 
da Programação Orientada a Objetos, crie a Classe 
Funcionario com os seus respectivos Métodos e 
Atributos. 
Na sequência, crie uma Classe chamada 
TestaFuncionario, instancie dois objetos da 
Classe Funcionario e apresente as informações 
destes 2 Objetos no console.
 */

package Exercicios;

import atividade2_Poo.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario F1 = new Funcionario(1, 28, "Andreia", "Professora", 3200.f);
    	Funcionario F2 = new Funcionario(2, 19, "João", "Secretário Escolar", 2000.0f);
    	
    	int opcao = 1;
    	
    	F1.setSalario(3200.0f);
    	F1.setCargo("Professora");
    	F1.setFuncionario("Andreia");
    	F1.setIdade(19);
    	F1.setRegistro(1);
    	F1.visualiza();
    	
    	F2.setSalario(2000.0f);
    	F2.setCargo("Secretário Escolar");
    	F2.setFuncionario("João");
    	F2.setIdade(19);
    	F2.setRegistro(2);
    	F2.visualiza();
    	
    	
    	
    	System.out.println("*************************************************");
    	System.out.println("*************DADOS DOS FUNCIONÁRIOS**************");
    	System.out.println("*************************************************");
    	System.out.println("                                                 ");
    	
    	System.out.println("_________________________________________________");
    	System.out.println("*************************************************");
    	System.out.println("Registro do(a) Funcionário(a):  "+F1.getRegistro());
    	System.out.println("Nome     do(a) Funcionário(a):  "+F1.getFuncionario());
    	System.out.println("Idade    do(a) Funcionário(a):  "+F1.getIdade());
    	System.out.println("Cargo    do(a) Funcionário(a):  "+F1.getCargo());
    	System.out.println("Salário  do(a) Funcionário(a):  R$ "+F1.getSalario());
    	
    	System.out.println("_________________________________________________");
    	System.out.println("*************************************************");
    	System.out.println("Registro do(a) Funcionário(a): "+F2.getRegistro());
    	System.out.println("Nome     do(a) Funcionário(a): "+F2.getFuncionario());
    	System.out.println("Idade    do(a) Funcionário(a): "+F2.getIdade());
    	System.out.println("Cargo    do(a) Funcionário(a): "+F2.getCargo());
    	System.out.println("Salário  do(a) Funcionário(a): R$ "+F2.getSalario());
    	System.out.println("_________________________________________________");
    	System.out.println("*************************************************");
	}

}