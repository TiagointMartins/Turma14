package lista2;

import java.util.Scanner;
import java.lang.*;

public class lista2Exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Informe sua idade: ");
		idade = leia.nextInt();
		
		if ((idade >=7) && (idade<=7))
		{
			System.out.println("Voc� faz parte da categoria: Infantil A");
		}
		else if ((idade >=8) && (idade<=11))
		{
			System.out.println("Voc� faz parte da categoria: Infantil B");
		}
		else if ((idade >=12) && (idade<=13))
		{
			System.out.println("Voc� faz parte da categoria: Juvenil A");
		}
		else if ((idade >=14) && (idade<=17))
		{
			System.out.println("Voc� faz parte da categoria: Juvenil B");
		}
		else if(idade >=18)
		{
			System.out.println("Voc� faz parte da modalidade: Adulto");
		}
		
		else 
		{
			System.out.println("A idade n�o pode ser negativa");
		}
	}


}