package br.com.turismoapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class LagoaPampulhaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lagoa_pampulha)

        findViewById<TextView>(R.id.tvCur1).text = "Construída em 1943 com represamento de ribeirão."
        findViewById<TextView>(R.id.tvCur2).text = "Parte do Conjunto Moderno da Pampulha (UNESCO)."
        findViewById<TextView>(R.id.tvCur3).text = "Qualidade da água melhorou em 2025 para esportes náuticos."

        findViewById<Button>(R.id.btnCall).setOnClickListener {
            startActivity(Intent(Intent.ACTION_DIAL, Uri.parse("tel:156")))
        }

        findViewById<Button>(R.id.btnMap).setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Lagoa+da+Pampulha+Belo+Horizonte")))
        }

        findViewById<Button>(R.id.btnNext).setOnClickListener {
            startActivity(Intent(this, CasaFiatActivity::class.java))
        }

        findViewById<Button>(R.id.btnPrev).setOnClickListener {
            startActivity(Intent(this, PracaLiberdadeActivity::class.java))
        }
    }
}