package com.example.cancerdemama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var buttonLista: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonLista = findViewById(R.id.buttonLista)

        buttonLista.setOnClickListener {
            redirecionarParaLista()
        }
    }

    private fun redirecionarParaLista() {
        val intent = Intent(this, UsuariosActivity::class.java)
        startActivity(intent)
    }
}
