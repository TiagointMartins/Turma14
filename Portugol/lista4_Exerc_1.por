programa
{
	funcao pula()
	{
		escreva("\n")
	}
	funcao linha()
	{
		escreva("------------------------------\n")
	}
	funcao inicio()
{

	//VARIAVEIS

	cadeia valorDigitado[5] 
	inteiro X

	valorDigitado[0] = "Pontuação 1"
	valorDigitado[1] = "Pontuação 2"
	valorDigitado[2] = "Pontuação 3"
	valorDigitado[3] = "Pontuação 4"
	valorDigitado[4] = "Pontuação 5"
	
		para (X = 0; X<5;X++)
	{
	escreva("Digite sua ",valorDigitado[X],": ")
	leia(valorDigitado[X])		
	}
	
		para (X = 0; X<5;X++)
	{	
		escreva("\nValor Pontuação ",X+1,": ",valorDigitado[X])
	}


	escreva	
	pula()
	linha()
	escreva("FIM DO PROGRAMA\n")




}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 563; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */