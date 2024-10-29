package br.cti.primeiroandroid.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.cti.primeiroandroid.R
import br.cti.primeiroandroid.model.Produto
import br.cti.primeiroandroid.ui.recycleview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView= findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto(
                nome = "teste 1",
                desc = "teste desc 1",
                valor = BigDecimal("19,99")
            ),
            Produto(
                nome = "teste 2",
                desc = "teste desc 2",
                valor = BigDecimal("19,99")
            ),
            Produto(
                nome = "teste 3",
                desc = "teste desc 3",
                valor = BigDecimal("19,99")
            )
        ))
    }
}