programa
{
	
	funcao inicio()
	{
		//escreva("Olá Mundo")

		//Exercicio 1 - Faça Enquanto

		/*
1- Faça um programa que mostre uma contagem na tela de 233 a 456, 
só que contando de 3 em 3 quando estiver entre 300 e 400 
e de 5 em 5 quando não estiver.		 		  
		 */
 
      /*inteiro num = 233

      escreva(num)

      		faca{

      se(num >= 300 e num <= 400){
      	num += 3

     
      }senao{
      	num += 5
      }

      escreva("\n", num)
      			
      		}enquanto(num <= 456) */


      		//Exercicio 2 -Faça Enquanto

      		/*
2- Faça um programa que pegue um número do teclado e calcule a soma de todos
os números  de 1 até ele. 
Ex.: o usuário entra 7, o programa vai mostrar 28, 
pois  1+2+3+4+5+6+7=28.      		 
      		 */

     /* inteiro num, resultado=0, aux

      escreva("DIGITE UM NUMERO PARA CALCULARMOS A SOMA DE 1 ATÉ ELE: ")
      leia(num)

      aux = num

      faca{
      	resultado += num
      	num-- //num = num - 1
      }enquanto(num >0)

      escreva("A soma de 1 até ", aux, " é: ", resultado) */


      // Exercicio 2 - Enquanto

     /* 
2- Obtenha um número digitado pelo usuário e repita a operação de 
multiplicar ele por três  (imprimindo o novo valor) até que ele 
seja maior do que 100. Ex.: se o usuário digita 5,  
deveremos observar na tela a seguinte sequência: 5 15 45 135.        
      */

      /* inteiro num
      
      escreva("Digite um numero: ")
      leia(num)

      escreva(num)

      enquanto(num <= 100){

      	num *= 3 //num = num * 3
      	escreva("\n",num)
      } */

      //Exercicio 2 - Para

      /*
2- Desenvolver um sistema que efetue a soma de todos os números 
ímpares que são  múltiplos de três e que se encontram no conjunto dos 
números de 1 até 500.               
       */

      inteiro soma = 1

      para(inteiro i = 1; i <= 500; i++){

      	se(i % 2 != 0 e i % 3 == 0){
      		//i der o resultado de zero ele vai ser par E se der qq numero diferente de zero ele é impar
           soma += i
      		
      	}
      }
       escreva("A soma dos numeros impares e divisiveis por 3, de 1 até 500, é de: ", soma)
//posso chamar o i de qualquer coisa. ex: X, N...

            
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2194; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */