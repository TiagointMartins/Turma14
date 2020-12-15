package lista6;

import java.util.Scanner;

public class lista6Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Aviao aviao=new Aviao();
	
		System.out.println("Informe o Modelo do Avião: ");
		aviao.modelo=leia.nextLine();
		System.out.println("Informe a companhia aérea: ");
		aviao.companhia = leia.nextLine();
		System.out.println("Informe a velocidade do avião: ");
		int velocidadeDecolagem = leia.nextInt();
		aviao.Velocidade(velocidadeDecolagem);
		
	}

}
