programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		//Variaveis
		real ValorCarro, custoConsumidor, porcentagemDistribuidor, custoFabrica, imposto
		//entrada de dados
		
		escreva("\Digite o valor de um carro novo: ")
		leia(ValorCarro)

		custoFabrica = (ValorCarro*27/100)
		escreva("\nO custo de fabrica de um carro novo é: ", custoFabrica) 

		porcentagemDistribuidor = (custoFabrica*28/100)
		escreva("\nA porcentagem do Distribuidor sobre um carro novo é: ", porcentagemDistribuidor) 
		imposto = (custoFabrica*45/100)
		escreva("\nO imposto sobre o valor de um carro novo é: ", imposto)
		escreva("\nO valor sem imposto de um carro novo seria: ", ValorCarro-imposto)
		
		
		
	}sy
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 74; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */