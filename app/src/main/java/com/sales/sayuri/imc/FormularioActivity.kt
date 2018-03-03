package com.sales.sayuri.imc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.sales.sayuri.imc.R.id.btLimpar
import kotlinx.android.synthetic.main.activity_formulario.*

class FormularioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        btLimpar.setOnClickListener {
            inputAltura.editText?.setText("")
            inputPeso.editText?.setText("")
            inputPeso.editText?.requestFocus()
        }

        btCalcular.setOnClickListener{
            val telaResultado = Intent(this,
                    ResultadoActivity::class.java)

            telaResultado.putExtra("PESO",
                    inputPeso.editText?.text.toString())

            telaResultado.putExtra("ALTURA",
                    inputAltura.editText?.text.toString())

            startActivity(telaResultado)
        }
    }
}
