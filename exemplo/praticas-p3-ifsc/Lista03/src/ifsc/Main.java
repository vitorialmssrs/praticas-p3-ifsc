package ifsc;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	 Scanner leitura = new Scanner(System.in);
	 
		Pessoa[] pessoas = new Pessoa[3];
		
		for(int i=0; i< pessoas.length; i++) {
			
		Pessoa p = new Pessoa();
		
		p.cpf = leitura.nextLine();
		p.nome = leitura.nextLine();
		
		pessoas[i] = p; //armazena o vetor
		
		
		
		}
		 for(int i=0; i< pessoas.length; i++) {
			System.out.println("A pessoa" +pessoas[i]. nome + "Tem o CPF n°" + pessoas[i].cpf );
		 
		 }
		
	}
		
	}
