package com.bbreda.toolbars

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setToolbar()
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.search_menu -> Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show()
            R.id.cart_menu -> Toast.makeText(this, "Carrinho", Toast.LENGTH_LONG).show()
            R.id.config_menu -> Toast.makeText(this, "Configurações", Toast.LENGTH_SHORT).show()
            R.id.About_menu -> Toast.makeText(this, "Sobre", Toast.LENGTH_LONG).show()
        }

        return super.onOptionsItemSelected(item)
    }

    private fun setToolbar() {
        setSupportActionBar(toolbar)
    }
}
