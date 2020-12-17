package lista8;

import java.util.Scanner;

public class lista8Exercicio2 
{
	
	public static void main(String[] args) 
	{
	Scanner leia = new Scanner(System.in);	
	String emitirSom;
	
	Animal cachorro = new Animal("Spike",4,"doméstico");
	Animal cavalo = new Animal ("pé de pano",19,"selvagen");
	Animal preguica = new Animal("trabalhador",28,"selvagem");
	System.out.println("Informe o som emitido pelo "+cachorro.getNome());
	
	emitirSom = leia.next();
	cachorro.setEmitirSom(emitirSom);
	System.out.println("\nNOME : "+cachorro.getNome()+"\nIDADE: "+cachorro.getIdade()+"\nSOM EMITIDO: "+cachorro.getEmitirSom());
	
	
	System.out.println("Informe o som emitido pelo "+cavalo.getNome());
	emitirSom = leia.next();
	cachorro.setEmitirSom(emitirSom);
	System.out.println("\nNOME : "+cavalo.getNome()+"\nIDADE: "+cavalo.getIdade()+"\nSOM EMITIDO: "+cavalo.getEmitirSom());
	
	
	System.out.println("Informe o som emitido pelo "+preguica.getNome());
	emitirSom = leia.next();
	cachorro.setEmitirSom(emitirSom);
	System.out.println("\nNOME : "+preguica.getNome()+"\nIDADE: "+preguica.getIdade()+"\nSOM EMITIDO: "+preguica.getEmitirSom());
	
	
	
	
	
	}
}
