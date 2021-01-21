package loja;
import java.util.*;
import java.lang.Math;

public class cadLoja {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		// VARIAVEIS
		
		char opcaoMenu, opcaoVolta =0;
		String nomeCliente;
		int estoque=0;
		int giros = 10, quantidadeCompra;
		
		String nomeProduto [] = {"Delicia no Pote", "Ovo de Páscoa","Alfajor","Brownie","Pão de Mel","Brigadeiro","Panetone de KitKat","Panetone de Charge","Panetone de Ferrero","Panetone de Laka Óreo"};
		String codigoProduto [] = new String [10];
		double valorUnitario [] = {10.00,60.00,5.00,5.00,4.00,0.90,90.00,90.00,90.00,90.00};
		int quantidadeProduto[] = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		String carrinho[] = new String[giros];
		
		
		
		menu(); //função menu visual 
		menuEscolha();//funcão menu escolha [1] - COMPRAR PRODUTOS, [2] - GERENCIAR ESTOQUE, [3] - SAIR 
		opcaoMenu = leia.next().charAt(0);
		
		switch (opcaoMenu)
		{
		case '1':
			
				
			System.out.print("Por favor, informe seu nome: ");
			nomeCliente = leia.next().toUpperCase();
			nomeGenero(); //funçao retornar nome e genero
			
			char generoCliente = leia.next().toUpperCase().charAt(0);
			
			linha(80);
			pula();
			System.out.println(voltaGenero(generoCliente)+nomeCliente);
			
			linha(80);
			pula();
			System.out.println("CÓDIGO\t\tVALOR\tQUANTIDADE\tPRODUTO");

			// gerar código
			for (int x=0; x<10; x++)
			{
				quantidadeProduto[x]=10;
				codigoProduto[x]=(x<9)?"BN-00"+(x+1):"BN-0"+(x+1);
				System.out.printf("%s\t\t%.2f\t\t%d\t%s\n",codigoProduto[x],valorUnitario[x],quantidadeProduto[x],nomeProduto[x]);
				
			}
			System.out.println("\n\nDigite o código do produto escolhido: ");
			String codigo = leia.next();
			System.out.println("Produto escolhido: ");
			for(int i=0; i<giros; i++)
			{
				if(codigo.equals(codigoProduto[i])) 
				{
					estoque = quantidadeProduto[i];
					System.out.println(nomeProduto[i]);
				}
			}
			
			for(int i=0; i<giros; i++) 
			{
				
			}
			System.out.print("Digite quantas unidades deseja comprar: (" +estoque+"unidades em estoque)");
			quantidadeCompra = leia.nextInt();
			
			System.out.println("\nDeseja volta ao Menu? [1]SIM [2]NÃO:_");
			opcaoVolta = leia.next().toUpperCase().charAt(0);
			if(opcaoVolta == '2') 
			{
				System.out.println("OBRIGADO PELA SUA VISITA, VOLTE SEMPRE!!!");
				break;
			}
			
			while(opcaoVolta != '1' && opcaoVolta != '2') 
			{
				if(opcaoVolta != '1' && opcaoVolta != '2')
				{
					System.out.println("Por favor, escolha uma opção válida - [1]SIM | [2]NÃO");
					opcaoVolta = leia.next().toUpperCase().charAt(0);
				} 
				
				else 
				
				{
					
					break;
					
				}
			
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
			
			tipo = "\t\t\tSeja bem vindo, ";
		}
		else if (generoCliente == 'F')
		{
			
			tipo = "\\t\\t\\tSeja bem vinda, ";
			
		}
		else if (generoCliente == 'O')
		{
			
			tipo = "\\t\\t\\tSeja bem vindx, ";
			
		}
		else
		{
			
			tipo = "*";
			
		}
			
		
		return tipo;
		
}
		public static void menuEscolha()
		{
			pula();
			System.out.println("|◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙|");
			System.out.println("|        O que deseja fazer ?      |");
			System.out.println("|      [1] - COMPRAR PRODUTOS      |");
			System.out.println("|      [2] - CONTROLAR ESTOQUE     |");
			System.out.println("|             [3] - SAIR           |");
			System.out.println("|◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙|");
			
		}

	public static void menu()
	{
		
		System.out.println("|◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙|");
		System.out.println("|                                  |");
		System.out.println("|                                  |");
		System.out.println("|          Bonno Cacau             |");
		System.out.println("|   Felicidade, em chocolate!      |");
		System.out.println("|                                  |");
		System.out.println("|                                  |");
		System.out.println("|◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙|");
		
	}
	public static void nomeGenero()
	{
		pula();
		System.out.println("|◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙|");
		System.out.println("|        Você se define como:      |");
		System.out.println("|          M - MASCULINO           |");
		System.out.println("|          F - FEMININO            |");
		System.out.println("|           O - OUTRO              |");
		System.out.println("|◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙◙|");
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


