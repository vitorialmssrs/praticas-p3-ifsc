package visao;

import java.util.ArrayList;
import java.util.Scanner;

import controle.GeneDAO;
import modelo.Gene;

public class Principal {
	public static int menu() {
		Scanner leitura = new Scanner(System.in);
		System.out.println("            Menu            ");
		System.out.println("0 - Cadastrar gene");
		System.out.println("1 - Listar genes cadastrados");
		System.out.println("2 - Editar sequência");
		System.out.println("3 - Excluir gene");
		System.out.println("4 - Exibir tabela");
		System.out.println("5 - Fechar");
		Integer opcao = Integer.valueOf(leitura.nextLine());
		leitura.close();
		return opcao;
	}

	/*
	 * switch (tipo) { case 1: { gene.setSequencia(gene.getmRNA()); } case 2: {
	 * String AA; AA = gene.getmRNA(); AA = gene.getProteina();
	 * gene.setSequencia(AA); } }
	 */

	public static void main(String[] args) {

		Integer opcao = Integer.MAX_VALUE;
		while (opcao != 0) {
			opcao = menu();
			Gene gene = new Gene();
			switch (opcao) {
			case 0: {

				GeneDAO dao = new GeneDAO();

				String nome = s.nextLine();
				gene.setNome(nome);

				gene.setSequencia(null);
				gene.setTraducao(null);

				boolean cadastrou = dao.cadastrarGene(gene);
				if (cadastrou == true) {
					System.out.println("Cadastrou o gene com sucesso.");
				} else {
					System.out.println("Erro ao cadastrar o gene.");
				}

			}
			case 1: {
				System.out.println("Listagem de genes cadastrados: ");
				for (Gene gen : genes) {
					System.out.println("Nome: " + gen.getNome());
					System.out.println("Sequência: " + gen.getSequencia());
					System.out.println("Tradução: " + gen.getTraducao());
				}
			}
			case 2: {
				GeneDAO dao = new GeneDAO();
				genes = dao.editarGene(genes);
			}
			case 3: {

			}
			case 5: {
				// Encerra o sistema
				break;
			}
			}
		}
	}
}
