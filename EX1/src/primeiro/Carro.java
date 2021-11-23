package primeiro;

public class Carro {
	private String marca;
	private String modelo;
	private String placa;
	private double preco;
	
	// Construtor
	
	public Carro(String Marca, String Modelo, String Placa, double Preco) {
		Marca = marca;
		Modelo = modelo;
		Placa = placa;
		Preco = preco;
	}

	public Carro() {
		// TODO Auto-generated constructor stub
	}

	public String getPlaca() {
		return placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}