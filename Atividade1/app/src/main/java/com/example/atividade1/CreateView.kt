package com.example.atividade1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_create_view.*
import kotlinx.android.synthetic.main.activity_login_view.*

class CreateView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_view)
    }

    fun buttonCreateClick(view: View){
        if (editTextName.text.isBlank()){
            editTextName.setError("Insira o nome completo")
        }

        if (editTextAddress.text.isBlank()) {
            editTextAddress.setError("Insira o endereço")
        }

        if (editTextCep.text.isBlank()){
            editTextCep.setError("Insira o CEP")
        }

        if (editTextComplement.text.isBlank()){
            editTextComplement.setError("Insira o complemento")
        }

        if (editTextNumber.text.isBlank()){
            editTextNumber.setError("Insira o número")
        }
    }
}