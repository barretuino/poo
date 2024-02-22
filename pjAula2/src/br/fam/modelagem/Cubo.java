package br.fam.modelagem;

/**
 * Classe de Modelagem Conceitual de um cubo
 * @author Prof Paulo Barreto
 * @data 15/02/2024
 */
public class Cubo {
	//Atributos
	int medida;
	String cor;
	float peso;
	
	//Métodos
	public Cubo(int medida, String cor, float peso) {
		this.medida = medida;
		this.cor = cor;
		this.peso = peso;
	}
	
	public float calcularArea() {
		return (medida * medida * medida);
	}
}