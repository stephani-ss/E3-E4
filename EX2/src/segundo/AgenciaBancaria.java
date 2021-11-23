package segundo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AgenciaBancaria {

	public static void main(String[] args) {
		
			ArrayList<Conta> contas = new ArrayList<>();
			ArrayList<Pessoa> pessoas = new ArrayList<>();
			Map <String, Conta> mapaContas = new HashMap();
			Set <String> CPFClientes = new HashSet();
			
			//Adicionar Pessoas
			
			Pessoa p1 = new Pessoa("002.002.004-02", "Julia");
			Pessoa p2 = new Pessoa("003.003.005-03", "Livia");
			
			pessoas.add(p1);
			pessoas.add(p2);
			
			
			//Adicionar contas
			
			
			Conta c1 = new Conta(124, 300.0, p1.getNome());
			Conta c2 = new Conta(125, 400.0, p2.getNome());

			contas.add(c1);
			contas.add(c2);
			
			
			
			for (Pessoa pessoa : pessoas) {
				CPFClientes.add(pessoa.getCpf());
			}
			
			
			//Relacionar CPF à conta
			
			for (int i = 0; i < pessoas.size(); i++) {
				Pessoa pessoa = pessoas.get(i);
				Conta conta = contas.get(i);
				mapaContas.put(pessoa.getCpf(), conta);
				
			}
			
			//Exibe os cpfs existentes 
			System.out.println("            AGÊNCIA BANCARIA             " );
			System.out.println(" ");
			System.out.println("  CPFs: " + CPFClientes);
			
			//Exibe os dados bancarios do CPF abaixo
			String cpf = "002.002.004-02";
			Conta conta =(Conta)mapaContas.get(cpf);
			System.out.println(" ");
			System.out.println("+-----------------------------------------+");
			System.out.println("|  Dados Bancarios - CPF: " + cpf + "  | " );
			System.out.println("+-----------------------------------------+");
			System.out.println(conta.toString());
			System.out.println("+-----------------------------------------+");
	}

}