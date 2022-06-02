programa
{
	
	funcao inicio()
	{
		//Exercicio 6

		real idade
		
		escreva("Digite sua idade: ")
		leia(idade)
		
escreva("\n \n")

          se(idade<5){
               escreva("Sem turma disponivel para esta idade!")
	     }senao se(idade >= 5 e idade <= 7){
			escreva("Turma infantil A")
		}senao se(idade >= 8 e idade <= 11){
			escreva("Turma infantil B")
		}senao se(idade >= 12 e idade <= 13){
			escreva("Turma juvenil A")
		}senao se(idade >= 14 e idade <= 17){
			escreva("Turma juvenil B")
		}senao{
			escreva("Turma maiores de 18 anos")
		}


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 37; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */