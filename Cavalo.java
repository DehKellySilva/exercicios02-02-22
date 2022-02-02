package exercicioJava;

public class Cavalo extends Animais{ 
	
	public Cavalo()
	{
		super("Animais cavalo");
	}
	@Override
	public void especie(String especie) {
		System.out.println("Cavalo "+especie);
	}
	@Override 
	public void idade(int idade) {
		System.out.println("18 anos "+idade);
}
	@Override
	public void som(String som) {
		System.out.println("Relincha " +som);
	}
	@Override
	public void habilidade(String habilidade) {
		System.out.println("Corre"+habilidade);
	}
}

