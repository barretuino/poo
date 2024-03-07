import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Demonstra��o do Gerenciador de Layouts BorderLayout

public class BorderLayoutDemo extends JFrame
			implements ActionListener{
	JButton botoes[];//arrays para guardar os bot�es
	String nomes[] = {"Oculta North", "Oculta South",
		  "Oculta East", "Oculta West", "Oculta Center"};
	BorderLayout layout;
	
	public BorderLayoutDemo(){
		super("Exemplo BorderLayout");
		setSize(350,200);
		layout = new BorderLayout(5,5);
		
		Container container = getContentPane();
		container.setLayout(layout);
		
		botoes = new JButton[nomes.length];
		for (int count=0; count< nomes.length; count++){
			botoes[count] = new JButton(nomes[count]);
			botoes[count].addActionListener(this);			
		}
		container.add(botoes[0], BorderLayout.NORTH);
		container.add(botoes[1], BorderLayout.SOUTH);
		container.add(botoes[2], BorderLayout.EAST);
		container.add(botoes[3], BorderLayout.WEST);
		container.add(botoes[4], BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	//Tratamento de a��es do formul�rio
	public void actionPerformed(ActionEvent evento){
		for(int count=0; count < botoes.length; count++){
			if (evento.getSource()== botoes[count]){
				JOptionPane.showMessageDialog(null,
						"O Bot�o '" + nomes[count]
						 + "' foi selecionado");
				botoes[count].setVisible(false);
			}else
				botoes[count].setVisible(true);
		}
		//Atualiza container principal
		layout.layoutContainer(getContentPane());
	}
	
	public static void main(String args[]){
		BorderLayoutDemo teste = new BorderLayoutDemo();
		teste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
