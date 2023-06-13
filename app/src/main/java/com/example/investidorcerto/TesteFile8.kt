package com.example.investidorcerto

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class TesteFile8 : AppCompatActivity() {
    private lateinit var counter: Contador
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.testefile8)

        val button = findViewById<Button>(R.id.button)
        val rb1 = findViewById<RadioButton>(R.id.radioButton1)
        val rb2 = findViewById<RadioButton>(R.id.radioButton2)
        val rb3 = findViewById<RadioButton>(R.id.radioButton3)
        counter = CounterHolder.getCounter()
        button.setOnClickListener{
            if(rb1.isChecked){
                counter.adiciona_numero2(0)
                val intent = Intent(this@TesteFile8, TesteFile9::class.java)
                startActivity(intent)
            }
            if(rb2.isChecked){
                counter.adiciona_numero2(2)
                val intent = Intent(this@TesteFile8, TesteFile9::class.java)
                startActivity(intent)
            }
            if(rb3.isChecked){
                counter.adiciona_numero2(3)
                val intent = Intent(this@TesteFile8, TesteFile9::class.java)
                startActivity(intent)
            }
            println(counter.getNumber2())
        }
    }

    override fun onResume() {
        super.onResume()

        val rb1 = findViewById<RadioButton>(R.id.radioButton1)
        val rb2 = findViewById<RadioButton>(R.id.radioButton2)
        val rb3 = findViewById<RadioButton>(R.id.radioButton3)
        counter = CounterHolder.getCounter()

        if (rb1.isChecked) {
            counter.remove_numero2(0)
        }
        if (rb2.isChecked) {
            counter.remove_numero2(2)
        }
        if (rb3.isChecked) {
            counter.remove_numero2(3)
        }
    }

    class MyFragment : Fragment() {

        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            return inflater.inflate(R.layout.logo, container, false)
        }

    }
}