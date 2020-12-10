package loja;
import java.util.*;
import java.lang.Math;

public class cadLoja {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		// VARIAVEIS
		
		char opcao;
		String produtos [] = {"Delicia no Pote", "Ovo de Páscoa","Alfajor","Brownie","Pão de Mel","Brigadeiro","Panetone de KitKat","Panetone de Charge","Panetone de Ferrero","Panetone de Laka Óreo"};
		String codigos [] = new String [10];
		double precoUnitario [] = {10.00,60.00,5.00,5.00,4.00,0.90,90.00,90.00,90.00,90.00};
		int estoque [] = new int [10];
		
		linha(80);
		System.out.println("                      |                                  |        ");
		System.out.println("                      |                                  |        ");
		System.out.println("                      |                                  |        ");
		System.out.println("                      |          Bonno Cacau             |        ");
		System.out.println("                      |   Felicidade, em chocolate!      |        ");
		System.out.println("                      |                                  |        ");
		System.out.println("                      |                                  |        ");
		System.out.println("                      |                                  |        ");
		linha(80); 
		
	
		System.out.println("\nO que deseja fazer ?");
		pula();
		System.out.println("[1] - COMPRAR PRODUTOS");
		System.out.println("[2] - CONTROLAR ESTOQUE");
		System.out.println("[3] - SAIR\r");
		System.out.print("DIGITE A OPÇÃO: ");
		opcao = leia.next().charAt(0);
		
		switch (opcao)
		{
		case '1':
			
			System.out.print("Por favor, informe seu nome: ");
			String nomeCliente = leia.next().toUpperCase();
			System.out.print("Você se define como: M - MASCULINO, F - FEMININO ou O - OUTRO: ");
			char generoCliente = leia.next().toUpperCase().charAt(0);
			System.out.println(voltaGenero(generoCliente)+nomeCliente);

			for (int x=0; x<10; x++)
			{
				estoque[x]=10;
				codigos[x]=(x<9)?"BN-00"+(x+1):"BES-0"+(x+1);
				System.out.printf("%s\t\t%.2f\t\t%d\t%s\n",codigos[x],precoUnitario[x],estoque[x],produtos[x]);
				
			}
			
			break;
			
		case '2':
		{
			System.out.println("WIP");  // work in progress
			break;
		}
		
		case '3':
		{
			System.out.println("Volte sempre, adoramos sua visita !");
			break;
		}
		
		}
		
	
		
	}

public static String voltaGenero(char generoCliente) {
		
		String tipo;
		if (generoCliente == 'M')
		{
			tipo = "Seja bem vindo, ";
		}
		else if (generoCliente == 'F')
		{
			tipo = "Seja bem vinda, ";
		}
		else if (generoCliente == 'O')
		{
			tipo = "Seja bem vindx, ";
		}
		else
		{
			tipo = "*";
		}
			
		
		return tipo;
		
}
	
	public static void pula()
	{
		System.out.println("\n");
	}
	
	public static void linha(int tamanho )
	{
		for (int i=0 ; i < tamanho; i ++)
		{
			System.out.print("═");
			
		}
	
		
	}
}
