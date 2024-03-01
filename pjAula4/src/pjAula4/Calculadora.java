package pjAula4;

public class Calculadora {
	public double calcular(double a, double b, 
							OperacaoMatematica operacao) {		
		return operacao.calcular(a, b);
	}
	
	public String calcular(double a, double b, Object objeto) {
		if(objeto instanceof Soma) {
			double resultado = ((Soma)objeto).calcular(a, b);
			return "Resultado " + resultado
					   + " operação de Soma.";
		}
		if(objeto instanceof Multiplicacao) {
			double resultado = ((Multiplicacao)objeto).calcular(a, b);
			return "Resultado " + resultado
					   + " operação de Multiplicação.";
		}
		if(objeto instanceof Subtracao) {
			double resultado = ((Subtracao)objeto).calcular(a, b);
			return "Resultado " + resultado
					   + " operação de Subtração.";
		}
		if(objeto instanceof Divisao) {
			double resultado = ((Divisao)objeto).calcular(a, b);
			return "Resultado " + resultado
					   + " operação de Divisão.";
		}
		return "Operação inválida não reconhecida";
	}
}
