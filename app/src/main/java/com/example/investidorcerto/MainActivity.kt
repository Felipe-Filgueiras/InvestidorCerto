package com.example.investidorcerto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var counter: Contador
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        var nome = findViewById<EditText>(R.id.editTextTextPersonName)
        counter = CounterHolder.getCounter()
        button.setOnClickListener{
            val nomeText = nome.text.toString().trim()
            if (!TextUtils.isEmpty(nomeText)){
                counter.setNome(nomeText)
                val intent = Intent(this@MainActivity, TesteFile1::class.java)
                startActivity(intent)
            }
        }
    }

}