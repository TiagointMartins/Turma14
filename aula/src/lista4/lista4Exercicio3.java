package lista4;

import java.util.Random;


public class lista4Exercicio3 {

	public static void main(String[] args) {
	Random random = new Random();
	
	final int LINHA = 4;
	final int COLUNA = 6;
	int N1[][] = new int [4][6];
	int N2[][] = new int [4][6];
	int M1[][] = new int [4][6];
	int M2[][] = new int [4][6];
	
		
	System.out.println("DADOS DE N1");
	
	System.out.println("Digite a matriz N1:\n");
	
	
	System.out.println("N1");	
	for (int  linha=0; linha<LINHA;linha++)
	{
		System.out.println();
		for (int coluna=0; coluna<COLUNA;coluna++)
		{
			N1[linha][coluna] = random.nextInt(10);
			System.out.print(N1[linha][coluna]+" ");
		}
		
	}
	System.out.println("\n\nN2");
	for (int  linha=0; linha<LINHA;linha++)
	{
		System.out.println();
		for (int coluna=0; coluna<COLUNA;coluna++)
		{
			N2[linha][coluna] = random.nextInt(10);
			System.out.print(N2[linha][coluna]+" ");
		}
		
	}
	 
	System.out.println("\n\nM1");	
	for (int  linha=0; linha<LINHA;linha++)
	{
		System.out.println();
		for (int coluna=0; coluna<COLUNA;coluna++)
		{
			M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna] ;
			System.out.print(M1[linha][coluna]+" ");
		}
	
	}
	System.out.println("\n\nM2");	
	for (int  linha=0; linha<LINHA;linha++)
	{
		System.out.println();
		for (int coluna=0; coluna<COLUNA;coluna++)
		{
			M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna] ;
			System.out.print(M2[linha][coluna]+" ");
		}
	
	}
	
		

	}
	
}
