programa
{
    funcao inicio()
    {
        const cadeia numeroConta= "0001"
        real saldo=0.00, valor=0.0
        const cadeia NOMEUSUARIO= "Tesla"
        const cadeia CPF= "400.765.828-23"
        cadeia movimentacoes[10]
	   inteiro DATA = 0
	   real limiteEmprestimo = 5000
	   caracter opcao = '0', dia
	  
        //nome, conta, cpf, saldo
	    escreva("======== Banco Grupo 3 ==========\n")
	    escreva("Olá ", NOMEUSUARIO, "\n")
	    escreva("NÚMERO DA CONTA: ", numeroConta, "\n")
	    escreva("CPF: ", CPF, "\n")
	    escreva("SALDO: ", saldo, "\n")
	    escreva("=================================\n")
	    faca
	    {
	    	para(inteiro i=0 ; i<10 ; i++)
	    	{
	    		escreva("\n",NOMEUSUARIO," deseja fazer um [1]saque um [2]depósito ou um [3]emprestimo ")
	    		leia(opcao)
	    		se(opcao == '1') {
	    			escreva("Entre com o valor do saque: ")
	    			leia(valor)
					se(saldo>=valor) {
						saldo = saldo-valor
						escreva("operação realizada com sucesso\n SALDO ATUAL: ",saldo)
											
					} senao {
						escreva("Saldo insuficiente para saque.\n SALDO ATUAL: ",saldo)
					}
	    			
	    		}
	    		se(opcao == '2') {
				escreva("Entre com o valor do depósito: ")
	    			leia(valor)
				se(valor<0) {
					escreva("Digite um número válido")
				}
				senao {
					saldo = saldo+valor	
					escreva("operação realizada com sucesso.\n SALDO ATUAL: ",saldo)
					
				}
	    		}
	
	    	 	se(opcao == '3') {
				escreva("Entre com o valor do emprestimo: ")
	    			leia(valor)
				se(valor<0) {
					escreva("Digite um número válido")
				}
				senao {
					limiteEmprestimo = limiteEmprestimo-valor
					saldo = saldo + valor
					escreva("operação realizada com sucesso.\n SALDO ATUAL: ",saldo, " seu limite emprestimo é: ", limiteEmprestimo)
	    			}
	  		}
	  	}
	    	  escreva("\nDeseja ir para o próximo dia?\n[S]sim \n[N]não ")
	    	  leia(dia)
	    }
	    enquanto(dia == 'S' ou dia == 's')
	    escreva("\nSaldo atual: ",saldo)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 153; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */