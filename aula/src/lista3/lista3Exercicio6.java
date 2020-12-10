
package lista3;

import java.util.Scanner;

public class  lista3Exercicio6 {
	public static void main(String[] args) {
		
		int num=0, total=0, numBase=0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numBase = leia.nextInt();
		
		do {
			num++;
			total+=num;
			if(num==numBase) {
				System.out.print(num + " = ");
			}else {
				System.out.print(num + " + ");
			}

		}while(num < numBase);
		System.out.println(total);
		
		leia.close();
	}
}