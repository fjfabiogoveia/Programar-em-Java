package Variavel_Instancia_Classe;

public class Futebol {
	
	/*Vari�vel de Inst�ncia
	 * 
	 * � a vari�vel que est� relacionada ao objeto que foi instanciado
	 * Essa vari�vel � �nica para cada objeto
	 * As vari�veis de inst�ncia � declada fora do corpo do construtor ou m�todo
	 * Essas vari�veis s�o membros da classe
	 * Na orienta��o a objeto, as v�ri�veis de inst�ncia s�o os que permitem o objeto ter estados, 
	 * "valores atuais presente no objeto criado"*/
	
	/*Vari�veis de classe
	 * 
	 * � uma varivel ou atributo que pertence a classe e n�o aos objetos intanciados
	 * O valor armazenado em uma vari�vel de classe, ele ser� o mesmo para todos os objetos
	 * Para criar uma vari�vel de classe usamos a palavra reservada "Static";
	 * Ex. private static String nomeSelecao;
	 * 
	 * � vari�vel que pertence a todas as inst�ncias da classe
	 * se existir 10 objetos dentro da classe, essa vari�vel pertence a todos os objetos*/
	
	// Vari�vel de Inst�ncia
	private String nomeTime;
	
	// Vari�vel de Classe
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
	
	//M�todo
	public void mostrarTime() {
		System.out.printf("Seu time do cora��o � %s\n", getNomeTime());
	}
	public void mostrarSelecao() {
		System.out.printf("Sua selecao � %s\n", getNomeSelecao());
	}
}
