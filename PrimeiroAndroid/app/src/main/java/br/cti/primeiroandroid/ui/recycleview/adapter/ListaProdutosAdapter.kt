package br.cti.primeiroandroid.ui.recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.cti.primeiroandroid.R
import br.cti.primeiroandroid.model.Produto

class ListaProdutosAdapter (
    private val context: Context,
    private val produtos: List<Produto>
): RecyclerView.Adapter<ListaProdutosAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        fun vincula(produto: Produto){
            val nome = itemView.findViewById<TextView>(R.id.txtNome)
            nome.text = produto.nome
            val desc = itemView.findViewById<TextView>(R.id.txtDesc)
            desc.text = produto.desc
            val valor = itemView.findViewById<TextView>(R.id.txtVal)
            valor.text = produto.valor.toPlainString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):  ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.produto_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produto = produtos[position]
        holder.vincula(produto)
    }

    override fun getItemCount(): Int = produtos.size
}
