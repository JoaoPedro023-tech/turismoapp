package br.com.turismoapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MineiraoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mineirao)

        findViewById<TextView>(R.id.tvCur1).text = "Inaugurado em 1965."
        findViewById<TextView>(R.id.tvCur2).text = "Maior público: 132 mil pessoas."
        findViewById<TextView>(R.id.tvCur3).text = "Bola e juiz chegaram de helicóptero."

        findViewById<Button>(R.id.btnCall).setOnClickListener {
            startActivity(Intent(Intent.ACTION_DIAL, Uri.parse("tel:156")))
        }

        findViewById<Button>(R.id.btnMap).setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Mineirao+Belo+Horizonte")))
        }

        findViewById<Button>(R.id.btnNext).setOnClickListener {
            startActivity(Intent(this, MercadoCentralActivity::class.java))
        }

        findViewById<Button>(R.id.btnPrev).setOnClickListener {
            finish()
        }
    }
}