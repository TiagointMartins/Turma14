package lista1;

import java.lang.Math;
import java.util.Scanner;

public class lista1Exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double distancia, X1,X2, Y1, Y2, D, P1, P2;
		
		System.out.println("Informe o valor de X1: ");
		X1 =  leia.nextDouble();
		
		System.out.println("Informe o valor de Y1: ");
		Y1 =  leia.nextDouble();
		
		System.out.println("Informe o valor de X2: ");
		X2 =  leia.nextDouble();
		
		System.out.println("Informe o valor de Y2: ");
		Y2 =  leia.nextDouble();
		
		P1 = (X2 - X1)* (X2 - X1);
		P2 = (Y2 - Y1)* (Y2 - Y1);
		distancia = (P1 + P2) * (P1 + P2);
		System.out.println("O valor de dist�ncia �: "+distancia);
		
	}
	
}
