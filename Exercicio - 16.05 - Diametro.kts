import kotlin.math.PI

fun main(args: Array<String>) {


    //Exercicio1: Faça um programa em que o usuário digite o diâmetro de um círculo e
    // calcule a área e o perímetro dele

    print("Digite o diametro do circulo: ")
    val diametro = readLine()!!.toDouble()

    val raio = diametro / 2
    val perimetro = 2 * PI * raio
    var area = PI * raio * raio


    println("Perimetro:  ${"%.2f".format(perimetro)}")
    println("Area: ${"%.2f".format(area)}")
}
