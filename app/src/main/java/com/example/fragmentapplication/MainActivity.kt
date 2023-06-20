package com.example.fragmentapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Activity Created", Toast.LENGTH_LONG)
            .show()
    }


        override fun onStart() {
            super.onStart()
            setContentView(R.layout.activity_main)
            Toast.makeText(this, "Activity Started", Toast.LENGTH_LONG)
                .show()

        }



    override fun onResume() {
        super.onResume()
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Activity Resumed", Toast.LENGTH_LONG)
            .show()

    }

    override fun onPause() {
        super.onPause()
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Activity Paused", Toast.LENGTH_LONG)
            .show()

    }

    override fun onRestart() {
        super.onRestart()
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Activity Restarted", Toast.LENGTH_LONG)
            .show()
    }

    override fun onStop() {
        super.onStop()
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Activity Stopped", Toast.LENGTH_LONG)
            .show()
    }




}


