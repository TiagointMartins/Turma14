package lista5;
import java.math.*;
import java.util.Scanner;

public class lista5Exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double peso, altura, imc=0;
		
		System.out.println("VAMOS CALCULAR SEU IMC!");
		System.out.println("Informe seu peso: ");
		peso = leia.nextDouble();
		System.out.println("Informe sua altura: ");
		altura = leia.nextDouble();
		imc = peso/Math.pow(altura, 2);
		
		if(imc < 18.5) {
			System.out.printf("IMC: " +imc," abaixo do peso");
		} else if(imc >=18.5 && imc < 25) {
			System.out.printf("IMC: " +imc," normal");
		} else if(imc>=25 && imc <=30) {
			System.out.printf("IMC: " +imc," acima do peso");
		} else {
			System.out.printf("IMC: " +imc," indica obesidade");
		}
	}
}