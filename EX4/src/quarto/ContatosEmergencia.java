package quarto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContatosEmergencia {

	public static void main(String[] args) {
		
			ArrayList<Contato> contatos = new ArrayList<>();
			ArrayList<Parente> parentes = new ArrayList<>();
			Map <String, Contato> mapaContatos = new HashMap();
			Set <String> Nparentesco = new HashSet();
			
			//Adicionar Pessoas
			
			Parente p1 = new Parente("pai", "José");
			Parente p2 = new Parente("irmão", "Kauã");
			
			parentes.add(p1);
			parentes.add(p2);
			
			
			//Adicionar contas
			
			
			Contato c1 = new Contato(1, "+55 1298173-2018", p1.getNome());
			Contato c2 = new Contato(2,"+55 1298243-2032", p2.getNome());

			contatos.add(c1);
			contatos.add(c2);
			
			
			
			for (Parente parente : parentes) {
				Nparentesco.add(parente.getParente());
			}
			
			
			//Relacionar CPF à conta
			
			for (int i = 0; i < parentes.size(); i++) {
				Parente parente = parentes.get(i);
				Contato contato = contatos.get(i);
				mapaContatos.put(parente.getParente(), contato);
				
			}
			
			//Exibe os cpfs existentes
			System.out.println("CONTATOS DE EMERGENCIA " );
			System.out.println(" ");
			System.out.println("Parentes: " + Nparentesco);
			
			//Exibe os dados bancarios do CPF abaixo
			String parentesco = "pai";
			Contato contato =(Contato)mapaContatos.get(parentesco);
			System.out.println(" ");
			System.out.println("#------------------------");
			System.out.println("# Parente: " + parentesco);
			System.out.println("#------------------------");
			System.out.println(" ");
			System.out.println("+-----------------------------------------+");
			System.out.println("| ID |   nome   |          número         |" );
			System.out.println("+-----------------------------------------+");
			System.out.println(contato.toString());
			System.out.println("+-----------------------------------------+");
	}

}