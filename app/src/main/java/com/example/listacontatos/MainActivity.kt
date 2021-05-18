package com.example.listacontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view_da_lista_transacoes)
        val adapter = ContatoAdapter(lista())
        recyclerView.adapter = adapter

    }

    fun lista(): List<Contato> {
        return arrayListOf(
            Contato("Artur", "48 99852-6624"),
            Contato("Elaine", "48 92475-1467"),
            Contato("Michelle", "48 99572-1674"),
            Contato("Felipe", "48 98524-9614"),
            Contato("Luiz", "48 99264-7489"),
            Contato("Carlos", "48 98472-3652"),
            Contato("Ana", "48 98427-4759"),
            Contato("Lucas", "48 93675-5142"),
            Contato("Elias", "48 99692-9669"),
            Contato("Mariana", "48 99865-6635"),
            Contato("Larissa", "48 99632-4257"),
            Contato("Anderson", "48 98456-2669"),
            Contato("Rafael", "48 99745-3624")
        ).toList()
    }
}