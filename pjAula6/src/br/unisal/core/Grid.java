package br.unisal.core;

import java.util.List;

public interface Grid {
	List<Object> getDataSource();
	boolean atualiza();
	void limpa();
	
}
