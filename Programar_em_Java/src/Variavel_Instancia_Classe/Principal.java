package Variavel_Instancia_Classe;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String time;
		String selecao;
		
		Scanner leia = new Scanner(System.in);
		
		Futebol torcida = new Futebol();
		
		System.out.println("Para qual time você torce?");
		time = leia.next();
		
		System.out.println("Para qual seleção você torce?");
		selecao = leia.next();
		
		torcida.setNomeTime(time);
		torcida.setNomeSelecao(selecao);
		torcida.mostrarTime();
		torcida.mostrarSelecao();
		
		Futebol torcida2 = new Futebol();
		torcida2.mostrarTime();
		torcida2.mostrarSelecao();
		
		torcida2.setNomeSelecao("Italiana");
		torcida2.mostrarSelecao();
		
	}

}
