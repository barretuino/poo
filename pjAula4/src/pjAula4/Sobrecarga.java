package pjAula4;

/**
 * Classe que demonstra o conceito de Polimorfismo
 * por meio da Implementação da Sobrecarga de métodos
 * @autor Prof. Paulo Barreto
 * @data 29/02/2024
 */
public class Sobrecarga {
	//Métodos
	public long duplo(int numero) {
		return numero * 2;
	}
	
	public long duplo(String numero) {
		return Long.parseLong(numero) * 2;
	}
	
	public float duplo(float numero) {
		return numero * 2 ;
	}
	
	public double elevar(double a, double b) {
		return Math.pow(a, b);
	}
	
	public double elevar(double a, String b) {
		return Math.pow(a, Double.parseDouble(b));
	}
	
	public double elevar(double a) {
		return Math.pow(a, a);
	}
	
	public double elevar(String a, double b) {
		return Math.pow(Double.parseDouble(a), b);
	}
	
	
	/*public double getIvaAjustado(double IVA, double ICMSOrigem,
			double ICMSDestino, double PIS, double COFINS,
			double reducao) {
		return ((ICMSOrigem/ICMSDestino) * IVA / 100 
				+ (PIS + COFINS)/100) - reducao;
	}
	
	public double getIvaAjustado(GrupoTributario grupo) {
		return grupo.getAjusta() / 100;
	}*/
	
	
}
