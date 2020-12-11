programa
{
	inclua biblioteca Matematica--> mat
	funcao inicio()
	{
		
		//variaveis
		
		real altura=0.0, base=0.0, area

		//entrada de dados

		
		escreva("Digite a altura do Retângulo: ")
		leia(altura)
		escreva("Digite a base do Retângulo: ")
		leia(base)

		//processamento
		
		area=( altura * base )
		
		se(base >0 e altura>0)
		{
		escreva("\n A área do Retângulo é: ", area)
		}
		senao
		{
		escreva("Digite um valor maior que zero")
		}
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 398; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */