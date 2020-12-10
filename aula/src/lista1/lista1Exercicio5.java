package lista1;

import java.util.Scanner;

public class lista1Exercicio5{
	
	public static void main(String[] args)
	{
	
	// variaveis
		
	Scanner leia = new Scanner (System.in);
	
	int N1;
	int N2;
	int N3;
	int media;
	
	System.out.println("Informe sua primeira nota: ");
	N1 = leia.nextInt();
	
	System.out.println("Informe sua segunda nota: ");
	N2 = leia.nextInt();
	
	System.out.println("Informe sua terceira nota: ");
	N3 = leia.nextInt();
	
	media = ( N1 + N2 + N3) / 3;
	
	System.out.println("Sua média é: " +media);
	
	
	
	
	
	
	
	
	
	

}

}	