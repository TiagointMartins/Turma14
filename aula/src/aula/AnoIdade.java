package aula;

import java.lang.Math;
import java.util.Scanner;

public class AnoIdade {

	public static void main(String[] args) 
{
		 Scanner leia = new Scanner (System.in);
		 
		 int anoNascimento;
		 
		 System.out.println("Informe o ano de seu nascimento: ");
		 anoNascimento = leia.nextInt();
		 linha();
		 System.out.println("Sua idade �: "+anoAtual(anoNascimento)+" anos");
		 
		 if (anoAtual(anoNascimento) < 18)
		 {
			 System.out.println("Oi, voc� tem "+anoAtual(anoNascimento)+" anos e est� na classe Infanto-Juvenil");
		 }
		 else if( (anoAtual(anoNascimento) >=18) && (anoAtual(anoNascimento)<=60))
		 {
			 System.out.println("Oi, voc� tem "+anoAtual(anoNascimento)+" anos e est� na classe Adulto");
		 }
		 

}
	
	static int anoAtual(int anoNascimento) 
	{
		int anoAtual=2020;
		int idade;
		
		idade = anoAtual - anoNascimento;

			return idade;
					
	}
	
	
	public static void linha()
	{
		System.out.println("------------------------------");
		
	}
	

}
