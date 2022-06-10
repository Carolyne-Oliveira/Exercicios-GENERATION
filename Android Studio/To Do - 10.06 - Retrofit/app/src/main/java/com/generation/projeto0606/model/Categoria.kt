package com.generation.projeto0606.model

data class Categoria (
    var id: Long,
    var descricao: String?,
    var tarefas: List<Tarefa>? //? -> indica que pode ser nula
        ){
}