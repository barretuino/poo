package br.fam.modelagem;

/**
 * Classe de Modelagem Conceitual de Cliente
 * @autor Prof Paulo Barreto
 * @data 15/02/2024
 */
public class Cliente {
	//Atributos
	private int codigo;
	private String nome;
	private int numeroTelefone;
	private String email;
	
	//Métodos
	public void inserir(int codigo, String nome, 
				int numeroTelefone, String email) {
		this.codigo = codigo;
		this.nome = nome;
		this.numeroTelefone = numeroTelefone;
		this.email = email;
	}
	
	public void alterar(int codigo, String nome, 
			int numeroTelefone, String email) {
		this.codigo = codigo;
		this.nome = nome;
		this.numeroTelefone = numeroTelefone;
		this.email = email;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		if(codigo > 0) {
			this.codigo = codigo;
		}else {
			System.err.println("Código Inválido!");
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(int numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
	
}