package Exercicio.CorreçãoAbstract

class Cachorro3(nome: String, idade: Int) : Animal3(nome, idade) {

    override fun emitirSom() {
        println("Au Au")
    }

    override fun deslocamento() {
        println("Correndo como um cachrro")
    }
}