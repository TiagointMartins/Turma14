programa
{
	inclua biblioteca Matematica
	funcao linha()
	{
		escreva("----------------------------------------\n")
	}
	funcao pula()
	{
	escreva("\n")
	}
	funcao inicio()
	{
		real IMC = 0.0
		real peso = 0.0
		real altura =0.0

		escreva("Informe sua altura: ")
		leia(altura)
		escreva("Informe seu peso: ")
		leia(peso)
		IMC = (peso / (altura*altura))
		pula()
		escreva("Seu Indice de Massa corporal é de: ", Matematica.arredondar(IMC,2))
		pula()
		linha()
		se (IMC <= 18.4)
		{
			escreva("Consulte um profissional de saúde")
			pula()
			escreva("    OBS: IMC - abaixo do peso")
		}
		senao se(IMC >= 18.5 ou IMC <=25.0)
		{
			escreva("Consulte um profissional de saúde")
			pula()
			escreva("        OBS: IMC - normal")
		}
		senao se(IMC >= 25.1 ou IMC <= 30)
		{
			escreva("Consulte um profissional de saúde")
			pula()
			escreva("    OBS: IMC - acima do peso")
		}
		senao se(IMC > 30.1)
		{
			escreva("Consulte um profissional de saúde")
			pula()
			escreva("   OBS: IMC - indica Obesidade")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 109; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */