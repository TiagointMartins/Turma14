package lista6;

public class Eletronico {

	public String modelo;
	public int valor;
	public String localVenda;

	
	

	public Eletronico(String modelo, int valor) 
	{
		super();
		this.modelo = modelo;
		this.valor = valor;
		
	}

	public Eletronico() {
		// TODO Auto-generated constructor stub
	}

	public void Frase()
	{
		System.out.println("O Celular modelo "+this.modelo+ " está no valor de: R$ "+this.valor);
	}

	
}