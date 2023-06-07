package controle;

import java.util.ArrayList;

import modelo.Produto;

public class ProdutoDAO {
	
	private ArrayList<Produto> lista;
	
	public ProdutoDAO() {
		lista = new ArrayList<>();
		
	}
	
	public boolean inserir(Produto p) {
		lista.add(p);
		return true;
	}
	 public boolean alterar(Produto p) {
		 for(Produto produto : lista) {
			 if(produto.getCodBarras() == p.getCodBarras()) {
				 produto.setNome(p.getNome());
				 produto.setCodBarras(p.getCodBarras());
				 return true;
			 }
		 }
		 return false;
	 }
	  public boolean excluir(Produto produtoExcluir) {
		for(Produto produto : lista) {
		  if(produto.getCodBarras() == produtoExcluir.getCodBarras()) {
			 lista.remove(produto);
			 return true;
		  }
	  }
		return false;
	  }
	  public ArrayList<Produto> listar(){
		  return this.lista;
	  }
	
}

