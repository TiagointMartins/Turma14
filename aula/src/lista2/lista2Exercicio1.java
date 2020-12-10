package lista2;

import java.lang.Math;
import java.util.*;

public class lista2Exercicio1 {
 
	public static void main(String[] args)
	{
	int colheitaDiaria, multa, excesso;
	
		Scanner leia = new Scanner (System.in);	
		System.out.println("Digite o peso da colheita: ");
		colheitaDiaria = leia.nextInt();
		
		//processamento
		
		excesso = (colheitaDiaria - 50);
		multa = (excesso * 4);
		
		if (colheitaDiaria<50)
		{
			System.out.println("O peso excedido é zero");
			System.out.println(" A multa é zero");
		}
		
		else 
		{
			System.out.println("O valor a multa é: "+multa+" reais");
			System.out.println("O excesso é de: "+excesso+ " KG");
		
		}
		
	}
	
}
