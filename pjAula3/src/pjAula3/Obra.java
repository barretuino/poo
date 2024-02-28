package pjAula3;

/**
 * Classe de Modelagem Conceitual para Obras
 * @autor Prof. Paulo Barreto
 * @data 27/02/2024
 */
public class Obra {
	//Atributos
	private int codigo;
	private String titulo;
	private Autor autor;
	private float preco;
	private boolean situacao;
	
	//Método Construtor
	public Obra() {
		//Será executado no instante que o objeto
		//for criado
		System.out.println("Objeto foi instanciado");
	}
	
		
	public Obra(int codigo, String titulo, 
			Autor autor, float preco, boolean situacao) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
		this.situacao = situacao;
	}



	@Override
	public String toString() {
		return "Codigo " + getCodigo() 
			+ " Autor " + getAutor().getNome();
	}
	
	//Métodos
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	
	
}
