package Objetos;

import java.util.Scanner;

public class Loja 
{
	public static void main(String[] args) {
		
	

	Loja Produto = new Loja();
	Scanner leia= new Scanner (System.in);
	
	int opcao ;
	String produto = "Vestido";
	int qtde = 3;
	double valorProduto = 100.00;
	
	String produto1 = "Blusa";
	int qtde1 = 1;
	double valorProduto1 = 50.00;
	
	String produto2 = "Camisa";
	int qtde2 = 20;
	double valorProduto2 = 20.00;
	
	System.out.println("Informe o produto que você quer comprar: ");
	System.out.println("[1]- Vestido, [2] - Blusa ou [3]-Camisa");
	opcao = leia.nextInt();
	
	if (opcao =='1')
	{
		System.out.println("O produto escolhido foi: "+produto+ " e o valor a ser pago é: "+valorProduto*qtde );
	}
	if (opcao =='2')
	{
		System.out.println("O produto escolhido foi: "+produto1+ " e o valor a ser pago é: "+valorProduto1*qtde1 );
	}
	if (opcao =='3')
	{
		System.out.println("O produto escolhido foi: "+produto2+ " e o valor a ser pago é: "+valorProduto2*qtde2 );
	}
	
}
}