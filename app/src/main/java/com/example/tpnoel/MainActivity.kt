package com.example.tpnoel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // calling the action bar
        val actionBar = supportActionBar
        // Change Title
        actionBar?.title = "Login to play"

        val launch_button = findViewById<Button>(R.id.launch_button)
        launch_button.setOnClickListener(){
            buttonClicked(launch_button);
        }

    }

    fun buttonClicked(view: View){
        //Intent pour ouvrir l'activité suivante
        val intent = Intent(this, WaitingRoom::class.java)
        //Lancement de l'intent (changement d'écran)
        startActivity(intent)
    }
}