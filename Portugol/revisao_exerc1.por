programa
{
	funcao linha()
	{
		escreva("--------------------------------------\n")
	}
	funcao pula()
	{
	escreva("\n")
	}
	
	funcao inicio()
	{
		real produto = 0.0, desconto =0.0
		real pagamentoAvista= 0.2//20% de desconto
		real pagamentoCredito= 0.15//15% de desconto
		real pagamento2x = produto
		real pagamento3x = 0.1 + produto
		caracter opcao , opcaoCompra
		
		
		escreva("========LOJINHA do TODYNHO =========\n")
		escreva("======= Olá Queride CLIENTE ========\n")
		escreva("====================================\n")
	
		escreva("Qual o valor do Produto ? R$ ")
		leia(produto)
		escreva("Qual a forma de pagamento ?\n")
		escreva("[1] - À vista, [2]-Crédito, [3]- 2 parcelas ou [4]- 3 parcelas: ")
		leia(opcao)
		pula()
		pula()
		
		 	se (opcao =='1')
			{
				escreva("\nO valor do produto é: R$ ",produto )
				pula()
				desconto = produto*0.2
				escreva("O valor do desconto é: R$ ",desconto)
				pula()
				linha()
				escreva("O valor da sua compra é: R$ ",produto - desconto) 
				pula()
				linha()
				escreva("Efetue seu pagamento")
				pula()
			}
			senao se (opcao =='2')
			{
				escreva("O valor do produto é: R$ ",produto )
				desconto = produto*0.15
				pula()
				escreva("O valor do desconto é: R$ ",desconto)
				pula()
				linha()
				escreva("O valor da sua compra é: R$ ",produto - desconto) 
				pula()
				linha()
				escreva("Efetue seu pagamento")
				pula()
			}
			senao se(opcao =='3')
			{
				escreva("O valor do produto é: R$ ",produto )
				pula()
				linha()
				escreva("O valor da sua compra é: R$ ",produto) 
				pula()
				linha()
				escreva("Efetue seu pagamento")
				pula()
			}
			senao se(opcao =='4')
			{
				escreva("O valor do produto é: R$ ", produto * 0.1 + produto )
				pula()
				linha()
				escreva("O valor da sua compra é: R$ ",produto) 
				pula()
				escreva("Efetue seu pagamento")
				pula()
				
			}
		  pula()
		  escreva("FIM DA SUA COMPRA")
		  pula()
		  escreva("Agradecemos a preferência")
		  pula()
		  linha()
			
		} 
		
	}







/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 612; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */