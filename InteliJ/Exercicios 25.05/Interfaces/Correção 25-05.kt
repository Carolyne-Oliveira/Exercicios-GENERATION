package Exercicio.Interfaces

import Exercicio.Interfaces.Cachorro1
import Exercicio.Interfaces.Preguiça1
import Exercicio.Interfaces.Cavalo1 as Cavalo1

fun main(){

    val cachorro1 = Cachorro1 ("Chips", 18)
    val cavalo1 = Cavalo1("Spirit", 5)
    val preguica1 = Preguiça1 ("Maria", 2)

    cachorro1.emitirSom()
    cachorro1.deslocamento()

    cavalo1.emitirSom()
    cavalo1.deslocamento()

    preguica1.emitirSom()
    preguica1.deslocamento()


    println(cachorro1)
    println(cavalo1)
    println(preguica1)
}