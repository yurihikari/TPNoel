package com.example.tpnoel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button

class WaitingRoom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_waiting_room)
        // calling the action bar
        val actionBar = supportActionBar

        val join_button = findViewById<Button>(R.id.join_button)

        join_button?.setOnClickListener(){ buttonClicked(join_button) }
        // Change Title
        actionBar?.title = "Waiting Room"
        // showing the back button in action bar
        actionBar?.setDisplayHomeAsUpEnabled(true)


    }
     override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onContextItemSelected(item)
    }

    fun buttonClicked(view: View){
        //Intent pour ouvrir l'activité suivante
        val intent = Intent(this, Game::class.java)
        //Lancement de l'intent (changement d'écran)
        startActivity(intent)
    }
}