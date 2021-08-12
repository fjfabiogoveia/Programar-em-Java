package Variavel_Local_Global;

public class Variaveis {
	
	/*Variável Global, são variáveis que são acessíveis a toda classe;
	 *  
	 *Elas são declaradas fora do bloco de código e são acessíveis em qualquer parte do código
	 *Ela existe em toda a execução do código.*/
	
	/*Variável global*/
	static int maiorIdadeGlobal = 35;
	

	/*Main é um método auto executável em java*/
	
	public static void main(String[] args) {
		
	/*Variável local, são variáveis que pertence somente a esse método
	 * Essas variáveis são declaradas dentro do corpo do código
	 *Elas estão limitadas apenas ao escopo do código, no abrir e fechar da chave {} 
	 * A variável existe somente quando for executado
	 */
		
	/*Variável local*/
		int maiorIdade = 18;
		
		metodo2();/*Para imprimir a variável global, o metodo deve ser chamado dentro do main; 
					tudo que fomos chama deve está no main.*/
		System.out.println("A outra forma de imprimir a maior idade global, dentro do local, A maior idade global é " + maiorIdadeGlobal);
	}
	
	public static void metodo2() {
	/*Se eu dê um ctrl + espaço, apenas a variável global será chamada
	 * Para chamar a variável global, a variável global pra ser chamada deve ser static*/	
	System.out.println("A variável global é: " + maiorIdadeGlobal);	
	/*A variável local que é a maior idade não consigo imprimir*/
	
	}

	
}
