package Operadores;

public class operadorAtribuicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*OPERADORES
		 * 
		 * Operadores são símbolos especiais que permitem realizar operações em valores ou variáveis
		 * 
		 * HÁ DIVERSAS CADEGORIAS DE OPERADORES PARA REALIZAR A MAIS DIVERSAS OPERAÇÕES
		 * 
		 * ATRIBUIÇÃO
		 * 
		 * Operador											Significado
		 * 
		 * =												Atribução Simples
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
		System.out.println("Valor do cálculo: " + calculo1 + ";");
		System.out.println("Valor do cálculo: " + calculo2 + ";");
		System.out.println("Valor do cálculo: " + calculo3 + ";");
		System.out.println("Valor do cálculo: " + calculo4 + ";");
		System.out.println("Valor do cálculo: " + calculo5 + ";");
		
		
		

	}

}
