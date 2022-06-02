@file:Suppress("UNUSED_EXPRESSION")

fun main(){

    // 1 - Crie um programa para trabalhar com estoque de uma loja, o programa deverá
    //trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
    //programa deverá atender as seguintes funcionalidades:
    //Armazenar dados da List
    //Remover dados da list;
    //Atualizar dados da list.
    //Apresentar todos os dados da list.
/*
    val estoque = mutableListOf<String>()

    while (true) {
        println("Digite o nome do produto que deseja adicionar no estoque: ")
        val produtos = readln()

        if(produtos != ""){
            estoque.add(produtos)
        }else{
            break
        }
    }

    println("O tamanho do estoque é: ${estoque.size}")
    println(estoque)

    println("Caso queira remover produtos do estoque digite: remov"+
            "\nCaso queira atualizar o estoque digite: atual"+
            "\nOu digite  para finalizar")
*/

    val produtos = mutableMapOf<String>()

    while (true){

        println("Escolha uma opção:\n")
        println("1 - Adicionar produtos")
        println("2 - Remover produtos")
        println("3 - Atualizar produtos")
        println("4 - Listar produtos")
        println("5 - sair\n")
        println("Opção: ")
        val opcao = readln().toInt()

        when(opcao){

            1 -> {
                println("Digite o nome do produto: ")
                val prod = readln()

                if(prod != ""){
                    produtos.add(prod)
                    println("Produto Cadastrado!\n")
                }else{
                    println("O nome do produto não pode ser vazio")
                }
            }

            2 -> {
                println("Digite o produto a ser deletado: ")
                val prod = readln()

                if(produtos.contains(prod)){
                    produtos.remove(prod)
                    println("Produto removido com sucesso!\n")
                }else{
                    println("Produto não existe na lista\n")
                }
            }

            3 -> {
                println("Lista de Produtos\n")
                produtos.forEach {
                    println(it)
                }

                println("\nDigite um produto a ser atualizado: ")
                val prod = readln()

                if (produtos.contains(prod)) {
                    val index = produtos.indexOf(prod)

                    println("Digite o novo produto: ")
                    val valor = readln()

                    produtos[index] = valor
                    println("Produto atualizado com sucesso!\n")

                } else {
                    println("Produto não existe na lista\n")
                }
            }

                4 -> run {
                    println("Lista de produtos\n")

                    produtos.forEach {
                        println(it)
                    }

                    println()
                }

                5 -> break

                else -> println("Valor Inválido\n")
            }

            }
        }

    }
}