programa
{
	inclua biblioteca Matematica 
	funcao inicio()
	{
		cadeia nome
		real N1, N2, N3, media

		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Digite sua primeira nota: ")
		leia(N1)
		escreva("Digite sua segunda nota: ")
		leia(N2)
		escreva("Digite sua terceira nota: ")
		leia(N3)
		
		media=(N1+N2+N3)/3)
		limpa()
		se (media>=7.0)
		{
			escreva("Aluno: ",nome,", parabéns você foi aprovado, com nota: ", Matematica.arredondar(media,2))
		}
		senao se (media>=4 e media<7)
		{
			escreva("Aluno: ",nome,",Você não passou ainda, está de recuperação, sua nota é: ", Matematica.arredondar(media,2))
		}
		senao
		escreva("Aluno: ",nome,",você foi reprovado, sua nota é: ", Matematica.arredondar(media,2))
		 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 282; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */