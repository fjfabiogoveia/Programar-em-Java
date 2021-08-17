package Estrutura_Condicional;

public class condicionalFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Laço For
		 * 
		 * loops (laços), são utilizadas para executar repetidamente uma instrução ou bloco de instrução enquanto determinada
		 *  condição estiver sendo satisfeita.
		 * É uma estrutura de repetição, 
		 * no qual o seu ciclo é executado por um tempo ou condição pré-determinada e em uma quantidade de vezes que é determinada.
		 * */
		
				//Sintaxe
		
		/* 		for(int i = 0; i <= 10; i++){
		 * 		< Código a ser executado >
		 * 		}
		 * 				
		 * for (<variável de controle>, <análise da variável de controle>, <incremento da variável de controle>) {
    	// Código a ser executado
		}
		
		*/
		
		/* 1) A variável de controle, que chamamos de “i”, tem seu valor inicial como 0;
		 * 2) No segundo bloco, onde escrevemos “i <= 10”, estamos dizendo que o conteúdo do for será executado 
		 * enquanto o valor de i for menor ou igual a 10;
		 * 3) Com o terceiro bloco definido como “i++”, estamos dizendo que, no fim de cada execução do for, 
		 * o conteúdo de “i” será incrementado em 1 unidade. Isso quer dizer que, no fim da primeira execução, 
		 * i irá de 0 para 1; na segunda execução, irá de 1 para 2, e assim por diante;
		 * 4) Com isso, o conteúdo do for será executado por 11 vezes, já que o i é iniciado em 0. 
		 * A saída do código acima mostra que a mensagem foi escrita por 11 vezes, onde o “i” variou de 0 até 10.
		 * 
		 * Um ponto importante sobre o for é que, por causa da utilização da variável de controle, 
		 * geralmente ele é utilizado quando sabemos exatamente quantas vezes queremos repetir a execução do trecho de código.
		 * */
		
		for(int i = 0; i <= 10; i ++) {
			System.out.println("A variável i agora vale: " + i );
		}

	}

}
