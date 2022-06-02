/*fun main(){

    //Calculadora
    println("Insira um numero inteiro para ser somado: ")
    val num1 = readln().toInt()

    println("Insira outro numero inteiro para ser somado: ")
    val num2 = readln().toInt()

    println("A soma entre $num1 e $num2 é igual ${soma(num1, num2)}")
    println("A subtração entre $num1 e $num2 é igual ${sub(num1, num2)}")
    println("A mutiplicação entre $num1 e $num2 é igual ${mult(num1, num2)}")
    println("A divisão entre $num1 e $num2 é igual ${div(num1, num2)}")
    println("O resultado da potencia entre $num1 e $ num2 é: ${pot(num1, num2)}")
}


fun soma(n1: Int, n2: Int): Int{  //quero dois numeros inteiros e quer que ela me retorne outro inteiro
    val resultSoma = n1 + n2
    return resultSoma  //oque eu quero retornar assim que a função acima for chamada
}
fun sub(n1: Int, n2: Int): Int{
    val resultSub = n1 - n2
    return resultSub
}
fun mult(n1: Int, n2: Int): Int {
    val resultMult = n1 * n2
    return resultMult
}
fun div(n1: Int, n2: Int): Int {
    val resultDiv = n1 / n2
    return resultDiv

fun pot(valor: Double, exp: Double): Double{
    val resultPot =
    return valor.pow(exp)
}
 */



fun main(){

    //Calculadora sem retorno

    println("Digite o primeiro valor: ")
    val num1 = readln().toInt()

    println("Digite o segundo valor: ")
    val num2 = readln().toInt()

    soma(num1, num2)

}
     fun soma(n1: Int, n2: Int){
      println("A soma entre $n1 e $n2 é: ${n1 + n2}")
}

