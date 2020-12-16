package lista7;

public class Empregado extends Pessoa
{
	private int codigoSetor;
	private double salarioBase;
	private double imposto;

	// CONSTRUTOR
	
	public Empregado()
	{
		
	}
	
	public double calculaSalario()
		{
			return this.salarioBase =  (salarioBase * imposto) ;
		}
	
	public Empregado(String nome) 
	{
		super(nome);
	}
	
		//ENCAPSULAMENTO

	

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	
		
}
