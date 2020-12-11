programa
{

inclua biblioteca Matematica 
	
	funcao inicio()
{
	//variaveis
		inteiro A, B, C, S, R, D
		
		//Entradas de dados
		escreva ("Digite o valor do número A: ")
		leia(A)
		escreva ("Digite o valor do número B: ")
		leia(B)
		escreva ("Digite o valor do número C: ")
		leia(C)

		R = Matematica.potencia((A + B),2) 
		S = Matematica.potencia((B + C),2)
		D = (R + S)/2 

	escreva("\nO valor D é igual à: ", D) 
	escreva("\nO valor S é igual : ", S) 
	escreva("\nO valor R é igual : ", R) 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 105; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */