package lista4;

import java.util.Random;

public class lista4Exercicio2 {

	public static void main(String[] args) {
		int lancamento [] = new int [10];
		double media =0;
		int cont =0; 
		int maiorValor =0;
		int contMaior =0;
		double total=0;
		
	Random aleatorio = new Random ();
	
	for (int i=0; i <10; i++)
	{
			cont++;
			lancamento [i] = aleatorio.nextInt(5)+1;
			System.out.print(+lancamento[i]+ "|");
			
			total +=lancamento[i];
			if (maiorValor<lancamento[i])
			{
			maiorValor=lancamento[i];
			}
	}
		
	
			for(int i=0; i<10; i++)
	{
			if (lancamento[i]==maiorValor)
			{
			contMaior++;
			}
	}
	
	media=(total/cont);
	System.out.printf("\nA media dos valores �: %.2f" ,media);
	System.out.println("\nO maior valor foi: "+maiorValor + " e ele saiu " +contMaior);
	
	}

}
