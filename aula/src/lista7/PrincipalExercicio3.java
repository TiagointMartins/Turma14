package lista7;

import java.util.Scanner;

public class PrincipalExercicio3 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int salarioBase, codigoSetor;
	String nome;
	int imposto ;
	
	
	
	Empregado colaborador = new Empregado("Geandro");
	System.out.print("Informe o c�digo de setor: ");
	codigoSetor = leia.nextInt();
	colaborador.setCodigoSetor(codigoSetor);
	System.out.print("Qual o sal�rio base do colaborador "+colaborador.getNome()+": R$ ");
	salarioBase = leia.nextInt();
	colaborador.setSalarioBase(salarioBase);
	System.out.println("\n COLABORADOR: "+colaborador.getNome()+ "\n C�DIGO SETOR: "+colaborador.getCodigoSetor()+"\n SAL�RIO BASE: "+colaborador.getSalarioBase());
	System.out.println("Com o d�bito de impostos o sal�rio do colaborador "+colaborador.getNome()+" �: R$"+colaborador.calculaSalario());
	
	
	
	
	}

}