package Estrutura_Condicional;

public class condicionalFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* La�o For
		 * 
		 * loops (la�os), s�o utilizadas para executar repetidamente uma instru��o ou bloco de instru��o enquanto determinada
		 *  condi��o estiver sendo satisfeita.
		 * � uma estrutura de repeti��o, 
		 * no qual o seu ciclo � executado por um tempo ou condi��o pr�-determinada e em uma quantidade de vezes que � determinada.
		 * */
		
				//Sintaxe
		
		/* 		for(int i = 0; i <= 10; i++){
		 * 		< C�digo a ser executado >
		 * 		}
		 * 				
		 * for (<vari�vel de controle>, <an�lise da vari�vel de controle>, <incremento da vari�vel de controle>) {
    	// C�digo a ser executado
		}
		
		*/
		
		/* 1) A vari�vel de controle, que chamamos de �i�, tem seu valor inicial como 0;
		 * 2) No segundo bloco, onde escrevemos �i <= 10�, estamos dizendo que o conte�do do for ser� executado 
		 * enquanto o valor de i for menor ou igual a 10;
		 * 3) Com o terceiro bloco definido como �i++�, estamos dizendo que, no fim de cada execu��o do for, 
		 * o conte�do de �i� ser� incrementado em 1 unidade. Isso quer dizer que, no fim da primeira execu��o, 
		 * i ir� de 0 para 1; na segunda execu��o, ir� de 1 para 2, e assim por diante;
		 * 4) Com isso, o conte�do do for ser� executado por 11 vezes, j� que o i � iniciado em 0. 
		 * A sa�da do c�digo acima mostra que a mensagem foi escrita por 11 vezes, onde o �i� variou de 0 at� 10.
		 * 
		 * Um ponto importante sobre o for � que, por causa da utiliza��o da vari�vel de controle, 
		 * geralmente ele � utilizado quando sabemos exatamente quantas vezes queremos repetir a execu��o do trecho de c�digo.
		 * */
		
		for(int i = 0; i <= 10; i ++) {
			System.out.println("A vari�vel i agora vale: " + i );
		}

	}

}
