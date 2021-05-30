package com.ads5.appdiegoecommerce

import android.icu.text.CaseMap
import android.os.Bundle
import android.widget.TextView
import android.widget.Toolbar
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.ActionMode
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.ads5.appdiegoecommerce.databinding.ActivityInfoProdutoBinding

class InfoProduto : AppCompatActivity() {

    lateinit var toolbar: androidx.appcompat.widget.Toolbar
    lateinit var textTitle: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_info_produto)

        toolbar = findViewById(R.id.toobar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        textTitle = findViewById(R.id.toobar_title)
        textTitle.text = "Calças Jeans"

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    }