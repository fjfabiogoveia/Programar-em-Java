package Operadores;

public class operadorIncrementoDecremento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*OPERADOR DE INCREMENTO E DECREMENTO
		 * 
		 * São operadores especiais que são utilizados para aumentar ou diminuir um valor armazenado em uma variável em uma unidade
		 * 
		 * Ex Incremento n=19, fica no valor de 20
		 * Ex Decremento n=19, fica no valor de 18
		 * 
		 * 
		 * 
		 * 				Operador 										Significado
		 * 
		 * Opós-fixo      x++											x = x+1 (Adiciona 1 ao valor de x, armazena o resultado em x, e retorna ao valor original)
		 * 
		 * 				  x--											x = x-1 (Subtrai 1 do valor  de x, armazena o resultado em x, e retorna o valor original)
		 * 
		 * 
		 * Pré-fixo		  ++x											x = x + 1 (Adiciona 1 ao valor de x, armazena o resultado em x, e retorna o valor incrementado)		
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
		System.out.println("Valor de número após o incremento: " +numero);
		System.out.println("Valor de resultado após o incremento: " +resultado);
		
		numero = 10; resultado = 0;
		
		resultado = ++numero; // Primeiro incremanta, depois atribui
		System.out.println("Valor de número após o incremento: " +numero);
		System.out.println("Valor de resultado após o incremnto: " +resultado);
	}

}
