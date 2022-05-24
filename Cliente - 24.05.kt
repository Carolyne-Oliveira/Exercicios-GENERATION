class Cliente(private var nome: String) {

    private var endereco = ""
    private var telefone = ""

    private val listCompras = mutableListOf<String>()

    init{
        if(nome == ""){
            throw Exception("A classe foi instanciada da maneira incorreta!")
        }
    }

    //Construtores

    constructor(nome: String, endereco: String): this(nome){
        this.endereco = endereco
    }

    constructor(nome: String, endereco: String, telefone: String)
            : this(nome, endereco){
                this.telefone = telefone
            }

    fun addCompra(compra: String){
        if(compra != ""){
            listCompras.add(compra)
            println("Compra realizada")
        }else{
            println("\nItem inválido!")
        }
    }

    fun removeCompra(compra:String){
        if(listCompras.contains(compra)){
            listCompras.remove(compra)
            println("\n Item removido!")
        }else{
            println("\nItem inválido!")
        }
    }

    fun listCompras(){
        println("\n***Lista de Compras***\n")
        listCompras.forEach{
            println(it)
        }
        println()
    }
}