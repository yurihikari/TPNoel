package com.example.tpnoel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class GameOver : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_over)
        // calling the action bar
        val actionBar = supportActionBar
        // Change Title
        actionBar?.title = "Game Over"

        val retry_button = findViewById<Button>(R.id.retry_button)
        retry_button.setOnClickListener(){
            buttonClicked(retry_button);
        }
    }
    fun buttonClicked(view: View){
        //Intent pour ouvrir l'activité suivante
        val intent = Intent(this, Game::class.java)
        //Lancement de l'intent (changement d'écran)
        startActivity(intent)
    }
}