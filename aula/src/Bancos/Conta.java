package Bancos;

public abstract class Conta {
	//ATRIBUTOS
		private int numeroConta;
		private double saldo;
		protected String cpf;
		
		
			
		{
			this.numeroConta = numeroConta;
		}
		//*SOBRECARGA
		public Conta(int numeroConta, String cpf)
		{
			this.numeroConta = numeroConta;
			this.cpf = cpf;
		}
		
		
		//ENCAPSULAMENTO
		public int getNumeroConta() {
			return numeroConta;
		}

		
		public double getSaldo() {
			return saldo;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		
		
		//METODOS PROPRIOS
		
		public void debito(double valorDebito) 
		{
			if (testarSaldo(valorDebito))  
			{
				this.saldo = this.saldo - valorDebito;
			} 
			else
			{
				System.out.println("SALDO INDISPONIVEL");
			}
			
			
		}
		
		
		
		public void credito (double valorCredito) 
		{
			this.saldo = this.saldo + valorCredito;
		}
		
		public boolean testarSaldo(double valor) 
		{
			
			boolean teste;
			if (valor <= this.saldo) {
				teste = true;
			} else {
				teste = false;
			}
			
			return teste;
		}
		
		
	}