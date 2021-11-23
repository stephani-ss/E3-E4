package segundo;

public class Conta {
	int num;
	Double saldo;
	String nomeCliente;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Conta(int num, Double saldo, String nomeCliente) {
		super();
		this.num = num;
		this.saldo = saldo;
		this.nomeCliente = nomeCliente;
	}
	@Override
	public String toString() {
		return "| N° - " + num +   " | "  +"Saldo - " + saldo +  " | "  + "Nome - " + nomeCliente + " | ";
	}
}