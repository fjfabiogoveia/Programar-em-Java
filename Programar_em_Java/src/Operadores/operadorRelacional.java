package Operadores;

public class operadorRelacional {
	
	/*Operador relacional
	 * 
	 * Ele tra�a a rela��o e a compara��o entre dois elementos, trazendo como retorno uma valor l�gico (TRUE OR FALSE)
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
		
		System.out.printf("Se X � igual a 10? %b\n", x==10);
		System.out.printf("Se X � diferente de 10? %b\n", x!=10);
		System.out.printf("Se X � maior que Y?, %b\n", x>y);
		System.out.printf("Se X � maior ou igual a 10? %b\n", x>=10);
		System.out.printf("Se X � menor do que 10? %b\n", x<10);
		System.out.printf("Se X � menor ou igual a 10? %b", x<=10);
		
	}

}
