package lista6;

public class Aviao 
{
	public String modelo;
	public String companhia;


	
	public void Velocidade (int velocidadeDecolagem)
	{
		if (velocidadeDecolagem > 380)
		{
			System.out.println("Velocidade ideal para iniciar decolagem");
		}
		else 
		{
			System.out.println("Velocidade insulficiente para decolar, acelere para levantar voo");
		}
	}

	
}
