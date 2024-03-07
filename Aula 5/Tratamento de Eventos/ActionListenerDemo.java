//ActionListenerDemo.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class ActionListenerDemo extends JFrame implements ActionListener{
	
	//declaração dos objetos
	private JTextField txtEntrada, txtSaida;
	private Label lbRotulo1,lbRotulo2;
	private Button btLimpar,btFechar;		
	private JPanel pTexto, pBotoes;
	private GridLayout grid;	
		
	//construtor
	public ActionListenerDemo (){

		super("ActionListenerDemo - Tratamento de Eventos");		
		getContentPane().setLocation(400,400);
		getContentPane().setLayout(new BorderLayout(5,5));
		
		grid = new GridLayout(1,2,5,5);
		
		txtEntrada = new JTextField (25);
		txtSaida = new JTextField(25);
		lbRotulo1 = new Label("Texto de Entrada");
		lbRotulo2 = new Label("Texto de Saida");
		btLimpar = new Button ("Limpar");
		btFechar = new Button ("Fechar");		
		pTexto = new JPanel();
		pBotoes = new JPanel();
		
		pTexto.add(lbRotulo1);
		pTexto.add(txtEntrada);
		pTexto.add(lbRotulo2);								
		pTexto.add(txtSaida);
		
		txtEntrada.addActionListener(this);
		
		btLimpar.addActionListener(this);					
		btFechar.addActionListener(this);
		
		pBotoes.add(btLimpar);
		pBotoes.add(btFechar);
		
		//definição do cursor quando o mesmo estiver sobre o painel pBotoes
		pBotoes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		pBotoes.setLayout(grid);
				
		getContentPane().add(pTexto,BorderLayout.CENTER);
		getContentPane().add(pBotoes,BorderLayout.SOUTH);
					
		setVisible(true);		
	}
	
	//tratador de eventos
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==btFechar) //pressionado btFechar
			System.exit(0);
		else{		
			if (e.getSource()==btLimpar){ //pressionado btLimpar
				txtEntrada.setText("");
				txtSaida.setText("");				
				//comando para dar foco ao objeto
				txtEntrada.requestFocus();
				
			}else if (e.getSource()==txtEntrada){ //pressionado Enter no campo
				txtSaida.setText(txtEntrada.getText());
				txtEntrada.setText("");
			}
		}
	}
	
	//main
	public static void main (String args []){
		ActionListenerDemo f = new ActionListenerDemo ();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize (400,200);
		//comando para após dar reload no layout
		f.validate();
	}
}