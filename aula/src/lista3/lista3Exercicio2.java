
package lista3;

public class lista3Exercicio2 {
	public static void main(String[] args) {
		int i=1;
		for(i=1; i<500; i++) {
			if(i%2!=0 && i%3==0) {
				
				i+=i;
				
			}
		}
		System.out.println("A soma dos números ímpares multiplos de 3 é: " + i);
	}
}