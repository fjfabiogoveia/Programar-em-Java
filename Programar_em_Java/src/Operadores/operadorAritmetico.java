package Operadores;

public class operadorAritmetico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*OPERADORES ARITM�TICOS
		 * S�o operadores utilizados para realizar opera��es aritm�ticas
		 * 
		 * 
		 * 
		 * 			OPERADOR							SIGNIFICADO
		 * 
		 * 				+									Soma
		 * 				-									Subtra��o
		 * 				*									Multiplica��o
		 * 				/									Divis�o comum - retorna a ponto flutuante(Dependeo do tipo de dado do operando)
		 * 				/ 									Divis�o inteira - retorna inteiro
		 * 				%									M�dulo*/
		
		int x = 9;
		int y = 2;
		System.out.printf("Calculo de x + y: %d\n", x+y);
		System.out.printf("Calculo de x - y: %d\n", x-y);
		System.out.printf("Calculo de x * y: %d\n", x*y);
		System.out.printf("Calculo de x / y: %d\n", x / y); //%d s� pegou o resultado inteiro
		System.out.printf("Calculo de x / y: %2.2f\n", x /(double) y);
		System.out.printf("Calculo de x %% y: %d\n", x % y);

	}

}
