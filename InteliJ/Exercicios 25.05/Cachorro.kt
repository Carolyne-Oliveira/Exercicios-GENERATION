package Exercicio

class Cachorro( nome:String, idade: Int, somQueEmite: String
    ) :Animais(nome, idade, somQueEmite) {

    var correr = Boolean

    open fun correr() {
        println("Correndo igual um louco atras do motoqueiro!")
    }

}