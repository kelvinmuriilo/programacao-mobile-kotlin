package com.example.atividade1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_about_view.*

class AboutView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_view)

        btnVisitUninassauSite.setOnClickListener{
            openIntentSiteUninassau(0)
        }
    }

    private fun openIntent(intent: Intent) {
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Toast.makeText(this, R.string.erro_intent_site, Toast.LENGTH_SHORT).show()
        }
    }

    fun openIntentSiteUninassau(position: Int) {
        val uri: Uri?
        val intent: Intent?
        when (position) {
            0 -> {
                uri = Uri.parse("https://www.uninassau.edu.br/")
                intent = Intent(Intent.ACTION_VIEW, uri)
                openIntent(intent)
            }
        }
    }

    fun openIntent(view: View) {}


}