package pjAula1;
/**
 * @autor Paulo Barreto
 * @data 06/02/2024
 * Classe de Modelagem conceitual de Produto
 */
class Produto {

	//Atributos
	int codigo;
	String descricao;
	float quantidade;
	
	//Métodos
	void incluir(int id, String nome, float valor) {
		codigo = id;
		descricao = nome;
		quantidade = valor;
	}
	
	void excluir() {
		//....
	}
	
	public static void main(String[] args) {
		System.out.println("Olá mundo");
	}
}
