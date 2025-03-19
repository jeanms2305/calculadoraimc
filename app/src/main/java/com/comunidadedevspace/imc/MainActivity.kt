package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar os componentes EditText
        // Criar uma variavel e associar(=) o componente e UI <TextInputEditText>
        // Recuperar o botao da tela

        // setOnClickListener -  Ação do botão, tudo o qu estiver dentro do {}
        // Recuperar o texto digitado no edt peso

        val edtpeso = findViewById< TextInputEditText >(R.id.edt_peso)
        val edtaltura = findViewById< TextInputEditText >(R.id.edt_altura)

        val btncalcular = findViewById< Button >(R.id.btn_calcular)

        btncalcular.setOnClickListener {

            val peso:Float = edtpeso.text.toString().toFloat()
            val altura:Float = edtaltura.text.toString().toFloat()

            val altQ2 = altura * altura
            val resultado = peso / altQ2

            println ( "Jean " + resultado )
        }



    }
}