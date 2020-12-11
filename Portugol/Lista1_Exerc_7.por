programa
{
	inclua biblioteca Matematica --->Mat
	funcao inicio()
	{
		//variaveis
	real A,X,B,Y,D,E,F,C

		//Entrada de Dados
		
		escreva("Digite o valor de A: ")
		leia(A)
		escreva("Digite o valor de B: ")
		leia(B)
		escreva("Digite o valor de C: ")
		leia(C)
		escreva("Digite o valor de D: ")
		leia(D)
		escreva("Digite o valor de E: ")
		leia(E)
		escreva("Digite o valor de F: ")
		leia(F)
		escreva("Digite o valor de X: ")
		leia(X)
		escreva("Digite o valor de Y: ")
		leia(Y)

		//Atribuições
		C = (A*X)+(B*Y)
		F = (D*X)+(E*Y)
		X=((C*E)-(B*F))/((A*E)-(B*D))
		Y=((A*F)-(C*D))/((A*E)-(B*D))

		escreva("\n O valor de C é: ", C )
		escreva("\n O valor de F é: ", F )
		escreva("\n O valor de X é: ", X )
		escreva("\n O valor de Y é: ", Y )
		
		
		
		


	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 758; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */