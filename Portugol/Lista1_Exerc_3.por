programa
{
	inclua biblioteca Matematica 
	funcao inicio()
		{
		//variaveis
	inteiro tempoSegundos,horas, minutos, segundos 
		//entradas
		
	escreva("Digite o tempo em segundos : ") 
	leia(tempoSegundos)
	
	//processamentos
	
	horas = (tempoSegundos / 3600) // dowcasting
	escreva("\nHora[s]: ", horas)
	minutos = ((tempoSegundos%3600)/60)
	escreva("\nMinuto[s]: ", minutos)
	segundos = (( tempoSegundos%3600)%60)
	escreva("\nSegundo[s]: ", segundos)
}
		}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 182; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */