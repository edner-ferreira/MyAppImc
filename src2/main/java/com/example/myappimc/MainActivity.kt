package com.example.myappimc

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var editTextPeso: EditText
    private lateinit var editTextAltura: EditText
    private lateinit var buttonCalcular: Button
    private lateinit var textViewResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
        setContentView(R.layout.activity_main)

        editTextPeso = findViewById(R.id.editTextPeso)
        editTextAltura = findViewById(R.id.editTextAltura)
        buttonCalcular = findViewById(R.id.buttonCalcular)
        textViewResultado = findViewById(R.id.textViewResultado)

        buttonCalcular.setOnClickListener {
            val pesoText = editTextPeso.text.toString()
            val alturaText = editTextAltura.text.toString()

            val peso = pesoText.toDouble()
            val altura = alturaText.toDouble()

            val imc = calcularIMC(peso, altura)
            textViewResultado.text = "Seu IMC é $imc"
        }


    }

    private fun calcularIMC(peso: Double, altura: Double): Any {
        return peso / (altura * altura)
    }
}