package ex9; 

public class PessoaMainA {
public static void main(String[] args) {
	
	Pessoa p = new Pessoa();
	p.nome = "Vitória";
	p. cpf = 12345678910l; //colocar um l no final
	p.datadenascimento = "24/10/2005";
	
	System.out.println("A pessoa " +p. nome + " Tem o CPF n° " + p.cpf + " Sua data de aniversário é "+ p.datadenascimento );
	 
	
	Pessoa p2 = new Pessoa();
	p2.nome = "Vitória";
	p2. cpf = 12345678911l; //colocar um l no final
	p2.datadenascimento = "25/10/2005";
	
	System.out.println("A pessoa " +p2. nome + " Tem o CPF n° " + p2.cpf + " Sua data de aniversário é "+ p2.datadenascimento );
	 
	
	Pessoa p3 = new Pessoa();
	p3.nome = "Vitória";
	p3. cpf = 12345678912l; //colocar um l no final
	p3.datadenascimento = "26/10/2005";
	
	System.out.println("A pessoa " +p3. nome + " Tem o CPF n° " + p3.cpf + " Sua data de aniversário é "+ p3.datadenascimento );
	
	
	
	
}
}
