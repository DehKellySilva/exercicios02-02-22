package exercicioJava;

import java.io.ObjectInputStream.GetField;

public class TesteAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		Animais animais = null;
		
		int n = (int) (Math.random()*3.0); 
		
		System.out.println("\nO número escolhido foi: "+n);
		
		switch(n)
		{
		case 0: animais = cachorro;break;
		case 1: animais = cavalo;break;
		case 2: animais = preguica;break;
		default: System.out.println("\nErro inesperado...");
		}
		if(animais != null)
		{
			animais.especie("");
			animais.idade(0);
			animais.som("");
			animais.habilidade("");
			
		}

	}

}
