package br.com.turismoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnMineirao).setOnClickListener {
            startActivity(Intent(this, MineiraoActivity::class.java))
        }
        findViewById<Button>(R.id.btnMercado).setOnClickListener {
            startActivity(Intent(this, MercadoCentralActivity::class.java))
        }
        findViewById<Button>(R.id.btnPraca).setOnClickListener {
            startActivity(Intent(this, PracaLiberdadeActivity::class.java))
        }
        findViewById<Button>(R.id.btnLagoa).setOnClickListener {
            startActivity(Intent(this, LagoaPampulhaActivity::class.java))
        }
        findViewById<Button>(R.id.btnCasaFiat).setOnClickListener {
            startActivity(Intent(this, CasaFiatActivity::class.java))
        }
    }
}