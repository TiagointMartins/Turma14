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
			System.out.println("O peso excedido � zero");
			System.out.println(" A multa � zero");
		}
		
		else 
		{
			System.out.println("O valor a multa �: "+multa+" reais");
			System.out.println("O excesso � de: "+excesso+ " KG");
		
		}
		
	}
	
}
