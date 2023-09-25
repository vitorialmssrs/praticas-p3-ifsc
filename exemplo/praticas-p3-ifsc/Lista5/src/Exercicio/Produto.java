package Exercicio;

public class Produto {
	public static Produto n2;
	private String nome;
	private Long codBarras;
	private Double preco;
	private String fornecedor;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCodBarras() {
		return codBarras;
	}
	public void setCodBarras(Long codBarras) {
		this.codBarras = codBarras;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	}
