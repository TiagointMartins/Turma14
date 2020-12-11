programa
{
	inclua biblioteca Matematica --> mat
	funcao linha()
	{
			escreva("------------------------------")
	}


	funcao pula()
	{
		escreva("\n")
	}
	
	funcao inicio()
	{
		//variáveis
		caracter tipo		
		real raio = 0.0, area = 0.0, base = 0.0, altura = 0.0

		//entrada de dados
		escreva("Escolha uma opção:[1]-Círculo [2]-Triângulo [3]-Retângulo ")
		leia(tipo)
		escolha(tipo)
	{
	
		caso '1':
		escreva("\nVocê escolheu calcular o Raio do Círculo")
		escreva("Digite o raio da circunferência: ")
		leia(raio)
		se(raio > 0)
		{
		area = mat.PI * mat.potencia(raio,2)
		escreva("A área da circunferência é: ",mat.arredondar(area, 2))
		}
		senao
		{
		escreva("valor inválido para o raio de uma circunferência")
		}
		pare
		caso '2':
		escreva("\nVocê escolheu calcular a área do Triângulo")
		escreva("\nDigite a altura: ")
		leia (altura)
		escreva("Digite a base: ")
		leia (base)
		se(altura == 0 ou base == 0)
		{
		escreva("\nImpossível calcular a área se a altura ou base forem 0\n")
		}
		area = (base * altura)/2
		escreva("\nA área deste triângulo é: ", area)	
		pare
		caso '3':
		escreva("Você escolheu calcular a área do retângulo")
		
		pula()
		
		escreva("Digite a altura: ")
		leia(altura)
		escreva("Digite a base: ")
		leia(base)
		
		retangulo(altura,base)
		
		pare
		}
	}
		funcao retangulo(real altura, real base)
		{
			real area=0.0
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
 * @POSICAO-CURSOR = 1291; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */