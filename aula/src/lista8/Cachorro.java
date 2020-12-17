package lista8;

	public class Cachorro extends Animal 
{
	public Cachorro (String nome, int idade, String especie) 
	{
		super(nome,idade,especie);
	}
	
	public String acao()
	{
		return "";
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
