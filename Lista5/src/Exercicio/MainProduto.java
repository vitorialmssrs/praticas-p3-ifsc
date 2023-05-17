package Exercicio;

import java.util.ArrayList;

public class MainProduto {
public static void main(String[] args) {
	
	ArrayList<Produto> Produtos= new ArrayList<>();
	
	Produto n1= new Produto();
	
	n1.setNome("Bolsa");
	n1.setCodBarras(12334140144556987l);
	n1.setPreco(199.99);
	n1.setFornecedor("Versace");
	
	Produtos.add(n1);
	
	Produto n2= new Produto();
	n2.setNome("Perfume");
	n2.setCodBarras(2345432526940l);
	n2.setPreco(350.00);
	n2.setFornecedor("Chanel");
	
	Produtos.add(n2);

	Produto n3= new Produto();
	n3.setNome("Celular Iphone 13");
	n3.setCodBarras(241475916113472l);
	n3.setPreco(1999.99);
	n3.setFornecedor("Iphone");
	
	Produtos.add(n3);
	
	for (Produto produto : Produtos) {
		System.out.println(produto.getNome());
		System.out.println(produto.getCodBarras());
		System.out.println(produto.getPreco());
		System.out.println(produto.getFornecedor());
		
	}
	
	
}
}
