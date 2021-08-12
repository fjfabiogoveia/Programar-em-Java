package Variavel_Local_Global;

public class Variaveis {
	
	/*Vari�vel Global, s�o vari�veis que s�o acess�veis a toda classe;
	 *  
	 *Elas s�o declaradas fora do bloco de c�digo e s�o acess�veis em qualquer parte do c�digo
	 *Ela existe em toda a execu��o do c�digo.*/
	
	/*Vari�vel global*/
	static int maiorIdadeGlobal = 35;
	

	/*Main � um m�todo auto execut�vel em java*/
	
	public static void main(String[] args) {
		
	/*Vari�vel local, s�o vari�veis que pertence somente a esse m�todo
	 * Essas vari�veis s�o declaradas dentro do corpo do c�digo
	 *Elas est�o limitadas apenas ao escopo do c�digo, no abrir e fechar da chave {} 
	 * A vari�vel existe somente quando for executado
	 */
		
	/*Vari�vel local*/
		int maiorIdade = 18;
		
		metodo2();/*Para imprimir a vari�vel global, o metodo deve ser chamado dentro do main; 
					tudo que fomos chama deve est� no main.*/
		System.out.println("A outra forma de imprimir a maior idade global, dentro do local, A maior idade global � " + maiorIdadeGlobal);
	}
	
	public static void metodo2() {
	/*Se eu d� um ctrl + espa�o, apenas a vari�vel global ser� chamada
	 * Para chamar a vari�vel global, a vari�vel global pra ser chamada deve ser static*/	
	System.out.println("A vari�vel global �: " + maiorIdadeGlobal);	
	/*A vari�vel local que � a maior idade n�o consigo imprimir*/
	
	}

	
}
