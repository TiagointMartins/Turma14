package Objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteFunc 
{

	public static void main(String[] args) 
	{

	Scanner leia = new Scanner (System.in);	
	List<Funcionario> lista = new ArrayList<>();
	System.out.println("Quantos funcionários serão cadastrados ?");
	int quantidade = leia.nextInt();
	for ( int x=1; x<=quantidade;x++)
	{
		System.out.printf("FUNCIONÁRIO %d - DIGITE OS DADOS:\n" );
		System.out.println("Funcionario terceiro [S/N]: ");
		char op = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite o nome: ");
		String nome = leia.next();
		System.out.println("Horas mensais: ");
		int horas = leia.nextInt();
		System.out.println("Qual o valor da hora: ");
		double valor = leia.nextDouble();
		
		if (op == 'S')
		{
			System.out.println("Digte o adcional terceir: ");
			double adicional = leia.nextDouble();
		lista.add( new Terceiro(nome, horas, valor, adicional));
		}
		else 
		{
			lista.add( new Funcionario(nome, horas, valor));
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	}

}
