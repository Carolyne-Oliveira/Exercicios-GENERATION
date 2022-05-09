programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real P, A, IMC

		escreva("Digite seu peso: ")
		leia(P)

		escreva("Digite sua altura: ")
		leia(A)

		IMC = P / (A * A)

		escreva("Seu IMC é: ", IMC)

		escreva("\n\n")

		se(IMC <= 18.4){

	escreva("IMC Baixo")

}senao se(IMC <= 24.9){

	escreva("IMC Normal")

}senao se(IMC <= 29.9){

	escreva("Sobrepesso")
	
}senao se(IMC <= 34.9){

	escreva("Obesidade I")

}senao se(IMC <=39.9){

	escreva("Obesidade II")	
	
}senao{
	
     escreva("Obesidade III")
}
escreva("\n\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 354; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */