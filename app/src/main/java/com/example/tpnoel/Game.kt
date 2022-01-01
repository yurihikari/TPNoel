package com.example.tpnoel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import androidx.constraintlayout.widget.ConstraintSet

class Game : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        // calling the action bar
        val actionBar = supportActionBar

        val join_button = findViewById<Button>(R.id.join_button)
        join_button?.setOnClickListener(){ buttonClicked(join_button) }

        val button_1 = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.button_1)
        button_1?.setOnClickListener(){
            buttonClicked(button_1)
        }
        // Change Title
        actionBar?.title = "Game"
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
        val intent = Intent(this, GameOver::class.java)
        //Lancement de l'intent (changement d'écran)
        startActivity(intent)
    }
}