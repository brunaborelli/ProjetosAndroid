package com.generation.dicer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DadosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados)

        val lados = intent.getIntExtra("LADOS", 0)

        val textDado = findViewById<TextView>(R.id.textDado)
        textDado.text = "D$lados: "

        val buttonRolar = findViewById<Button>(R.id.rolar)

        buttonRolar.setOnClickListener {
            rolarDados(lados)
        }

    }

    fun rolarDados(lados: Int) {
        val valor = (1..lados).random()

        // Transformando Int em String e printando Valor
        val textResultado = findViewById<TextView>(R.id.textResultado)
        textResultado.text = valor.toString()

    }

}

