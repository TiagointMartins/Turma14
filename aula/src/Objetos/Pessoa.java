package Objetos;

public class Pessoa {

	
		public  String nome;
		public char genero;
		public int anoNascimento;
		public int idade;
		
		
		public Pessoa(String nome)
		{
			this.nome = nome;
		}
		
		
		public Pessoa(String nome, char genero )
		{
			this.nome = nome;
			this.genero = genero;
		}
		
		public void retornaIdade()
		{
			this.idade = 2020 - this.anoNascimento;
		}
	

}
