package lista2;

import java.util.*;
import java.lang.Math;

public class lista2Exericio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Informe um numero: ");
		numero = leia.nextInt();
		
		System.out.println(((numero % 2)==0)?"Valor é par!!!":"Valor é impar!");
		
		if (numero > 0)
		{
			System.out.println("Valor é Positivo!");
		}
		else 
		{
			System.out.println("Valor é Negativo!");
		}
		
			
	}
	
	public static void linha()
	{
		System.out.println("-");
	}

}
