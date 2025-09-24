package br.com.turismoapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class PracaLiberdadeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_praca_liberdade)

        findViewById<TextView>(R.id.tvCur1).text = "Construída entre 1895 e 1897 em estilo eclético."
        findViewById<TextView>(R.id.tvCur2).text = "Abriga edifícios projetados por Oscar Niemeyer."
        findViewById<TextView>(R.id.tvCur3).text = "Tombada como patrimônio paisagístico em 1977."

        findViewById<Button>(R.id.btnCall).setOnClickListener {
            startActivity(Intent(Intent.ACTION_DIAL, Uri.parse("tel:156")))
        }

        findViewById<Button>(R.id.btnMap).setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Praca+da+Liberdade+Belo+Horizonte")))
        }

        findViewById<Button>(R.id.btnNext).setOnClickListener {
            startActivity(Intent(this, LagoaPampulhaActivity::class.java))
        }

        findViewById<Button>(R.id.btnPrev).setOnClickListener {
            startActivity(Intent(this, MercadoCentralActivity::class.java))
        }
    }
}