package lista8;

public class Preguica extends Animal
{

	public Preguica (String nome, int idade, String especie)
	{
		super(nome, idade, especie);
	}
	public String acao()
	{
		return "escalando";
	}
	
	@Override 
	public String setEmitirSom()
	{
		return emitirSom;
	}
	
	public String getEmitirSom()
	{
		return emitirSom;
	}
	
	
}

	
	
	
	
	

