fun main() {

//Exercicios

    // 1 - Informar todos os números de 1000 a 1999 que quando divididos por 11
    //obtemos resto = 5. (FOR)


    // 2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)



    // 3 - Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
    //21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
    //idade for =-99. (WHILE)
/*
    var idade = 0
    var pess21 = 0
    var pess50 = 0

    while (idade != -99) {
        println("Digite uma idade: ")
        idade = readln().toInt()

        if (idade != -99) { // Isa fez --> if (idade <= 21 && idade >= 0){ - jovens++
            if (idade < 21)
                pess21++
        } else if (idade > 50) {
            pess50++
        }
    }

    println("O numero de pessoas menores de 21 anos de idade é $pess21")
    println("O numero de pessoas menores de 21 anos de idade é $pess50")
*/


    //4 - Uma empresa desenvolveu uma pesquisa para saber as características
    //psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
    //era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
    //(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
    //agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
    //pessoas, calcule e mostre: (WHILE)
    // o número de pessoas calmas;
    // o número de mulheres nervosas;
    // o número de homens agressivos;
    // o número de outros calmos;
    // o número de pessoas nervosas com mais de 40 anos;
    // o número de pessoas calmas com menos de 18 anos.
/*
    var cont = 0
    var idade = 0
    var sexo = 0
    var opcao = 0
    var pCalmas = 0
    var mNerv = 0
    var hAgr = 0
    var outCalm = 0
    var pNervM40 = 0
    var pCalmM18 = 0

    while (cont < 5) {

        println("***Pessoa ${cont * 1}***")

        println("Digite a idade: ")
        idade = readln().toInt()

        println("Digite o sexo (1-feminino / 2-masculino / 3-outros): ")
        sexo = readln().toInt()

        println(
            "Digite o comportamento: " +
                    "\n(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva"
        )
        opcao = readln().toInt()

        if (opcao == 1) {
            pCalmas++
        }
        if (sexo == 1 && opcao == 2) {
            mNerv++
        }
        if (sexo == 2 && opcao == 3) {
            hAgr++
        }
        if (sexo == 3 && opcao == 1) {
            outCalm++
        }
        if (opcao == 2 && idade > 40) {
            pNervM40++
        }
        if (opcao == 1 && idade < 18) {
            pCalmM18++
        }

        cont++ //para não ser um looping infinito.
    }

    println("O numero de pessoas calmas: $pCalmas")
    println("O número de mulheres nervosas: $mNerv")
    println("O número de homens agressivos: $hAgr")
    println("O número de outros calmos: $outCalm")
    println("O número de pessoas nervosas com mais de 40 anos: $pNervM40")
    println("O número de pessoas calmas com menos de 18 anos: $pCalmM18")
*/

    // 5 - Crie um programa que leia um número do teclado até que encontre um
    //número igual a zero. No final, mostre a soma dos números digitados.

/*
    var soma = 0.0
    var cont = 0

    do{
        println("Digite um numero: ")
        val num = readln().toDouble()
        soma += num

    }while (num != 0 && cont = 0)

    println("A soma de todos os numeros digitados é: $soma")

*/

    // 6 - Escrever um programa que receba vários números inteiros no teclado. E no
    //final imprimir a média dos números múltiplos de 3. Para sair digitar
    //0(zero).(DO...WHILE)
/*
    var soma = 0.0
    var cont = 0

    do{

        print("Digite um numero: ")
        val num = readln().toInt()

        if(num % 3 == 0 && num != 0){
            soma += num
            cont++
        }

    }while(num != 0)

    val media = soma / cont

    println("A soma de todos os numeros multiplos de três, digitados é: $soma" +
    " e a média desses números é: $media")
*/
}