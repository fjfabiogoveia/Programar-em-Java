package Operadores;

public class operadorAritmetico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*OPERADORES ARITMÉTICOS
		 * São operadores utilizados para realizar operações aritméticas
		 * 
		 * 
		 * 
		 * 			OPERADOR							SIGNIFICADO
		 * 
		 * 				+									Soma
		 * 				-									Subtração
		 * 				*									Multiplicação
		 * 				/									Divisão comum - retorna a ponto flutuante(Dependeo do tipo de dado do operando)
		 * 				/ 									Divisão inteira - retorna inteiro
		 * 				%									Módulo*/
		
		int x = 9;
		int y = 2;
		System.out.printf("Calculo de x + y: %d\n", x+y);
		System.out.printf("Calculo de x - y: %d\n", x-y);
		System.out.printf("Calculo de x * y: %d\n", x*y);
		System.out.printf("Calculo de x / y: %d\n", x / y); //%d só pegou o resultado inteiro
		System.out.printf("Calculo de x / y: %2.2f\n", x /(double) y);
		System.out.printf("Calculo de x %% y: %d\n", x % y);

	}

}
