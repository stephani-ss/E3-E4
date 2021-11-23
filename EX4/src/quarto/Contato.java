package quarto;

public class Contato {
	int id;
	String numero;
	String nomeContato;
	
	public String getNomeCliente() {
		return nomeContato;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeContato = nomeCliente;
	}
	public int getNum() {
		return id;
	}
	public void setNum(int num) {
		this.id = num;
	}
	public String getNumero() {
		return numero;
	}
	public void setSaldo(String numero) {
		this.numero = numero;
	}
	
	public Contato(int id, String numero, String nomeContato) {
		super();
		this.id = id;
		this.numero = numero;
		this.nomeContato = nomeContato;
	}
	@Override
	public String toString() {
		return "|  " + id +   " |   "  + nomeContato +  "   |     "  + numero + "    | ";
	}
}