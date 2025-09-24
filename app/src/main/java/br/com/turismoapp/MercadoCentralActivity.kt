package br.com.turismoapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MercadoCentralActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mercado_central)

        findViewById<TextView>(R.id.tvCur1).text = "Inaugurado em 1929 com 400 lojas."
        findViewById<TextView>(R.id.tvCur2).text = "Já foi campo do América FC entre 1923 e 1929."
        findViewById<TextView>(R.id.tvCur3).text = "Mistura tradição familiar com novos comércios."

        findViewById<Button>(R.id.btnCall).setOnClickListener {
            startActivity(Intent(Intent.ACTION_DIAL, Uri.parse("tel:156")))
        }

        findViewById<Button>(R.id.btnMap).setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Mercado+Central+Belo+Horizonte")))
        }

        findViewById<Button>(R.id.btnNext).setOnClickListener {
            startActivity(Intent(this, PracaLiberdadeActivity::class.java))
        }

        findViewById<Button>(R.id.btnPrev).setOnClickListener {
            startActivity(Intent(this, MineiraoActivity::class.java))
        }
    }
}