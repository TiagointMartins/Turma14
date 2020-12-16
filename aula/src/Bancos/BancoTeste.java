package Bancos;

import java.util.Scanner;

public class BancoTeste 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		double valorDebito, valorCredito;
		int conta, data;
	/*	
	System.out.println("Digite o numero da conta: ");
	conta = leia.nextInt();
	System.out.println("Informe o cpf da conta: ");
	String cpf=leia.next();
	System.out.println("Informe a data de aniversário da conta: ");
	data = leia.nextInt();
	
	
	ContaPoupanca pop1 = new ContaPoupanca(conta,cpf,data);
	
	System.out.println(pop1.getSaldo());	
	System.out.println("Informe o valor do Crédito: ");
	valorCredito = leia.nextDouble();
	pop1.credito(valorCredito);;
	System.out.println("SALDO ATUAL: "+pop1.getSaldo());
	System.out.println("Informe o valor do Débito: ");
	valorDebito = leia.nextDouble();
	pop1.debito(valorDebito);
     */	
		
	ContaPoupanca pop1	= new ContaPoupanca(1,"111",1);
	ContaCorrente corre1 = new ContaCorrente(13);
	ContaEspecial chique1 = new ContaEspecial(10,5000);
	System.out.println("TESTE 1");
	System.out.println("SALDO CONTA POUPANÇA: "+pop1.getSaldo());
	System.out.println("SALDO CONTA CORRENTE: "+corre1.getSaldo());
	
	System.out.println("TESTE 2");
	pop1.credito(1000);
	corre1.credito(1000);	
	chique1.credito(500);	
	System.out.println("SALDO CONTA POUPANÇA: "+pop1.getSaldo());
	System.out.println("SALDO CONTA CORRENTE: "+corre1.getSaldo());
	System.out.println("SALDO CONTA ESPECIAL: "+chique1.getSaldo()+ " LIMITE DA CONTA: "+chique1.getValorLimite());

		
	System.out.println("TESTE 3");	
	pop1.debito(900);	
	corre1.debito(1001);
	chique1.debito(2500);
	System.out.println("SALDO CONTA ESPECIAL: "+chique1.getSaldo()+ " LIMITE DA CONTA: "+chique1.getValorLimite());
	
		
	}

}
