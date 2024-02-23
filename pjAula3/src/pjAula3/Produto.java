package pjAula3;

/**
 * Exemplo de Utilização de Métodos Construtores
 * @autor Prof. Paulo Barreto
 * @data 22/02/2024
 */
public class Produto {
	//Atributos
	private int codigo;
	private String descricao;
	private float quantidade;
	
	//Método Construtor
	public Produto() {
		System.out.println("Iniciado");
	}
	
	public Produto(int codigo, String descricao, float quantidade) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}

	//Métodos Getters and Setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}	
}