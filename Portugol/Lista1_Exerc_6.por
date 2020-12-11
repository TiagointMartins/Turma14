programa
{
	inclua biblioteca Matematica -->mat//apelido
	funcao inicio()
	{
		//variaveis
		real d, X1=0.0, X2=0.0, Y1=0.0, Y2=0.0, D=0.0, p1=0.0, p2=0.0
		 
		 //entradas
		 escreva( "Valor de X1: ")
		 leia(X1)
		 escreva( "Valor de X2: ")
		 leia(X2)
		 escreva( "Valor de Y1: ")
		 leia(Y1)
		 escreva( "Valor de Y2: ")
		 leia(Y2)

		 //calculos
		 p1 = mat.potencia((X2-X1),2))
		 p2 = mat.potencia((Y2-Y1),2))
		  d = mat.raiz((p1 + p2),2)
		  escreva("Valor de distância é: ", d)
		 		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 254; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */