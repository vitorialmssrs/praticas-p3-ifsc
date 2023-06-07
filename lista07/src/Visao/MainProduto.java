package Visao;

import controle.ProdutoDAO;
import modelo.Produto;

public class MainProduto {
	
	public static void main(String[] args) {
		Produto p = new Produto();
		p.setNome("sapato");
		p.setCodBarras(12234674l);
		
		ProdutoDAO banquinho = new ProdutoDAO();
		banquinho.inserir(p);
		
		p.setNome("sapato");
		banquinho.alterar(p);
	

		banquinho.alterar(p);
		
		banquinho.listar();
	}
	
	
	
	
}
