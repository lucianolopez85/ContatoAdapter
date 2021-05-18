package com.example.listacontatos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContatoAdapter(private val contato: List<Contato>) :
    RecyclerView.Adapter<ContatoAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_contato, parent, false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(contato[position])
    }
    override fun getItemCount(): Int {
        return contato.size
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: Contato) {
            with(itemView) {

                val iconeView = findViewById<TextView>(R.id.txt_inicial)
                val nomeView = findViewById<TextView>(R.id.txt_nome)
                val telView = findViewById<TextView>(R.id.txt_tel)


                iconeView.text = data.nome.first().toString()
                nomeView.text = data.nome
                telView.text = data.tel
            }
        }
    }
}