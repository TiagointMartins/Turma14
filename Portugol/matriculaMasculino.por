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
	
		//G( n grupo - n matricula )
		cadeia alunos [] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira"," Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles","HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almenara","Vinicius Alves Miranda"}
		caracter sexos [39] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M'}
		cadeia matricula [39]
		real notas [39] = {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0}
		cadeia ALUNO
		caracter tipoGenero
		caracter tipo = 'S'
		
		para(inteiro i = 0; i<39; i++){
			se(i<9){
				matricula[i] = "G3-0" + (i+1))
			}senao{
				matricula[i] = "G3-" + (i+1))
			}
			
		}

		para(inteiro i = 0; i<39; i++)
		{
			escreva("Matricula: ", matricula[i], " - ",alunos[i],"\n")
		
		}
		
		faca{
		escreva("\n\nLISTA DE ALUNOS APROVADOS\n")
		linha()
		pula()
		linha()
		escreva("Deseja ver a lista de gêneros [M]-masculino ou [F]- Feminino ?: " )
		leia (tipoGenero)

		
		para(inteiro i = 0; i<39; i++)
		{
				se(tipoGenero == 'M' ou tipoGenero == 'm')
				{
		   		se (sexos[i] == 'M' ou sexos[i] == 'm')
				{
				funcao pula()
				escreva("Nome Aluno: ", alunos[i], "/ sexo - ", sexos[i])
				}
				}
				senao se (tipoGenero == 'F' ou tipoGenero == 'f')
				{
					se (sexos[i] == 'F' ou sexos[i] == 'f')
				{
				funcao pula()
				escreva("Nome Aluna: ", alunos[i], "/ sexo - ", sexos[i])
				}
				}
			   
		}		
			escreva("Deseja continuar?  S/N: ")
			leia(tipo)
		}enquanto(tipo == 'S')

		limpa()
		
		para(inteiro i = 0; i<39; i++)
		{
			se(notas[i] != 0.0){
			se(sexos[i] == 'M' e notas[i] <= 5)
			{
				
				escreva("Nome Aluno: ", alunos[i], "/ sexo - ", sexos[i] , " , Nota: ", notas[i], " - Reprovado\n")
				
				}senao se (sexos[i] == 'F' e notas[i] <= 5) 
				{
					escreva("Nome Aluna: ", alunos[i], "/ sexo - ", sexos[i], " , Nota: ", notas[i], " - Reprovada\n")
				}senao se(sexos[i] == 'M' e notas[i] > 5 e notas[i] < 8)
				{
					escreva("Nome Aluno: ", alunos[i], "/ sexo - ", sexos[i] , " , Nota: ", notas[i], " - Recuperação\n")
				}senao se (sexos[i] == 'F' e notas[i] > 5 e notas[i] < 8)
				{
					escreva("Nome Aluna: ", alunos[i], "/ sexo - ", sexos[i], " , Nota: ", notas[i], " - Recuperação\n")
				}senao se(sexos[i] == 'M' e notas[i] > 8)
				{
					escreva("Nome Aluno: ", alunos[i], "/ sexo - ", sexos[i] , " , Nota: ", notas[i], " - Aprovado\n")
				}senao se (sexos[i] == 'F' e notas[i] > 8) 
				{
					escreva("Nome Aluna: ", alunos[i], "/ sexo - ", sexos[i], " , Nota: ", notas[i], " - Aprovada\n")
					
				}
				
			}
		
		}
		para(inteiro i = 0; i<39; i++)
			{
			se(sexos[i] == 'M' e notas[i] > 5)
			{
			escreva("Nome Aluno: ", alunos[i], "/ sexo - ", sexos[i] , " , Nota: ", notas[i], " - Aprovado\n")
		

			}
			}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 88; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */