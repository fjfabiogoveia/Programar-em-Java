package Operadores;

public class operadorAtribuicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*OPERADORES
		 * 
		 * Operadores s�o s�mbolos especiais que permitem realizar opera��es em valores ou vari�veis
		 * 
		 * H� DIVERSAS CADEGORIAS DE OPERADORES PARA REALIZAR A MAIS DIVERSAS OPERA��ES
		 * 
		 * ATRIBUI��O
		 * 
		 * Operador											Significado
		 * 
		 * =												Atribu��o Simples
		 * +=													X = X+Y
		 * -=													X = X-Y
		 * *=													X = X*Y
		 //) /=													X = X/Y
		 * %=													X = X%Y								
		 * */
		
		int n1 = 2;	int calculo1;
		int n2 = 4; int calculo2;
		int n3 = 6; int calculo3;
		int n4 = 8; int calculo4;
		int n5 = 10;int calculo5;
		int n6 = 12;int calculo6;
		
		calculo1 = n1+=n2;
		calculo2 = n3-=n2;
		calculo3 = n4*=n2;
		calculo4 = n4/=n4;
		calculo5 = n4%=n1;
		System.out.println("Valor do c�lculo: " + calculo1 + ";");
		System.out.println("Valor do c�lculo: " + calculo2 + ";");
		System.out.println("Valor do c�lculo: " + calculo3 + ";");
		System.out.println("Valor do c�lculo: " + calculo4 + ";");
		System.out.println("Valor do c�lculo: " + calculo5 + ";");
		
		
		

	}

}
