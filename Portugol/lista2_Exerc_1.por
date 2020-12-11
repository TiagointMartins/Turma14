programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		//variaveis
		real colheitaDiaria, multa, Excesso
	
		//eentradas de dados
		escreva("Digite o peso da colheita de hoje: ")
		leia(colheitaDiaria)

		//processamento
		
		Excesso = (colheitaDiaria - 50)
		multa = (Excesso * 4)  
		
		se (colheitaDiaria<50)
		{
		escreva("O peso excedido é Zero") 
		escreva("\n A Multa é Zero")	
		}
		senao 
		{
		escreva("O valor da multa é: ", multa, " reais")
		escreva("\nO excesso é de: ", Excesso, " Kg")
		}
		
	
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 323; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */