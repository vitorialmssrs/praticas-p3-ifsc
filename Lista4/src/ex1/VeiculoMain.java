package ex1;

import java.util.ArrayList;

public class VeiculoMain {
	
	public static void main(String[] args) {
		
	ArrayList<Veiculo> veiculos = new ArrayList<>();
		
	Veiculo v1 = new Veiculo();
	
	v1.setAno(1994);
	v1.setCor("prata");
	v1.setFabricante("Gol");
	v1.setNome("Gol G2");
	v1.setNumRodas(4);
	veiculos.add(v1);
	
	Veiculo v2 = new Veiculo();

	v2.setAno(2024);
	v2.setCor("prata");
	v2.setFabricante("Fiat");
	v2.setNome("Fiat Pulse");
	v2.setNumRodas(4);
	veiculos.add(v2);
	
	Veiculo v3 = new Veiculo();
	
	v3.setAno(2021);
	v3.setCor("prata");
	v3.setFabricante("Volkswagen");
	v3.setNome("Volkswagen Arteon");
	v3.setNumRodas(4);
	veiculos.add(v3);
	
	for (Veiculo veiculo : veiculos) {
		System.out.println(veiculo.getCor());
		System.out.println(veiculo.getFabricante());
		System.out.println(veiculo.getNome());
		System.out.println(veiculo.getAno());
		System.out.println(veiculo.getNumRodas());
		
	}
	
	
	
	}
}