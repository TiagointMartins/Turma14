package lista2;

import java.util.*;
import java.lang.Math;


public class lista2Exercicio3 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	double N1, N2, N3, N4 ;
	
	System.out.println("Informe o primeiro numero: ");
	N1 = leia.nextDouble();
		
	System.out.println("Informe o segundo numero: ");
	N2 = leia.nextDouble();		
			
	System.out.println("Informe o terceiro numero: ");
	N3 = leia.nextDouble();	
			
	System.out.printf("Informe o quarto numero: ");
	N4 = leia.nextDouble();	
	
	if (Math.pow(N3, 2) >= 1000)
	{
		System.out.printf("O numero "+N3+ " ao quadrado é: "+N3*N3);
	}
	
	else
	{
		System.out.printf("O numero "+N1+ " ao quadrado é: "+N1*N1);
		pula();
		System.out.printf("O numero "+N2+ " ao quadrado é: "+N2*N2);
		pula();
		System.out.printf("O numero "+N3+ " ao quadrado é: "+N3*N3);
		pula();
		System.out.printf("O numero "+N4+ " ao quadrado é: "+N4*N4);
	}
	
	
	}
		public static void pula()
		{
			System.out.println("\n");
		}
}
