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

class TesteFile12 : AppCompatActivity() {
    private lateinit var counter: Contador
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.testefile12)

        val button = findViewById<Button>(R.id.button)
        val rb1 = findViewById<RadioButton>(R.id.radioButton1)
        val rb2 = findViewById<RadioButton>(R.id.radioButton2)
        val rb3 = findViewById<RadioButton>(R.id.radioButton3)
        val rb4 = findViewById<RadioButton>(R.id.radioButton4)
        val rb5 = findViewById<RadioButton>(R.id.radioButton5)
        counter = CounterHolder.getCounter()
        button.setOnClickListener{
            if(rb1.isChecked){
                counter.adiciona_numero3(0)
            }
            if(rb2.isChecked){
                counter.adiciona_numero3(7)
            }
            if(rb3.isChecked){
                counter.adiciona_numero3(8)
            }
            if(rb4.isChecked){
                counter.adiciona_numero3(9)
            }
            if(rb5.isChecked){
                counter.adiciona_numero3(10)
            }
            println(counter.getNumber3())
            if(counter.getNumber3() <= 1){
                counter.adiciona_numero(1)
                val intent = Intent(this@TesteFile12, TesteFile13::class.java)
                startActivity(intent)

            }
            if(counter.getNumber3() in 2..6){
                counter.adiciona_numero(2)
                val intent = Intent(this@TesteFile12, TesteFile13::class.java)
                startActivity(intent)

            }
            if(counter.getNumber3() >= 7){
                counter.adiciona_numero(4)
                val intent = Intent(this@TesteFile12, TesteFile13::class.java)
                startActivity(intent)

            }
            println(counter.getNumber())
        }
    }
    override fun onResume() {
        super.onResume()

        val rb1 = findViewById<RadioButton>(R.id.radioButton1)
        val rb2 = findViewById<RadioButton>(R.id.radioButton2)
        val rb3 = findViewById<RadioButton>(R.id.radioButton3)
        val rb4 = findViewById<RadioButton>(R.id.radioButton4)
        val rb5 = findViewById<RadioButton>(R.id.radioButton5)
        counter = CounterHolder.getCounter()

        if(counter.getNumber3() <= 1){
            counter.remove_numero(1)
        }
        if(counter.getNumber3() in 2..6){
            counter.remove_numero(2)
        }
        if(counter.getNumber3() >= 7){
            counter.remove_numero(4)
        }

        if (rb1.isChecked) {
            counter.remove_numero3(0)
        }
        if (rb2.isChecked) {
            counter.remove_numero3(7)
        }
        if (rb3.isChecked) {
            counter.remove_numero3(8)
        }
        if (rb4.isChecked) {
            counter.remove_numero3(9)
        }
        if (rb5.isChecked) {
            counter.remove_numero3(10)
        }
    }

}