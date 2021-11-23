package terceiro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class AgenciaViagens {

	public static void main(String[] args) {
		ArrayList<Lugar> destinos = new ArrayList<>();
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		Map <String, Lugar> mapaViagem = new HashMap();
		Set <String> CPFClientes = new HashSet();
		
		//Adicionar Pessoas
		Pessoa p1 = new Pessoa("002.002.004-02", "Julia");
		Pessoa p2 = new Pessoa("003.003.005-03", "Livia");
		
		pessoas.add(p1);
		pessoas.add(p2);

		
		Lugar d1 = new Lugar("Praia do Cedro", "Ubatuba", "Praia");
		Lugar d2 = new Lugar("Cataratas do Iguaçu", "Paraná", "Conjunto de quedas de água");

		
		destinos.add(d1);
		destinos.add(d2);
		
		
		for (Pessoa pessoa : pessoas) {
			CPFClientes.add(pessoa.getCpf());
		}
		for (int i = 0; i < pessoas.size(); i++) {
			Pessoa pessoa = pessoas.get(i);
			Lugar lugar  = destinos.get(i);
			mapaViagem.put(pessoa.getCpf(), lugar);
			
		}
		
		//Exibe os cpfs existentes 
		System.out.println("                         AGÊNCIA DE VIAGENS                           " );
		System.out.println(" ");
		System.out.println("                CPFs: " + CPFClientes);
		
		//Retorna os dados do Cliente através do CPF
		String cpf = "003.003.005-03";
		Lugar lugar =(Lugar)mapaViagem.get(cpf);
		System.out.println(" ");
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println("|                       CPF: " + cpf + "                         | " );
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println("|          nome        |   endereco  |          descricao           |" );
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println( lugar.toString());
		System.out.println("+-------------------------------------------------------------------+");

	}

}