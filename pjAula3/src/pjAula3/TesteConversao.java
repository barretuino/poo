package pjAula3;

import javax.swing.JOptionPane;

public class TesteConversao {
	public static void main(String[] args) {
		int quantidade;
		
		quantidade = Integer.parseInt(
				JOptionPane.showInputDialog(
				"Informe a quantidade"));
		
		float valorPago = quantidade * 10;
		
		JOptionPane.showMessageDialog(null, valorPago);
	}
}
