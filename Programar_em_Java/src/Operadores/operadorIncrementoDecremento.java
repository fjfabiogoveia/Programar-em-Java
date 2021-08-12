package Operadores;

public class operadorIncrementoDecremento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*OPERADOR DE INCREMENTO E DECREMENTO
		 * 
		 * S�o operadores especiais que s�o utilizados para aumentar ou diminuir um valor armazenado em uma vari�vel em uma unidade
		 * 
		 * Ex Incremento n=19, fica no valor de 20
		 * Ex Decremento n=19, fica no valor de 18
		 * 
		 * 
		 * 
		 * 				Operador 										Significado
		 * 
		 * Op�s-fixo      x++											x = x+1 (Adiciona 1 ao valor de x, armazena o resultado em x, e retorna ao valor original)
		 * 
		 * 				  x--											x = x-1 (Subtrai 1 do valor  de x, armazena o resultado em x, e retorna o valor original)
		 * 
		 * 
		 * Pr�-fixo		  ++x											x = x + 1 (Adiciona 1 ao valor de x, armazena o resultado em x, e retorna o valor incrementado)		
		 * 
		 * 
		 * 
		 * 			      --+											x = x-1 (Subtrai 1 do valor  de x, armazena o resultado em x, e retorna o valor decrementado)						
		 * 
		 * 
		 * */

		int numero = 10;
		int resultado = 0;
		
		System.out.println("Mostrar o valor original: " +resultado);
		
		resultado = numero++; // Primeiro atribui, depois incrementa
		System.out.println("Valor de n�mero ap�s o incremento: " +numero);
		System.out.println("Valor de resultado ap�s o incremento: " +resultado);
		
		numero = 10; resultado = 0;
		
		resultado = ++numero; // Primeiro incremanta, depois atribui
		System.out.println("Valor de n�mero ap�s o incremento: " +numero);
		System.out.println("Valor de resultado ap�s o incremnto: " +resultado);
	}

}
