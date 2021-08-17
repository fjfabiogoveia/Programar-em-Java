package Estrutura_Condicional;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * < ESTRUTURA CONDICIONAL >
		 * 
		 * Esse tipo de estrutura possibilita o pr�prio programa a tomar decis�es e altera o seu fluxo de exece��o.
		 * Essa estrutura possibita ao programador o poder de controlar quais s�o as tarefas e trechos de c�digos que ser�o executados
		 * 
		 * */
		
		/* < CONDICIONAL If/Else >
		 * 
		 * � uma estrutura de teste l�gico que retorna a um dos valores: Verdadeiro ou Falso;
		 * � Um teste condicional que ir� apresentar um resultado de acordo com as condi��es mencionadas
		 * 
		 * */
		
		/* Podemos utilizar no condicional os operadores relacionais
		 * > ou <
		 * >= ou <=
		 * == igual �
		 * != diferente de
		 * */
		
		/* If/Else Simples
		 * 
		 * Sintaxe
		 * 
		 * if(a condi��o) {
		 *  < O bloco de comando se for verdadeiro >
		 * }
		 * else{
		 *  < O bloco de comando se for falso >
		 * }*/
		
		/* If/Else encadeado
		 * 
		 * � quando temos um if na sequ�ncia de um outro if.
		 * 
		 * Sintaxe
		 * 
		 * if(a condi��o 1){
		 * < O bloco 1, se for verdadeiro >
		 * }
		 * else if(condi��o 2){
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
		System.out.println("O valor total dos Livros �: " + totalLivros);
		
		if(livroLinux == 10) {
			System.out.println("O livro de linux est� de quase de gra�a!\n");
		}
		if(totalLivros <= 120) {
			System.out.println("O pre�o est� bom!");
		}
		else {
			System.out.println("Os livros est�o muito caros!");
		}
		
		if(livroLinux < livroJava) {
			System.out.println("O livro de linux est� mais barato!");
		}
		else if(livroLinux > livroJava) {
			System.out.println("Livro de java est� mais barato!");
		}
		else {
			System.out.println("Os livros est�o com os mesmos pre�os!");
		}
	}

}
