package com.example.aula4intentyactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela2.*

class Tela2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)
        

        val name = intent.getStringExtra("name")
        val cliente = intent.getParcelableExtra<Cliente>("cliente")

       if(cliente != null){
            textViewTela2.text = "Nome: ${cliente.nome}/ Código: ${cliente.codigo}"
        } else {
           textViewTela2.text = "Nome: $name"
       }
    }
}