package com.example.atividade1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnLoginClick(view: View) {
        val intent = Intent(this, LoginView::class.java)
        startActivity(intent)
    }

    fun btnCreateClick(view: View){
        val intent = Intent(this, CreateView::class.java)
        startActivity(intent)
    }

    fun btnAboutClick(view: View){}

}