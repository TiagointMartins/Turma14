package lista5;

import java.util.Scanner;

public class lista5Exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double valorProduto, ajustePreco;
		int opcaoCompra;
		
		System.out.print("Informe o valor do produto: R$");
		valorProduto = leia.nextDouble();
		
		System.out.println("Escolha a forma de pagamento: ");
		System.out.println("[1] - À vista em dinheiro ou cheque"); //(20% de desconto
		System.out.println("[2] - À vista no cartão de crédito"); //1 5% de desconto
		System.out.println("[3] - Duas vezes"); //sem juros
		System.out.println("[4] - Três vezes");//juros de 10%
		opcaoCompra = leia.nextInt();
		
		if(opcaoCompra == 1) 
		{
			ajustePreco = valorProduto-(valorProduto*0.2);
			System.out.println("O preço a ser pago será de: R$" + ajustePreco);
		} 
		else if(opcaoCompra == 2) 
		{
			ajustePreco = valorProduto - (valorProduto*0.15);
			System.out.println("O preço a ser pago será de: R$" + ajustePreco);
		} 
		else if(opcaoCompra == 3) 
		{
			ajustePreco = valorProduto/2;
			System.out.println("O preço a ser pago será de: R$" + ajustePreco);
		} else if(opcaoCompra == 4) 
		{
			ajustePreco = (valorProduto + (valorProduto*0.1));
			System.out.printf("O preço a ser pago será de: R$"+ ajustePreco);
		} 
		else
		{
			System.out.println("opção inválida!");
		}
		
		
	}
}