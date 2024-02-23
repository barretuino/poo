package pjAula3;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameDemo extends JFrame{	
	//1. Passo - Declarar o Objeto
	JButton btCadastrar, btLimpar;
	JTextField txtNome, txtEmail;
	JLabel lbNome, lbEmail;
	
	public FrameDemo() {
		super("Exemplo de formulário");
		setSize(280, 280);
		setLayout(new FlowLayout());
		
		//2. Instaciar o Objeto e Inicializar
		btCadastrar = new JButton("Cadastrar");
		btLimpar = new JButton("Limpar");
		txtNome = new JTextField("Digite...", 20);
		txtEmail = new JTextField(20);
		lbNome = new JLabel("Nome");
		lbEmail = new JLabel("Email");
		
		//3. Adicionar a tela
		add(lbNome);
		add(txtNome);
		add(lbEmail);
		add(txtEmail);
		add(btCadastrar);
		add(btLimpar);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		FrameDemo frm = new FrameDemo();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
