package Operadores;

public class operadorCondicionalTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*É o operador utilizado par avaliar expressões booleans, para descidir qual o valor deve ser atribuida a variável
		 * 
		 * 
		 * Operador 							Significado
		 * 
		 * 	  ?:								  Operador ternário
		 * 
		 * 
		 * Sintaxe:
		 * 
		 * variável x = (expressão)? valor se verdadeiro: valor se falso*/
		
		/*O ideal se for mais de um condicional é utilizar o condicional If/Else*/
		
		/*int a;
		String b;
		a = 12;
		b = ( a==5 )? "a é igual a 5": "a é diferente de 5";
		System.out.println("Resultado: " +b);
		
		b = ( a==12 )? "a é igual a 12": "a é diferente de 12";
		System.out.println("Resultado: " +b);*/
		
		int a;
		String b;
		a = 14;
		b = (a > 14)? "Atrasado": (a < 14)? "Adiantado" : "no horário";
		System.out.println("Resultado: " +b);
		
	}

}
