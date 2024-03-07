import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//Exemplo de utilização do Gerenciador de layouts
//GridLayout - ele divide a área em forma de matriz

public class GridLayoutDemo extends JFrame
				implements ActionListener{
	
	JButton botoes[];
	String nomes[] = {"um", "dois","três", "quatro", "cinco",
			"seis"};
	boolean alternar = true;
	Container container;
	GridLayout grid1, grid2;
	
	public GridLayoutDemo(){
		super("Exemplo GridLayoutDemo");
		setSize(300,150);
		grid1 = new GridLayout(2,3,5,5); //2 por 3 largura 5
		grid2 = new GridLayout(3,2,5,5); //3 por 2 largura 5
		
		container = getContentPane();
		container.setLayout(grid1);
		
		botoes = new JButton[nomes.length];
		for(int count=0; count < nomes.length; count++){
			botoes[count] = new JButton(nomes[count]);
			botoes[count].addActionListener(this);
			container.add(botoes[count]);		
		}
		setVisible(true);
	}
	
	//Tratador de ações
	public void actionPerformed(ActionEvent evento){
		if (alternar)
			container.setLayout(grid2);
		else
			container.setLayout(grid1);
		
		alternar = !alternar;
		
		//Realiza realinhamento de todos os componentes
		container.validate();
	}
	public static void main(String args[]){
		GridLayoutDemo teste = new GridLayoutDemo();
		teste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
