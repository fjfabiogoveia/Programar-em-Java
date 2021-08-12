package Variavel_Instancia_Classe;

import java.util.Scanner;

public class AppCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String marca;
		String modelo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual a marca do seu carro");
		
		marca = leia.next();
		
		System.out.println("Qual a modelo do seu carro");
		
		modelo = leia.next();
		
		Carro carro = new Carro();
		
		carro.setMarcaCarro(marca);
		carro.setModeloCarro(modelo);
		carro.mostrarMarca();
		carro.mostrarModelo();
		
		Carro carro2 = new Carro();
		
		carro2.mostrarMarca();
		carro2.mostrarModelo();
		
	}

}
