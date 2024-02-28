package pjAula3;

public class Livraria {
	public static void main(String[] args) {
		//Instanciação de um objeto do tipo Obra
		Obra livro = new Obra();
		
		livro.setCodigo(123);
		livro.setTitulo("Java como Programar");
		
		Autor autor = new Autor();
		autor.setCodigo(365);
		autor.setNome("Deitel & Deitel");
		autor.setSituacao(true);
		livro.setAutor(autor);
		
		livro.setPreco(178.40f);
		livro.setSituacao(true);
		
		System.out.println(livro.toString());
		
		Obra outraObra = new Obra(789, "Banco de Dados",
				autor, 76.54f, false);
		
		
	}
}
