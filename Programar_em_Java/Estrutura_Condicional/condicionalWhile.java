package Estrutura_Condicional;

public class condicionalWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*La�o While
		 * 
		 * Utilizamos esse tipo de estrutura quando n�o sabemos a quantidade de vezes que repetir� o c�digo
		 * � utilizada essa declara��o para executar um c�digo repetidamente enquanto retornar um valor l�gico verdadeiro
		 * Caso retorne um valor l�gico falso o loop � encerrado.
		 * 
		 * 
		 * SINTAXE
		 * 
		 * while(condicao){
		 * < Bloco de comando >
		 * < Instru��o a executar >
		 * }*/
		
		int contador = 0;
		
		while(contador <= 50) {
			System.out.println(contador);
			contador ++;
		}

	}

}
