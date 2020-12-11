programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
	
		real celsius, fahrenheit

		escreva("Digite a temperatura atual em Celsius: ")
		leia(celsius)
		fahrenheit = ((celsius*1.8)+32)

		escreva("A temperatura em Graus Fahrnheit é: ", Matematica.arredondar(fahrenheit,2)+ "° Fahrenheit")
	}		
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 221; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */