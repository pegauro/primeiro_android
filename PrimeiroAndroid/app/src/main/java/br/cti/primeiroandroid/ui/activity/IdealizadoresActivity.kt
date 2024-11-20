package br.cti.primeiroandroid.ui.activity

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.cti.primeiroandroid.R

class IdealizadoresActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_idealizadores)

        val voltar = findViewById<Button>(R.id.btnVoltar)
        voltar.setOnClickListener {
            finish()
        }
    }
}