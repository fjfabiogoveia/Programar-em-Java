package Estrutura_Condicional;

public class condicionalWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Laço While
		 * 
		 * Utilizamos esse tipo de estrutura quando não sabemos a quantidade de vezes que repetirá o código
		 * É utilizada essa declaração para executar um código repetidamente enquanto retornar um valor lógico verdadeiro
		 * Caso retorne um valor lógico falso o loop é encerrado.
		 * 
		 * 
		 * SINTAXE
		 * 
		 * while(condicao){
		 * < Bloco de comando >
		 * < Instrução a executar >
		 * }*/
		
		int contador = 0;
		
		while(contador <= 50) {
			System.out.println(contador);
			contador ++;
		}

	}

}
