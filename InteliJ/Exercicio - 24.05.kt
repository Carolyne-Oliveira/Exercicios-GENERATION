fun main(){

/*    Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão e pelo menos mais duas opções
    de construtores conforme sua percepção, com os atributos: nome (String), endereço (String), telefone (String),
    listaDeCompras (mutableListOf<Strings>()).

      A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
    Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
    Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.
*/
    while (true) {
        println("Digite o seu nome: ")
        val nome = readln()

        println("Digite o seu endereço: ")
        val endereco = readln()

        println("Digite o seu telefone: ")
        val telefone = readln()

        try {
            val Carolyne = Cliente(nome, endereco, telefone)

            while (true){
                println("\n***MENU***\n")
                println("1 - Adicionar Compras")
                println("2 - Remover compras")
                println("3 - Lista de compras")
                println("4 - Sair")

                println("Opção:")
                val opc = readln().toInt()

                when(opc){
                    1 ->{
                        println("Digite um item para adicionar no carrinho: ")
                        val compra = readln()
                        Carolyne.addCompra(compra)
                    }

                    2 ->{
                        println("Digite um item para remover do carrinho: ")
                        val compra = readln()
                        Carolyne.removeCompra(compra)
                    }

                    3 ->{
                        Carolyne.listCompras()
                    }

                    4 -> break

                    else -> println("Opção Inválido")

                }
            }
          break
        } catch (e: java.lang.Exception) {
            println(e.message)
        }
    }

}