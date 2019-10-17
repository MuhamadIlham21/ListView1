package com.app.id.praktek2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lv: ListView = findViewById(R.id.lvShowdata)
        var city = arrayOf("Kotlin", "Python", "Ruby", "JavaScript", "PHP")

        val adapter = ArrayAdapter(this,
            R.layout.list_data, city)

        lv.setAdapter(adapter)

    }
}
