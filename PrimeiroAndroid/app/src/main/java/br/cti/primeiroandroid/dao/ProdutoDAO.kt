package br.cti.primeiroandroid.dao

import br.cti.primeiroandroid.model.Produto

class ProdutoDAO {
    fun adiciona(produto : Produto){
        produtos.add(produto)
    }

    fun buscaTodos() : List<Produto>{
        return produtos.toList()
    }

    companion object{
        private val produtos = mutableListOf<Produto>()
    }
}