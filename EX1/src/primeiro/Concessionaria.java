package primeiro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Concessionaria {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<Carro> concessionaria = new ArrayList<Carro>();
		
		HashMap mp=new HashMap();
		
		Carro car;
		
		int qtd_carro;
		System.out.println("Quantidade de carros: ");
		qtd_carro = s.nextInt();
		
		for (int i=1;i<=qtd_carro;i++)
		{
			car = new Carro();
			System.out.println("Insira o Modelo, Placa e Preço do Carro: " + i);
			System.out.println(" ");
			System.out.println("Modelo: ");
			car.setModelo(s.next());
			System.out.println("Placa: ");
			car.setPlaca(s.next());
			System.out.println("Preço: ");
			car.setPreco(s.nextFloat());
			concessionaria.add(car);
			mp.put(car.getPlaca(), car);
			
		}
		
		for (int i=0;i<concessionaria.size();i++) 
		{
			car=(Carro)concessionaria.get(i);
			System.out.println(" ");
			
			System.out.println(
			"Modelo: " + car.getModelo() + 
			" | " +
			"Placa: " + car.getPlaca() + " | " +"Preço:  " + 
			car.getPreco()); 
		}
		for (int i=0;i<concessionaria.size();i++) 
		{
			car=(Carro)concessionaria.get(i);

				
		}
		
		System.out.println(" ");
		System.out.println("Busque um carro através da placa: ");
		String plc = s.next();
		car=(Carro)mp.get(plc);
		System.out.println(" ");
		System.out.println("Modelo: " + car.getModelo( ) + " | " +"Preço: " + 
				car.getPreco()); 
	
	}
	

}