package br.com.turismoapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class CasaFiatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_casa_fiat)

        findViewById<TextView>(R.id.tvCur1).text = "Inaugurada em 1927 como Banco Hipotecário."
        findViewById<TextView>(R.id.tvCur2).text = "Restaurada em 2005 pela Fiat, estilo art déco."
        findViewById<TextView>(R.id.tvCur3).text = "Oferece exposições, concertos e oficinas gratuitas."

        findViewById<Button>(R.id.btnCall).setOnClickListener {
            startActivity(Intent(Intent.ACTION_DIAL, Uri.parse("tel:156")))
        }

        findViewById<Button>(R.id.btnMap).setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Casa+Fiat+Belo+Horizonte")))
        }

        findViewById<Button>(R.id.btnPrev).setOnClickListener {
            startActivity(Intent(this, LagoaPampulhaActivity::class.java))
        }

        findViewById<Button>(R.id.btnExit).setOnClickListener {
            finishAffinity() // Encerra o app completamente
        }
    }
}