package Objetos;

public class Produto {

	public Produto(String nomeProduto, int qtdeProduto, double valorUnitario) {
		super();
		this.nomeProduto = nomeProduto;
		this.qtdeProduto = qtdeProduto;
		this.valorUnitario = valorUnitario;
	}

	public String nomeProduto;
	public int qtdeProduto;
	public double valorUnitario;
	
	public Produto() 
	{
		
	}
	public Produto (String nomeProduto)
	{
		this.nomeProduto = nomeProduto;
		
	}
	
}
