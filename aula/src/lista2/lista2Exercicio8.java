package lista2;

import java.util.Scanner;

public class lista2Exercicio8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		Double numero;
		
		System.out.println("Informe um n�mero: ");
		numero = leia.nextDouble();
		
		if (numero > 100)
		{
			System.out.println("Voc� informou o N�: "+numero);			
		}
		else  
		{
			System.out.println("O n�mero � ZERO");
		}
 
	}

}
