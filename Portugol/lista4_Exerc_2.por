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
	{
		inteiro lancamentoDado[10], X
		inteiro maiorLancamento = 0
		inteiro repeticaoMlance, media

		para (X = 0; X<10;X++)
{
		
	escreva("Digite o resultado do lance ",X+1,": ")
	leia(lancamentoDado[X])		

		se (maiorLancamento<lancamentoDado[X])
		{
		maiorLancamento =  lancamentoDado[X]
		}

}
	
		para (X = 0; X<10;X++)
	{	
		escreva("\nValor Lançamento ",X+1,": ",lancamentoDado[X])
	}

	pula()
	linha()
	
	escreva("\nO maior resultado de lançamento é: ",maiorLancamento) 
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
 * @POSICAO-CURSOR = 432; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */