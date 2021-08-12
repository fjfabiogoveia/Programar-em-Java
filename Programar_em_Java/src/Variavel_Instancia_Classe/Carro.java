package Variavel_Instancia_Classe;

public class Carro {
	// Vari�vel de inst�ncia
	private String marcaCarro;
	// Vari�vel de classe
	private static String modeloCarro;
	
	
	
	// M�todos Especiais
	
	public String getMarcaCarro() {
		return marcaCarro;
	}

	public void setMarcaCarro(String marcaCarro) {
		this.marcaCarro = marcaCarro;
	}

	public static String getModeloCarro() {
		return modeloCarro;
	}

	public static void setModeloCarro(String modeloCarro) {
		Carro.modeloCarro = modeloCarro;
	}
	
	// M�todos

	public void mostrarMarca() {
		System.out.printf("Fabricante do carro � %s\n",getMarcaCarro());
	}
	
	public void mostrarModelo() {
		System.out.printf("Modelo do carro � %s\n" ,getModeloCarro());
	}
	
	
}
