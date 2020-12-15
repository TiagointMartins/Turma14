package lista6;

import java.util.Scanner;

public class lista6Exercicio1 {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
		
		
	Cliente cliente = new Cliente();	
	System.out.println("Informe seu nome: ");
	cliente.nome = leia.nextLine();
	System.out.println("Olá, "+cliente.nome);
	System.out.println("Informe sua data de seu Nascimento: ");
	cliente.anoNascimento =leia.nextInt();
	System.out.println("Informe o ano Atual: ");
	int anoAtual = leia.nextInt();
	cliente.idade(anoAtual);
	
	/*System.out.println("");
	System.out.println("Você se indêtifica como: [M]-Masculino, [F]-Feminino ou [O]-Outro ?");
	cliente.genero=leia.next().toUpperCase().charAt(0);
	System.out.printf("Informe seu CPF: ");
	leia.nextLine();
	cliente.cpf = leia.nextLine();
	
	*/}

}
