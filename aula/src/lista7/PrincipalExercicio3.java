package lista7;

import java.util.Scanner;

public class PrincipalExercicio3 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int salarioBase, codigoSetor;
	String nome;
	int imposto ;
	
	
	
	Empregado colaborador = new Empregado("Geandro");
	System.out.print("Informe o código de setor: ");
	codigoSetor = leia.nextInt();
	colaborador.setCodigoSetor(codigoSetor);
	System.out.print("Qual o salário base do colaborador "+colaborador.getNome()+": R$ ");
	salarioBase = leia.nextInt();
	colaborador.setSalarioBase(salarioBase);
	System.out.println("\n COLABORADOR: "+colaborador.getNome()+ "\n CÓDIGO SETOR: "+colaborador.getCodigoSetor()+"\n SALÁRIO BASE: "+colaborador.getSalarioBase());
	System.out.println("Com o débito de impostos o salário do colaborador "+colaborador.getNome()+" é: R$"+colaborador.calculaSalario());
	
	
	
	
	}

}