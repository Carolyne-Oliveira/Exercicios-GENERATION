package Exercicio.Interfaces

class Preguiça1(
    override var nome: String, override var idade: Int,) : Animal1 {

    override fun emitirSom(){
        println("Não sei que barulho ela faz!")
    }

    override fun deslocamento(){
        println("subindo em arvores bem devagarinho!")
    }
}