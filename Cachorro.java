package exercicioJava;

public class Cachorro extends Animais {

	public Cachorro()
	{
		super("Animais cachorro");
	}
	@Override
	public void especie(String especie) {
		System.out.println("Cachorro "+especie);
	}
	@Override 
	public void idade(int idade) {
		System.out.println("5 anos "+idade);
	}
	@Override
	public void som(String som) {
		System.out.println("Late" +som);
	}
	@Override
	public void habilidade(String habilidade) {
		System.out.println("Corre"+habilidade);
	}
}
