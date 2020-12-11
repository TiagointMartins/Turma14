programa
{
	inclua biblioteca Util
	funcao pula()
	{
		escreva("\n")
	}
	funcao linha()
	{
		escreva("☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺\n")
	}
	
	funcao inicio()
{
		inteiro valores1[2][2],valores2[2][2]

		valores1[0][0] = 10
		valores1[0][1] = 9
		valores1[1][0] = 5
		valores1[1][1] = 8
		
	escreva("MATRIZ VALORES 1\n")
	linha()	
 	
			para (inteiro linha = 0 ; linha< 2; linha++)//LINHA MATRIZ
	{
		para (inteiro coluna =0; coluna<2; coluna++)//COLUNA DA MATRIZ
		{
			
			escreva(valores1[linha][coluna], " ")
		}
		escreva("\n")
	}
	pula()
	 	escreva("MATRIZ VALORES 2\n")
 		linha()
	para (inteiro linha = 0 ; linha< 2; linha++)//LINHA MATRIZ
	{
		para (inteiro coluna =0; coluna<2; coluna++)//COLUNA DA MATRIZ
		{
			valores2[linha][coluna] = Util.sorteia(0,9)
			escreva(valores2[linha][coluna], " ")
		}
		escreva("\n")
	}
	
	
	// SOMATÓRIO DAS MATRIZES

	
}


}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 515; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */