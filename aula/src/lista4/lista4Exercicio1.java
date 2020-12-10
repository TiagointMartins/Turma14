package lista4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class lista4Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		DecimalFormat df= new DecimalFormat("#.00");
		double pontuacao [] = new double [5];
		double maior =0;
		System.out.printf("Vetor pontuação[]: ");
		for (int i=0; i<5 ; i++ )
		{
			pontuacao[i]=Math.random()*10;
			
			if (maior < pontuacao[i])
			{
				maior = pontuacao[i];
			}
			System.out.printf(df.format(pontuacao[i])+ " | ");
		}
		System.out.println("\nO maior valor é: "+df.format(maior));
		
		
		
		
		
		
		
	}

}
