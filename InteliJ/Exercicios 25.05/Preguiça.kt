package Exercicio


class Preguiça ( nome:String, idade: Int, somQueEmite: String
) :Animais(nome, idade, somQueEmite) {

    var subirEmArvores = Boolean

    open fun subirEmArvores() {
        println("Subindo bem devagar nas arvores!")
    }

}