package com.example.investidorcerto


object CounterHolder {
    private var counter: Contador? = null

    fun getCounter(): Contador {
        if (counter == null) {
            counter = Contador()
        }
        return counter!!
    }
}
