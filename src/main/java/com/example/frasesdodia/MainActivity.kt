package com.example.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var texto: TextView
    val frases = arrayOf(
            "O importante não é vencer todos os dias, mas lutar sempre",
            "Maior do que a tristeza de não ter vencido é a vergonha de não ter ganhado",
            "É melhor conquistar a si mesmo do que vencer mil batalhas",
            "Enquanto houver vontade de lutar haverá esperança de vencer"
            )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textoFrase) as TextView
    }

    fun gerarFrase(view: View){
        val totalItensArrays = frases.size
        val numeroAleatorio = Random().nextInt(totalItensArrays)
        texto.setText(frases[numeroAleatorio])
    }


}