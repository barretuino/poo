package br.fam.teste;

import br.fam.modelagem.Cliente;

public class Teste {
	public static void main(String[] args) {
		/*Cubo objeto = new Cubo(10, "Azul", 22f);
		
		float areaCubo = objeto.calcularArea();
		System.out.println("A Área do cubo é " + areaCubo);
		
		System.out.println((5 + 4 + 72) % 7);
		
		for(int i=51; i<=176; i++) {
			System.out.println(i);
		}*/
		Cliente voce = new Cliente();
		
		voce.setCodigo(123);
		System.out.println(voce.getCodigo());
		
		
		
		
	}
}
