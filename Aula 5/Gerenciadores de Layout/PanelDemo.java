//Exemplo de utiliza��o de JPainel
//Gerenciador Gr�fico BorderLayout

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelDemo extends JFrame 
				implements ActionListener{
	//Atributos
	public JLabel lb1, lb2;
	public JTextField txtEntrada;
	public JButton bLimpar, bTransf, bOK;
	public JPanel pTop, pBot, pCanto; 

	//M�todo Construtor
	public PanelDemo(){
		setTitle("Panel Demo - Exemplo de componente JPanel");
		setSize(400,120);
		
		//instancia��o dos componentes
		lb1 = new JLabel("Entrada");
		lb2 = new JLabel("Sa�da");
		txtEntrada = new JTextField(20);
		
		bLimpar = new JButton("Limpar");
		//Adicionando a lista de tratador de a��es do JFrame
		bLimpar.addActionListener(this);
		
		bTransf = new JButton("Transferir");
		//Adicionando a lista de tratador de a��es do JFrame
		bTransf.addActionListener(this);
		
		bOK = new JButton("OK");
		//Adicionando a lista de tratador de a��es do JFrame
		bOK.addActionListener(this);
		
		//Gerenciador FlowLayout(escreve da esquerda para
		//direita, de cima para baixo)
		pTop = new JPanel(new FlowLayout(FlowLayout.LEFT));
		//Modifica cor de preenchimento de fundo para cinza
		//claro
		pTop.setBackground(Color.lightGray);

		//Gerenciador GridLayout(divide a tela como uma
		//matriz de linhas e colunas)
		pBot = new JPanel(new GridLayout(1,3));//1 linha 3 col
		pCanto = new JPanel();
		pCanto.setBackground(Color.gray);
		
		//Adi��o dos componentes aos paineis
		pTop.add(lb1);
		pTop.add(txtEntrada);
		//Gerenciador BorderLayout (divide a tema em 5 regi�es)
		add(pTop, BorderLayout.CENTER);//Painel ao Centro
		
		pCanto.add(lb2);
		add(pCanto, BorderLayout.EAST);
		
		pBot.add(bLimpar);
		pBot.add(bTransf);
		pBot.add(bOK);
		add(pBot, BorderLayout.SOUTH);		
	}
	
	//M�todo tratador de eventos
	public void actionPerformed(ActionEvent evento){
		if(evento.getSource() == bLimpar){
			//limpa caixa de entrada
			txtEntrada.setText("");
			//Requesita o foco da a��o para ele
			txtEntrada.requestFocus();
		}
		if(evento.getSource() == bTransf){
			//determina conte�do de txtEntrada � lb2
			lb2.setText(txtEntrada.getText());
			//Requesita o foco da a��o para ele
			txtEntrada.requestFocus();
			
			//Mudan�a de Fonte
			lb2.setFont(new Font("Serif",Font.ITALIC,38));
			
			txtEntrada.setText("");
		}
		if(evento.getSource() == bOK){
			System.exit(0);
		}			
	}
	
	//M�todo principal - "MAIN"
	public static void main(String arg[]){
	  PanelDemo testeForm = new PanelDemo();
      testeForm.setDefaultCloseOperation
      							(JFrame.EXIT_ON_CLOSE);
      testeForm.setVisible(true);
	}	
}	