package lista1;

import java.util.Scanner;

public class lista1Exercicio4 {
	
	public static void main(String[] args) 
	{
		//variaveis
		
		Scanner leia = new Scanner (System.in);
		int A;
		int B;
		int C; 
		int S;
		int R;
		int D;
		
		System.out.println("Digite o valor de A : ");
		A = leia.nextInt();

		System.out.println("Digite o valor de B : ");
		B = leia.nextInt();
		
		System.out.println("Digite o valor de C : ");
		C = leia.nextInt();
		
		R = (A + B) * (A + B);
		S = (B + C) * (B + C);
		D = (R + S)/2;
		
		System.out.println("O valor de D é igual à: "+D);
		System.out.println("O valor de S é igual à: "+S);
		System.out.println("O valor de R é igual à: "+R);
		
		
		
		
		
		
	}
	
}	