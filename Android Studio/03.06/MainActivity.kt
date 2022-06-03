package com.generation.projetoum

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonD6 = findViewById<Button>(R.id.button)
        val buttonD12 = findViewById<Button>(R.id.button2)
        val buttonD20 = findViewById<Button>(R.id.button3)

        buttonD6.setOnClickListener {
            rolarDados(6)
            Toast.makeText(this, "Continue!", Toast.LENGTH_LONG).show()
        }

        buttonD12.setOnClickListener{
            rolarDados(12)
            Toast.makeText( this, "Go!", Toast.LENGTH_LONG).show()
        }
        buttonD20.setOnClickListener{
            rolarDados(20)
            Toast.makeText( this, "Yes!", Toast.LENGTH_LONG).show()
        }
    }

    private fun rolarDados (lados: Int){
        val rolagem =(1..lados).random()

        val textDados = findViewById<TextView>(R.id.textDado)
        textDados.text =rolagem.toString()

        val imagem = findViewById<ImageView>(R.id.imageDado)

        when(rolagem){

            1 -> imagem.setImageResource(R.drawable.dado_1)
            2 -> imagem.setImageResource(R.drawable.dado_2)
            3 -> imagem.setImageResource(R.drawable.dado_3)
            4 -> imagem.setImageResource(R.drawable.dado_4)
            5 -> imagem.setImageResource(R.drawable.dado_5)
            6 -> imagem.setImageResource(R.drawable.dado_6)
            7 -> imagem.setImageResource(R.drawable.dado_7)
            8 -> imagem.setImageResource(R.drawable.dado_8)
            9 -> imagem.setImageResource(R.drawable.dado_9)
            10 -> imagem.setImageResource(R.drawable.dado_10)
            11 -> imagem.setImageResource(R.drawable.dado_11)
            12 -> imagem.setImageResource(R.drawable.dado_12)
            13 -> imagem.setImageResource(R.drawable.dado_13)
            14 -> imagem.setImageResource(R.drawable.dado_14)
            15 -> imagem.setImageResource(R.drawable.dado_15)
            16 -> imagem.setImageResource(R.drawable.dado_16)
            17 -> imagem.setImageResource(R.drawable.dado_17)
            18 -> imagem.setImageResource(R.drawable.dado_18)
            19 -> imagem.setImageResource(R.drawable.dado_19)
            20 -> imagem.setImageResource(R.drawable.dado_20)
        }
    }
}