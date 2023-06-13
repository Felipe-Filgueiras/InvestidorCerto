package com.example.investidorcerto

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TesteFileFinal : AppCompatActivity() {
    private lateinit var counter: Contador
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.testefilefinal)
        counter = CounterHolder.getCounter()

        val textView: TextView = findViewById(R.id.textView)
        val textView2: TextView = findViewById(R.id.textView2)

        textView2.text = "Parábens por concluir o teste " + counter.getNome()

        val value = counter.getNumber()

        when {
            value <= 14 -> textView.text = "Seu perfil de investimentos é Conservador"
            value >= 15 && value <= 35 -> textView.text = "Seu perfil de investimentos é Moderado"
            value >= 36 -> textView.text = "Seu perfil de investimentos é Arrojado"
        }

        val linkTextView = findViewById<TextView>(R.id.linkTextView)
        linkTextView.setOnClickListener {
            val webpage = Uri.parse("https://www.bancopaulista.com.br/Arquivos/QuestionarioAPI.pdf")
            val intent = Intent(Intent.ACTION_VIEW, webpage)
            startActivity(intent)
        }

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            counter.setNumero(0)
            counter.setNumero2(0)
            counter.setNumero3(0)
            counter.setNome("")

            val intent = Intent(this@TesteFileFinal, MainActivity::class.java)
            startActivity(intent)
        }

    }
}