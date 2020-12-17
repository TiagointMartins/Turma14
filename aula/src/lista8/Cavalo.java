package lista8;

public class Cavalo extends Animal
{

	public Cavalo (String nome, int idade, String especie)
	{
		super(nome, idade, especie);
	}
	public String acao()
	{
		return "trotando";
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


