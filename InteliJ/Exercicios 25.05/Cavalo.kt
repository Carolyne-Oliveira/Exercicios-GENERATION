package Exercicio


class Cavalo( nome:String, idade: Int, somQueEmite: String
) :Animais(nome, idade, somQueEmite) {

    var correr = Boolean

    open fun correr() {
        println("O cavalo correndo solto!")
    }

}