class Aviao (
    var turbina: Int,
    var assas: Int,
    var cor: String,
    var tremPouso: Boolean,
    var modelo: String,

        ) {

    var luzes = false
    var voando = false
    /*
    Métodos - Voar, Pousar, ligarLuzes,
    */

    fun voar(){
        if(voando) {
            println("O avião ja esta no ar!")
        }else{
            voando = true
            println("O avião vai voar")
        }
    }

    fun pousar(){
        if(voando){
            voando = false
            println("O avião acabou de pousar")
        }else{
            println("O avião já esta no chão")
        }
    }

    fun ligDesligLuzes(){
        if(luzes){
            luzes = false
            println("As luzes estão desligadas")
        }else{
            luzes = true
            println("Luzes estão ligadas")
        }

    }
}