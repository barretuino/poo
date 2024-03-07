//Demonstração de como o gerenciador layout FlowLayout
//permite a organização horizontal dos objetos

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlowLayoutDemo extends JFrame 
				implements ActionListener{
	
	public JButton leftBotao, centerBotao, rightBotao;
	public Container container;
	public FlowLayout layout;
	
	public FlowLayoutDemo(){
		super("Exemplo de FlowLayout - Gerenciador");
		setSize(300,75);
		layout = new FlowLayout();
		container = getContentPane();
		container.setLayout(layout);
		
		leftBotao = new JButton("Left");
		leftBotao.addActionListener(this);
		container.add(leftBotao);
		
		centerBotao = new JButton("Center");
		centerBotao.addActionListener(this);
		container.add(centerBotao);
		
		rightBotao = new JButton("Right");
		rightBotao.addActionListener(this);
		container.add(rightBotao);
	
		setVisible(true);
	}
	
	//Tratador de ações
	public void actionPerformed(ActionEvent evento){
		if (evento.getSource() == leftBotao){
			layout.setAlignment(FlowLayout.LEFT);
		}else{
			if (evento.getSource() == centerBotao){
				layout.setAlignment(FlowLayout.CENTER);
			}else{
				layout.setAlignment(FlowLayout.RIGHT);
			}
		}
		//Método de FlowLayout que executa atualização na
		//disposição dos componentes
		layout.layoutContainer(container);
	}
	
	public static void main(String args[]){
		FlowLayoutDemo teste = new FlowLayoutDemo();
		teste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
