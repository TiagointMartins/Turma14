
package lista3;

import java.util.Scanner;

public class lista3Exercicio3 {
	public static void main(String[] args) {
		double num=0.0, numFornecido=0.0;
		int cont=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor num�rico: ");
		numFornecido = leia.nextDouble();
		
		while(numFornecido > 0) {
			cont++;
			num+=numFornecido;
			
			System.out.println("Digite outro valor num�rico: ");
			numFornecido = leia.nextDouble();
		}
		
		System.out.println("O somat�rio total dos valores fornecidos �: " + num);
		System.out.println("A m�dia dos valores lidos �: " + num/cont);
		System.out.println("O total de valores lidos �: " + cont);
		
		leia.close();
	}
	
	
}