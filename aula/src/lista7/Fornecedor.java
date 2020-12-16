package lista7;

public class Fornecedor extends Pessoa 
{
	private double valorDivida;
	private double valorCredito;
	
	
	public Fornecedor()
		{
		
		}
	
	
	
	public Fornecedor(String nome)
	{
		super(nome);
	}



	public Fornecedor(String nome, String telefone) 
	{
	super(nome, telefone);
	}
	
	
	//ENCAPSULAMENTO
	public double obterSaldo()
		{
		return (this.valorCredito - this.valorDivida);
		}
	
	public double getValorDivida() 
		{
		return valorDivida;
		}
	
	public void setValorDivida(double valorDivida) 
		{
		this.valorDivida = valorDivida;
		}
	
	public double getValorCredito()
		{
		return valorCredito;
		}
	
	public void setValorCredito(double valorCredito) 
		{
		this.valorCredito = valorCredito;
		}

	


}

