package br.cti.primeiroandroid.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.cti.primeiroandroid.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val loja = findViewById<Button>(R.id.btnConhecer)
        loja.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val idealizadores= findViewById<Button>(R.id.btnIdealizador)
        idealizadores.setOnClickListener {
            val intent = Intent(this, IdealizadoresActivity::class.java)
            startActivity(intent)
        }
    }
}