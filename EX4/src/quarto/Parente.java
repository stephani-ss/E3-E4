package quarto;

public class Parente {
	
	String parentesco;
	String nome;
	public String getParente() {
		return parentesco;
	}
	public void setParente(String parentesco) {
		this.parentesco = parentesco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Parente(String parentesco, String nome) {
		super();
		this.parentesco = parentesco;
		this.nome = nome;
	}

}