package pjAula3;

public class Filho extends Pai{
	private String time;

	public Filho(String nome,
			int altura,
			String time) {
		super(nome, altura);
		this.time = time;
	}
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
}