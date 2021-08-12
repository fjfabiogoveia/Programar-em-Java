package Variavel_Local_Global;

public class Ex01 {
	
	// Variável global;
	static String meuTelefone = "(81)-99898-8588";
	
	public static void main(String[] args) {
	
	// Variável local
		String estado = "Pernambuco";
		
	// Só é possível chamar a variável global dentro do main
		System.out.println("O meu telefone é: " + meuTelefone);	
		
	// colocar o metodoChamar dentro main
		metodoChamar();
	}
	
	public static void metodoChamar() {
		System.out.println("Chamar a variável? " + meuTelefone + " > essa é a global");
		//System.out.println(estado) ---- Não consigo chamar o variável local dentro de um método que chama variável global;
	}
	
	
}
