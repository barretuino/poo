package pjAula3;

import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) {
		//A palavra reservado new é reponsável
		//por invocar o método construtor
		/*Produto produto = new Produto();
		
		System.out.print("Código " + produto.getCodigo());
		System.out.print(" Descrição " + produto.getDescricao());
		System.out.println(" Quantidade " + produto.getQuantidade());
		
		produto.setCodigo(123);
		produto.setDescricao("Lápis de Cor");
		produto.setQuantidade(1_000_000.5f);
		
		System.out.print("Código " + produto.getCodigo());
		System.out.print(" Descrição " + produto.getDescricao());
		System.out.println(" Quantidade " + produto.getQuantidade());
		
		Pai voce = new Filho("Paulo", 187, "Palmeiras");		
		System.out.println(((Filho)voce).getTime());
		
		String numero = "123a" + 1;
		int outroNumero = Integer.parseInt(numero);
		*/
		
		System.out.println("Texto Impresso em Console");
		JOptionPane.showMessageDialog(null, "Esta é uma mensagem de Texto Simples");
		
	}
}