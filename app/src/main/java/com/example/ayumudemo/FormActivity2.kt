package com.example.ayumudemo

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity


class FormActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form2)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "kekka"


    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()

    }
}

