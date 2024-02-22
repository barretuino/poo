package br.fam.teste;

import java.util.Scanner;

//CRTL+SHIFT+O
import br.fam.modelagem.Cliente;

public class Agenda {
	public static void main(String[] args) {
		int n = 2;
		Cliente agenda[] = new Cliente[n];
		
		//Entrada de Dados
		for(int i=0; i<n; i++) {
			Cliente cliente = new Cliente();
			Scanner digito = new Scanner(System.in);
			
			System.out.println("Informe o codigo ");
			cliente.setCodigo(digito.nextInt());
			System.out.println("Informe o nome ");
			cliente.setNome(digito.next());
			System.out.println("Informe o telefone");
			cliente.setNumeroTelefone(digito.nextInt());
			System.out.println("Informe o email");
			cliente.setEmail(digito.next());
			
			agenda[i] = cliente;
			digito.close();
		}
		
		//Saída de Dados
		for(int i=0; i<n; i++) {
			System.out.println("Codigo " + agenda[i].getCodigo());
 			System.out.println("Nome " + agenda[i].getNome());
 			System.out.println("Telefone " + agenda[i].getNumeroTelefone());
 			System.out.println("Email " + agenda[i].getEmail());
		}		
	}
}
