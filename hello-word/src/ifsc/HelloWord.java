package ifsc;

import java.util.Iterator;
import java.util.Scanner;

public class HelloWord {

	public static void main(String[] args) {
		//leitura de dados input ctrl shift s salva
		Scanner leitura = new Scanner(System.in); // leitura de dados
				System.out.println("Nome: ");
				//faz a leityra e guarda o conteudo em uma varriavel
			String Nome = leitura.nextLine();
			
			
			System.out.println("Idade: ");
			String idadeStr = leitura.nextLine();
			
			int idade = Integer.valueOf(idadeStr);
			
			//exibe o conteudo lido
					// o sinal de + para contenação
			
			System.out.println(Nome + " tem "+ idade);
					
				
				
		
	}

}
