package exercicioJava;

public abstract class Animais {
	
	private String animal;
	abstract public void especie(String especie);
	abstract public void idade(int idade);
	abstract public void som(String som);
	abstract public void habilidade(String habilidade);
	
	public Animais(String animal)
	{
		this.animal = animal;
	}
	public String getAnimal() {
		return animal;
	}
	
	public void setAnimal(String animal) {
		this.animal = animal;
	}
}
	