package exemplos;

import java.util.Scanner;



public class times {

	public static void main(String[] args) {
		//Santos, Corinthians, Plameiras e S�o Paulo
		//
		
		Scanner leia = new Scanner(System.in);
		String times[] = {"Santos", "Corinthians", "Palmeiras", "S�o Paulo"};
		int pontos[] = new int [4];
		
		for (int indice = 0; indice <4 ; indice ++)
		{
			System.out.printf("Time %s", times[indice]);
			System.out.println("Quantos pontps 3/1/0, ");
			
			pontos[indice] = leia.nextInt();
		}
				

		
		
	}
}
