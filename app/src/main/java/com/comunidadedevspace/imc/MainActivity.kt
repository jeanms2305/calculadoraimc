package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
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

            val pesoStr:String = edtpeso.text.toString()
            val alturaStr:String = edtaltura.text.toString()

            if(pesoStr == "" || alturaStr == "") {
             // Mostrar mensagem para o usuario

                Snackbar
                    .make(
                        edtpeso,
                        "Preencha todos os campos",
                        Snackbar.LENGTH_LONG
                    )
                    .show()

            } else {
                val peso: Float = pesoStr.toFloat()
                val altura: Float = alturaStr.toFloat()

                val altQ2 = altura * altura
                val resultado = peso / altQ2

                // Navegar para a proxima tela
                // Criar o layout da proxima tela
                // Passar dados (Resultado) para a proxima tela

                // Para chamar a proxima tela, precisamos do  Intent -  Class do proprio android

                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra(KEY_RESULT_IMC,resultado )
                startActivity(intent)

                println ( "Jean " + resultado )
            }
        }
    }
}