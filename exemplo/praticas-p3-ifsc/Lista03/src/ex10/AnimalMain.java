package ex10;

public class AnimalMain {
	
	public static void main(String[] args) {
		
		Animal a= new Animal();
		
		a.nomeCientifico = "SerinusCanaria";
		a.familia = "Fringillidae";
		a.reino = "Animal";
		
		String[] nomesPop = new String[5];
		nomesPop[0] = "canário-belga";
		nomesPop[1] = "canário-do-reino";
		nomesPop[2] = "canário-do-império";
		nomesPop[3] = "canário-doméstico";
		nomesPop[4] = "canário";
		a.nomesPopulares = nomesPop;
		
		
		
	}

}
