fun main(){

    /*Exercicios


    // 1 - Faça um programa que receba três inteiros e diga qual deles é o maior.
/*
    print("Digite três numeros aleatórios e inteiros: ")

    println("Primeiro numero:")
    var num1 = readln().toInt()
    println("Segundo numero:")
    var num2 = readln().toInt()
    println("Terceiro numero:")
    var num3 = readln().toInt()

    if(num1 > num2 && num1 > num3){
        Println("O maior numero digitado foi o $num1")
    }else if(num2 > num1 && num2 > num3) {
        Println("O maior numero digitado foi o $num2")
    }else{
        Println("O maior número digitado foi o $num3")
    }
*/

    // 2 - Faça um programa que entre com três números e coloque em ordem crescente.
/*
     print("Digite três numeros aleatórios:")
     println("Primeiro numero:")
     var num1 = readln().toInt()
     println("Segundo numero:")
     var num2 = readln().toInt()
     println("Terceiro numero:")
     var num3 = readln().toInt()

    if(num1 <= num2 && num2 <= num3){
        println("$num1 - $num2 - $num3")
    }else if(num1 <= num3 && num3 <= num2){
        println("$num1 - $num3 - $num2")
    }else if(num2 <= num1 && num1 <= num3) {
        println("$num2 - $num1 - $num3")
    }else if(num2 <= num3 && num3 <= num1){
        println("$num2 - $num3 - $num1")
    }else if(num3 <= num1 && num1<= num2){
        println("$num3 - $num1 - $num2")
    }else{
        println("$num3 - $num2 - $num1")
    }
*/

    // 3 - Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
    //categoria ela se encontra:
    // 10-14 infantil
    // 15-17 juvenil
    // 18-25 adulto
/*
    print("Digite sua idade para descobrir em qual categoria se encontra:")
    val idade = readln().toInt()

    when(idade){

        in 10.. 14 -> println("Infantil")

        in 15.. 17 -> println("Juvenil")

        in 18.. 25 -> println("Adulto")

        else -> println("Categoria inexistente para a sua idade!")
    }
*/


    // 4 - Faça um programa em que permita a entrada de um número qualquer e exiba se este
    //número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
    //ímpar exiba o número elevado ao quadrado.
/*
    print("Digite um numero: ")
    val num = readln().toDouble()

    if(num % 2 == 0.0){ //se o resultado da divisão(%) do numero for zero(0.0)
         println("O numero $num é par e sua raiz quadrada é: ${"%.2f".format(srqr(num))}")

    }else{
         println("O numero $num é ímpar e ele elevado ao quadrado é: " +
         "${"%.2f".format(num.pow(n:2))}")
    }
*/





    //CORREÇÃO
/*    //2 -

    print("Digite o valor 1: ")
    val num1 = readln().toInt()

    print("Digite o valor 2: ")
    val num2 = readln().toInt()

    print("Digite o valor 3: ")
    val num3 = readln().toInt()

    //Sequencia de num1 - num2 - num3

    if(num1 <= num2 && num2 <= num3){
        println("$num1 - $num2 - $num3")
    }else if(num1 <= num3 && num3 <= num2){
        println("$num1 - $num3 - $num2")
    }else if(num2 <= num1 && num1 <= num3) {
        println("$num2 - $num1 - $num3")
    }else if(num2 <= num3 && num3 <= num1){
        println("$num2 - $num3 - $num1")
    }else if(num3 <= num1 && num1<= num2){
        println("$num3 - $num1 - $num2")
    }else{
        println("$num3 - $num2 - $num1")
    }
    */

    //4 -
    /*
    print("Digite o valor 1: ")
    val num = readln().toDouble()

    if(num % 2 == 0.0){ //se o resultado da divisão(%) do numero for zero(0.0)
         println("O numero $num é par e sua raiz quadrada é: ${"%.2f".format(srqr(num))}")

    }else{
         println("O numero $num é ímpar e ele elevado ao quadrado é: " +
         "${"%.2f".format(num.pow(n:2))}")
    }
    */

    // 1 -
    /*
    print("Digite o valor 1: ")
    val num1 = readln().toInt()

    print("Digite o valor 2: ")
    val num2 = readln().toInt()

    print("Digite o valor 3: ")
    val num3 = readln().toInt()

    if(num1 > num2 && num1 > num3){
        Println("O maior numero digitado foi o $num1")
    }else if(num2 > num1 && num2 > num3) {
        Println("O maior numero digitado foi o $num2")
    }else{
        Println("O maior número digitado foi o $num3")
    }
     */

    // 3 -
    /*
    print("Digite a idade para verificarmos qual categoria você se encontra: ")
    val idade = readln().toInt()

    //if (idade >= 10 <= 14)...Mas nã vamos usar isso hj!

    when(idade){
        in 10.. 14 -> println("Infantil")
        in 15.. 17 -> println("Juvenil")
        in 18.. 25 -> println("Adulto")
        else -> println("Você não se encntra em nenhuma categoria")

    }
    */

}