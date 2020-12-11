programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		//variaveis
		inteiro X,Tabuada,Resultado

		//entrada de dados
		escreva("Digite o valor da tabuada: ")
		leia(Tabuada)
		//processamento
		para(X=1;X<=10;X++) //O valor inicial será 1  
						//DEPOIS será um teste logico se o valor anterior é IGUAL ou MENOR que 10
						//FInaliza somando 1 (X++ ao VALOR INCIAL DO X 
		{
		Resultado = X * Tabuada
			escreva("\n" ,X," X ", Tabuada ," = ", Resultado)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 381; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */