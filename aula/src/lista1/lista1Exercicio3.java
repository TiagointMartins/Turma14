package lista1;

import java.util.Scanner;

public class lista1Exercicio3 {
	
	public static void main(String[] args) 
	{
		//variaveis
		
		Scanner leia = new Scanner (System.in);
		int tempoSegundos;
		int horas;
		int minutos; 
		int segundos;
		
		System.out.println("Digite o tempo em segundos : ");
		tempoSegundos = leia.nextInt();
	
		horas = (tempoSegundos / 3600);
		System.out.println("\nHora[s]: " + horas);	
		minutos = ((tempoSegundos%3600)/60);
		System.out.println("\nMinuto[s]: " + minutos);
		segundos = ((tempoSegundos%3600)%60);
		System.out.println("\nSegundo[s]: " + segundos);
		
		
		
	
	leia.close();
	
	}
}