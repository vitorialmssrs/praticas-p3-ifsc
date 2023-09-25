package exercicio;

public class Animal {
  
	         private String nome;
	         private String raca;
	        private float comprimento;
	        private Integer NumerodePatas;
	        private String cor;
	        private String ecosistema;
	        
			public float getComprimento() {
				return comprimento;
			}
			public void setComprimento(float comprimento) {
				this.comprimento = comprimento;
			}
			public Integer getNumerodePatas() {
				return NumerodePatas;
			}
			public void setNumerodePatas(Integer numerodePatas) {
				NumerodePatas = numerodePatas;
			}
			public String getCor() {
				return cor;
			}
			public void setCor(String cor) {
				this.cor = cor;
			}
			public String getEcosistema() {
				return ecosistema;
			}
			public void setEcosistema(String ecosistema) {
				this.ecosistema = ecosistema;
			}
			public String getNome() {
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public String getRaca() {
				return raca;
			}
			public void setRaca(String raca) {
				this.raca = raca;
			}
	        
}
