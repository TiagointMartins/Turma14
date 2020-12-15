package lista6;

public class Cliente {

	public String nome;
	public String cpf;
	public char genero;
	public int anoNascimento;
	
	
	public void  idade(int anoAtual)
	{
		int Idade = anoAtual - anoNascimento;
		System.out.println(" A sua idade é: "+Idade+ " anos");
	}
	public int retornaIdade(int anoAtual)
	{
		int idade = anoAtual - this.anoNascimento;
		return idade;
	}
	
	
	
	
}
