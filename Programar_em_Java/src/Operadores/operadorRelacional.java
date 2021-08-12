package Operadores;

public class operadorRelacional {
	
	/*Operador relacional
	 * 
	 * Ele traça a relação e a comparação entre dois elementos, trazendo como retorno uma valor lógico (TRUE OR FALSE)
	 * 
	 * 
	 * OPERADOR									SIGNIFICADO
	 * 
	 * 	  >											Maior que
	 *    <											Menor que
	 *    >=										Maior ou igual
	 *    <=										Menor ou igual
	 *    ==										Igual a
	 *    !=										Diferente
	 * */
	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		System.out.printf("Se X é igual a 10? %b\n", x==10);
		System.out.printf("Se X é diferente de 10? %b\n", x!=10);
		System.out.printf("Se X é maior que Y?, %b\n", x>y);
		System.out.printf("Se X é maior ou igual a 10? %b\n", x>=10);
		System.out.printf("Se X é menor do que 10? %b\n", x<10);
		System.out.printf("Se X é menor ou igual a 10? %b", x<=10);
		
	}

}
