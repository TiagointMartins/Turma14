package lista2;

import java.util.Scanner;

public class lista2Exercicio7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int base, altura, area;
		
		System.out.println("Informe a altura do Tri�ngulo: ");
		altura = leia.nextInt();
		System.out.println("Informe a Base do Tri�ngulo: ");
		base = leia.nextInt();
		
		area = altura * base;
		if ((altura >0)&&(base>0))
		{
			System.out.println("A a�rea do Tri�ngulo �: "+area);
		}
		else
		{
			System.out.println("N�mero inv�lido");
		}
	}

}
