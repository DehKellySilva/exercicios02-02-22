package exercicioJava;

public class Preguica extends Animais{
	
	public Preguica()
	{
		super("Animais preguica");
	}
	@Override
	public void especie(String especie) {
	System.out.println("Preguiça "+especie);
	}
	@Override 
	public void idade(int idade) {
		System.out.println("25 anos "+idade);
}
	@Override
	public void som(String som) {
		System.out.println("Emite som pelas narinas " +som);
	}
	@Override
	public void habilidade(String habilidade) {
		System.out.println("Sobe em árvores"+habilidade);
	}
}

