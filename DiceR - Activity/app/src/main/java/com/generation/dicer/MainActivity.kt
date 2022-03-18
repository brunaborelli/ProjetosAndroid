package com.generation.dicer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentDados = Intent(this, DadosActivity::class.java)

        // O que acontece quando se clica no botão
        val buttonD6 = findViewById<Button>(R.id.bD6)
        buttonD6.setOnClickListener {
            intentDados.putExtra("LADOS", 6)
            startActivity(intentDados)
        }

        val buttonD12 = findViewById<Button>(R.id.bD12)
        buttonD12.setOnClickListener {
            intentDados.putExtra("LADOS", 12)
            startActivity(intentDados)
        }

        val buttonD20 = findViewById<Button>(R.id.bD20)
        buttonD20.setOnClickListener {
            intentDados.putExtra("LADOS", 20)
            startActivity(intentDados)
        }
    }

}