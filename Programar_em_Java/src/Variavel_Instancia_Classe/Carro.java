package Variavel_Instancia_Classe;

public class Carro {
	// Variável de instância
	private String marcaCarro;
	// Variável de classe
	private static String modeloCarro;
	
	
	
	// Métodos Especiais
	
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
	
	// Métodos

	public void mostrarMarca() {
		System.out.printf("Fabricante do carro é %s\n",getMarcaCarro());
	}
	
	public void mostrarModelo() {
		System.out.printf("Modelo do carro é %s\n" ,getModeloCarro());
	}
	
	
}
