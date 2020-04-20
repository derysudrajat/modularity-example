package com.derysudrajat.modularity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Modul App"
        btnOpen.setOnClickListener {
            val intent = Intent()
            intent.setClassName(
                this@MainActivity,
                "com.derysudrajat.modula.ModulActivity"
            )
            startActivity(intent)
        }
    }
}
