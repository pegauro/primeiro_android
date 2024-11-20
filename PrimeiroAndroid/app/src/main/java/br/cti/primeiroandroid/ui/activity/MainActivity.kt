package br.cti.primeiroandroid.ui.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.cti.primeiroandroid.R
import br.cti.primeiroandroid.dao.ProdutoDAO
import br.cti.primeiroandroid.model.Produto
import br.cti.primeiroandroid.ui.recycleview.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume(){
        super.onResume()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val dao = ProdutoDAO()
        Log.i("MainActivity", "onCreate: ${dao.buscaTodos()}")
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = dao.buscaTodos())
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener{
            val intent = Intent(this, FormularioProdutoActivity::class.java)
            startActivity(intent)
        }
        val voltar = findViewById<FloatingActionButton>(R.id.actbVoltar)
        voltar.setOnClickListener {
            finish()
        }
    }
}