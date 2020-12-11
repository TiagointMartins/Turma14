programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		real N1, N2, N3, N4
		escreva("Digite o primeiro número: ")
		leia(N1)
		escreva("Digite o segundo número: ")
		leia(N2)
		escreva("Digite o terceiro número: ")
		leia(N3)
		escreva("Digite o quarto número: ")
		leia(N4)
		se(Mat.potencia(N3,2.0) >= 1000.0){
			escreva("O número ", N3," ao quadrado é ",Mat.arredondar(Mat.potencia(N3,2.0),2))
		}
		senao{
			escreva("\nO número ", N1," ao quadrado é ",Mat.arredondar(Mat.potencia(N1,2.0),2))
			escreva("\nO número ", N2," ao quadrado é ",Mat.arredondar(Mat.potencia(N2,2.0),2))
			escreva("\nO número ", N3," ao quadrado é ",Mat.arredondar(Mat.potencia(N3,2.0),2))
			escreva("\nO número ", N4," ao quadrado é ",Mat.arredondar(Mat.potencia(N4,2.0),2))
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 787; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */