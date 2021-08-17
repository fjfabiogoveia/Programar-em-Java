package Estrutura_Condicional;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * < ESTRUTURA CONDICIONAL >
		 * 
		 * Esse tipo de estrutura possibilita o próprio programa a tomar decisões e altera o seu fluxo de execeção.
		 * Essa estrutura possibita ao programador o poder de controlar quais são as tarefas e trechos de códigos que serão executados
		 * 
		 * */
		
		/* < CONDICIONAL If/Else >
		 * 
		 * É uma estrutura de teste lógico que retorna a um dos valores: Verdadeiro ou Falso;
		 * É Um teste condicional que irá apresentar um resultado de acordo com as condições mencionadas
		 * 
		 * */
		
		/* Podemos utilizar no condicional os operadores relacionais
		 * > ou <
		 * >= ou <=
		 * == igual à
		 * != diferente de
		 * */
		
		/* If/Else Simples
		 * 
		 * Sintaxe
		 * 
		 * if(a condição) {
		 *  < O bloco de comando se for verdadeiro >
		 * }
		 * else{
		 *  < O bloco de comando se for falso >
		 * }*/
		
		/* If/Else encadeado
		 * 
		 * É quando temos um if na sequência de um outro if.
		 * 
		 * Sintaxe
		 * 
		 * if(a condição 1){
		 * < O bloco 1, se for verdadeiro >
		 * }
		 * else if(condição 2){
		 * < O bloco 2, se for verdadeiro >
		 * }
		 * else{
		 * < O bloco de comando se for falso >
		 * }
		 * */
		
		Scanner leia = new Scanner(System.in);
		
		float livroLinux = 0;
		float livroJava = 0;
		float totalLivros;
		
	
		
		System.out.println("Por favor informe o valor do livro de Linux?");
		livroLinux = leia.nextFloat();
		System.out.println("Por favor informe o valor do livro do Java");
		livroJava = leia.nextFloat();
		
		totalLivros = (livroLinux + livroJava);
		System.out.println("O valor total dos Livros é: " + totalLivros);
		
		if(livroLinux == 10) {
			System.out.println("O livro de linux está de quase de graça!\n");
		}
		if(totalLivros <= 120) {
			System.out.println("O preço está bom!");
		}
		else {
			System.out.println("Os livros estão muito caros!");
		}
		
		if(livroLinux < livroJava) {
			System.out.println("O livro de linux está mais barato!");
		}
		else if(livroLinux > livroJava) {
			System.out.println("Livro de java está mais barato!");
		}
		else {
			System.out.println("Os livros estão com os mesmos preços!");
		}
	}

}
