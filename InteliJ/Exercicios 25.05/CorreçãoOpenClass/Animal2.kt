package Exercicio.CorreçãoOpenClass

open class Animal2 (var nome: String, var idade: Int) {

    open fun emitirSom(){
        println("Emtindo som: ")
    }

    open fun deslocamento(){
        println("Se deslocando:")
    }

}