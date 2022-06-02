package Exercicio.Interfaces

class Cavalo1(
    override var nome: String, override var idade: Int) : Animal1 {

    override fun emitirSom(){
        println("Pocotó")
    }

    override fun deslocamento(){
        println("Correndo como um cavalo!")
    }
}