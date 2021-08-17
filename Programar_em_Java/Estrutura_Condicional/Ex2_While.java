package Estrutura_Condicional;

import java.util.Scanner;

public class Ex2_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Por favor entre com o seu nome ou s para sair");
		nome = leia.nextLine();
		
		while(!nome.equals("s")) {
			System.out.printf("Bem vindo! %s\n", nome);
			System.out.println("Digite seu nome ou s para sair");
			nome = leia.nextLine();
		}
		System.out.println("Fim da execução");

	}

}
