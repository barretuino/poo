package br.unisal.core;

public abstract class UnisalCRUD {
	//Métodos abstratos
	public abstract void insere(Object obj);
	public abstract Object pesquisa(int id);
	public abstract void atualiza(Object obj);
	public abstract boolean remove(int id);
	
	public String toString() {
		return "Tipo " + this.getClass().getName()
				+ " HashCode " + this.hashCode();
	}
}
