package Variavel_Local_Global;

public class Ex01 {
	
	// Vari�vel global;
	static String meuTelefone = "(81)-99898-8588";
	
	public static void main(String[] args) {
	
	// Vari�vel local
		String estado = "Pernambuco";
		
	// S� � poss�vel chamar a vari�vel global dentro do main
		System.out.println("O meu telefone �: " + meuTelefone);	
		
	// colocar o metodoChamar dentro main
		metodoChamar();
	}
	
	public static void metodoChamar() {
		System.out.println("Chamar a vari�vel? " + meuTelefone + " > essa � a global");
		//System.out.println(estado) ---- N�o consigo chamar o vari�vel local dentro de um m�todo que chama vari�vel global;
	}
	
	
}
