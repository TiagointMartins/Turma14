package lista7;

import java.util.Scanner;

public class PrincipalExercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		String nome, telefone , endereco;
		double valorDivida, valorCredito;
		double obterSaldo;
		
		Pessoa pessoa =  new Pessoa();
		Fornecedor fornecedor = new Fornecedor("Ednirson");
		
		System.out.println("Informe o nome da Pessoa: ");
		nome = leia.nextLine();
		pessoa.setNome(nome);
		System.out.println("Informe o telefone de "+pessoa.getNome());
		telefone = leia.nextLine();
		pessoa.setTelefone(telefone);
		System.out.println("Informe o endere�o de "+pessoa.getNome()+" cujo telefone � "+pessoa.getTelefone());
		endereco = leia.nextLine();
		pessoa.setEndereco(endereco);
		System.out.println("");
		System.out.println("Classe PESSOA com todos os atributos");
		System.out.println("\nNOME: "+pessoa.getNome()+ " \nTELEFONE: "+pessoa.getTelefone()+"\nENDERE�O: "+pessoa.getEndereco());
		
		
		System.out.print("Informe o valor de credito disponibilizado ao fornecedor "+fornecedor.getNome()+ " R$: ");
		valorCredito = leia.nextDouble();
		fornecedor.setValorCredito(valorCredito);
		System.out.print("Informe o valor da d�vida do fornecedor R$: ");
		valorDivida = leia.nextDouble();
		fornecedor.setValorCredito(valorDivida);
		obterSaldo = leia.nextDouble();
		
		System.out.println("Classe FORNECEDOR com todos os atributos");
		System.out.println("\nFORNECEDOR: "+fornecedor+ " \nVALOR DE CR�DITO: R$"+fornecedor.getValorCredito()+ "\n VALOR DE D�VIDA: R$"+fornecedor.getValorDivida()+"\n VALOR DE SALDO: R$"+fornecedor.obterSaldo()+"\n");
		
	}

}
