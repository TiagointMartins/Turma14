package lista8;

public  class Animal 
{
	private String nome;
	private int idade ;
	private String especie;
	public String emitirSom;
	
	public Animal(String nome, int idade, String tipo) 
	{
		super();
		this.nome = nome;
		this.idade = idade;
		this.especie = tipo;
	}
	
	public String acao()
	{
		return "";
	}
	  
	public String setEmitirSom()
	{
		return emitirSom;
	}
	
	public String getEmitirSom()
	{
		return emitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
}
