package com.example.app3celsius

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    /*
    Nome e RA de todos os componentes:
    EVERTON JUNIOR MORENO - 2920482011008
    FERNANDA CRISTINA DE SOUZA FERNANDES - 2920482011032
    Objetivo:
    84. Utilizando os aplicativos da aula:
    12 – App 3 – Celsius;
    fazer a seguinte alteração:
    I. Proponha e faça alterações no Aplicativo (no mínimo 3 alterações).
    */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtTemperatura = findViewById<EditText>(R.id.txtTemperatura)
        val txt_Exibir = findViewById<TextView>(R.id.txt_Exibir)

        btn_Farenheit.setOnClickListener {
            if (txtTemperatura.text.isEmpty()) {
                txtTemperatura.error = "Digite a temperatura"
            } else {
                val celsius = txtTemperatura.text.toString().toDouble()
                val resultado: Double
                resultado = (9 * celsius + 160) / 5
                txtTemperatura.text.clear()
                txt_Exibir.text = "$celsius Graus Celsius equivale a $resultado Graus Farenheit"
            }
        }

        btn_Celsius.setOnClickListener {

            if (txtTemperatura.text.isEmpty()) {
                txtTemperatura.error = "Digite a temperatura"
            } else {
                val farenheit = txtTemperatura.text.toString().toDouble()
                val resultado: Double
                resultado = (farenheit - 32) * 5/9
                txtTemperatura.text.clear()
                txt_Exibir.text = "$farenheit Graus Farenheit equivale a $resultado Graus Celsius"
            }
        }
    }
}