package exercicio;

public class AnimalMain {
//dentro do método main, instancie Cachorro e Gato e atribua valores através de codificação rígida (hardcoding). 


	public static void main(String[] args) {
	
		Cachorro c = new Cachorro();
		 c.setComprimento(25);
		 c.setCor("Marrom");
		 c.setEcosistema("Desconhecio");
		 c.setNome("Mel");
		 c.setNumerodePatas(4);
		 c.setRaca("Chowchow");
		 
		 System.out.println(c.getComprimento());
		 System.out.println(c.getNumerodePatas());
		 System.out.println(c.getCor());
		 System.out.println(c.getNome());
		 System.out.println(c.getRaca());
		 System.out.println(c.getEcosistema());
			c.Late();
		 
		Gato g = new Gato ();
		 g.setComprimento(45);
		 g.setCor("Cinza");
		 g.setEcosistema("Deconhcido");
		 g.setNome("amora");
		 g.setNumerodePatas(4);
		 g.setRaca("Ciames");
		 
		System.out.println(g.getComprimento());
		System.out.println(g.getNumerodePatas());
		System.out.println(g.getCor());
		System.out.println(g.getNome());
		System.out.println(g.getRaca());
		System.out.println(g.getEcosistema());
		
		g.Mia();
	
		
	}

}
