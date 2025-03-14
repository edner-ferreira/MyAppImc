package com.example.mytelas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnTela01: Button
    private lateinit var btnTela02: Button
    private lateinit var btnTela03: Button
    private lateinit var btnSair : Button
    private lateinit var textMenu : TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
        setContentView(R.layout.activity_main)
    // associa a variáveis com os elementos do layout
        textMenu = findViewById(R.id.)
        btnTela01 = findViewById(R.id.btnTela01)
        btnTela02 = findViewById(R.id.btnTela02)
        btnTela03 = findViewById(R.id.btnTela03)
        btnSair = findViewById(R.id.btnSair)

    //quando o botão Tela01 for pressionado
        btnTela01.setOnClickListener {
            val intent = Intent(this, Tela01::class.java)
            startActivity(intent)
        }

    //quando o botão Tela02 for pressionado
        btnTela02.setOnClickListener {
            val intent = Intent(this, Tela02::class.java)
            startActivity(intent)
        }

    //quando o botão Tela03 for pressionado
        btnTela03.setOnClickListener {
            val intent = Intent(this, Tela03::class.java)
            startActivity(intent)
        }

    //Quando o botão sair for pressionado
        btnSair.setOnClickListener {
            finish()
        }
    }
}