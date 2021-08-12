package Variavel_Instancia_Classe;

public class Futebol {
	
	/*Variável de Instância
	 * 
	 * É a variável que está relacionada ao objeto que foi instanciado
	 * Essa variável é única para cada objeto
	 * As variáveis de instância é declada fora do corpo do construtor ou método
	 * Essas variáveis são membros da classe
	 * Na orientação a objeto, as váriáveis de instância são os que permitem o objeto ter estados, 
	 * "valores atuais presente no objeto criado"*/
	
	/*Variáveis de classe
	 * 
	 * É uma varivel ou atributo que pertence a classe e não aos objetos intanciados
	 * O valor armazenado em uma variável de classe, ele será o mesmo para todos os objetos
	 * Para criar uma variável de classe usamos a palavra reservada "Static";
	 * Ex. private static String nomeSelecao;
	 * 
	 * É variável que pertence a todas as instâncias da classe
	 * se existir 10 objetos dentro da classe, essa variável pertence a todos os objetos*/
	
	// Variável de Instância
	private String nomeTime;
	
	// Variável de Classe
	private static String nomeSelecao;
	
	
	public String getNomeTime() {
		return nomeTime;
	}
	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	public static String getNomeSelecao() {
		return nomeSelecao;
	}
	public static void setNomeSelecao(String nomeSelecao) {
		Futebol.nomeSelecao = nomeSelecao;
	}
	
	//Método
	public void mostrarTime() {
		System.out.printf("Seu time do coração é %s\n", getNomeTime());
	}
	public void mostrarSelecao() {
		System.out.printf("Sua selecao é %s\n", getNomeSelecao());
	}
}
