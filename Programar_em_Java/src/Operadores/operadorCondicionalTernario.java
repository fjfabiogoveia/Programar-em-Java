package Operadores;

public class operadorCondicionalTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*� o operador utilizado par avaliar express�es booleans, para descidir qual o valor deve ser atribuida a vari�vel
		 * 
		 * 
		 * Operador 							Significado
		 * 
		 * 	  ?:								  Operador tern�rio
		 * 
		 * 
		 * Sintaxe:
		 * 
		 * vari�vel x = (express�o)? valor se verdadeiro: valor se falso*/
		
		/*O ideal se for mais de um condicional � utilizar o condicional If/Else*/
		
		/*int a;
		String b;
		a = 12;
		b = ( a==5 )? "a � igual a 5": "a � diferente de 5";
		System.out.println("Resultado: " +b);
		
		b = ( a==12 )? "a � igual a 12": "a � diferente de 12";
		System.out.println("Resultado: " +b);*/
		
		int a;
		String b;
		a = 14;
		b = (a > 14)? "Atrasado": (a < 14)? "Adiantado" : "no hor�rio";
		System.out.println("Resultado: " +b);
		
	}

}
