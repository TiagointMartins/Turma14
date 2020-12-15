package lista6;

import java.util.Scanner;

public class lista6Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		Eletronico celular = new Eletronico ();
		
		System.out.println("Informeo modelo do Celular: ");
		celular.modelo = leia.nextLine();
		System.out.println("Informe o valor do celular: ");
		celular.valor = leia.nextInt();
		celular.Frase();
		
	}

}
