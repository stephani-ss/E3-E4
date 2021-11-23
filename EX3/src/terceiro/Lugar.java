package terceiro;

public class Lugar {
	
	String nome;
	String endereco;
	String descricao;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDrescricao() {
		return descricao;
	}
	public void setDrescricao(String drescricao) {
		this.descricao = drescricao;
	}
	public Lugar(String nome, String endereco, String drescricao) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.descricao = drescricao;
	}
	@Override
	public String toString() {
		return "| " + nome + "  |   " + endereco + "    |  "  + descricao + "  |  ";
	}

}