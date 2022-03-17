package com.generation.dicer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonD6 = findViewById<Button>(R.id.bD6)
        // O que acontece quando se clica no botão
        buttonD6.setOnClickListener {
            rolarDados(6)
        }

        val buttonD12 = findViewById<Button>(R.id.bD12)
        buttonD12.setOnClickListener {
            rolarDados(12)
        }

        val buttonD20 = findViewById<Button>(R.id.bD20)
        buttonD20.setOnClickListener {
            rolarDados(20)
        }
    }

    fun rolarDados(lados: Int) {
        val valor = (1..lados).random()

        // Transformando Int em String e printando Valor
        val textResultado = findViewById<TextView>(R.id.textResultado)
        textResultado.text = valor.toString()

    }


}