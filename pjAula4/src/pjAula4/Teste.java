package pjAula4;

public class Teste {
	public static void main(String[] args) {
		/*Sobrecarga teste = new Sobrecarga();
		
		System.out.println(teste.duplo(17));
		System.out.println(teste.duplo("17"));
		System.out.println(teste.duplo(1.99f));
		System.out.println(teste.elevar(4));
		System.out.println(teste.elevar(4, 2));
		System.out.println(teste.elevar(4, "2"));
		System.out.println(teste.elevar("4", 2));*/
		
		Calculadora calc = new Calculadora();
		double resultado = calc.calcular(10, 10, new Soma());
		System.out.println("Resultado " + resultado);
		resultado = calc.calcular(10, 10, new Divisao());
		System.out.println("Resultado " + resultado);
		resultado = calc.calcular(10, 10, new Multiplicacao());
		System.out.println("Resultado " + resultado);
		
		Object op = new Multiplicacao();
		String texto = calc.calcular(12, 3, op);
		System.out.println(texto);
	}
}
