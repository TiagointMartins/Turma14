package aula;

import java.util.Scanner;

public class oiMundo 
{

	public static void main(String[] args) 
	{
		//variaveis
		
		Scanner leia = new Scanner (System.in);
		String nome;
		int anoNascimento;
		
	System.out.println("Digite o nome do usu�rio: ");
	nome = leia.next();
	System.out.println("Digite o ano de Nascimento: ");
	anoNascimento = leia.nextInt();
	System.out.println("Nome: "+nome );
	System.out.println("Idade: "+(2020-anoNascimento));
	
	leia.close();
	}
}
