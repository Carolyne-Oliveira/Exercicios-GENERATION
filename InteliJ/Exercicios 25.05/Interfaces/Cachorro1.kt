package Exercicio.Interfaces

class Cachorro1 (
    override var nome: String, override var idade: Int,) : Animal1 {

    override fun emitirSom(){
        println("Latido")
    }

    override fun deslocamento(){
        println("Correndo como um cachorro!")
    }
}