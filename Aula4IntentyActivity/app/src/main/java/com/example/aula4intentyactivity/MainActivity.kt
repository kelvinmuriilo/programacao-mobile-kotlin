package com.example.aula4intentyactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonToast.setOnClickListener{
            val text = editTextTextPersonName.text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }

        buttonTela2.setOnClickListener{
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("name",  editTextTextPersonName.text.toString())
            startActivity(intent)
        }

        buttonParcel.setOnClickListener{
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("cliente", Cliente(20, "Kelvin"))
            startActivity(intent)
        }
    }
}