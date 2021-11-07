package org.abubaker.lifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // onCreate
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("onCreate method", "is called...")
    }

    // onStart
    override fun onStart() {
        super.onStart()
        Log.e("onStart method", "is called...")
    }

    // onResume
    override fun onResume() {
        super.onResume()
        Log.e("onResume method", "is called...")
    }

    // onPause
    override fun onPause() {
        super.onPause()
        Log.e("onPause method", "is called...")
    }

    // onStop
    override fun onStop() {
        super.onStop()
        Log.e("onStop method", "is called...")
    }

    // onRestart
    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart method", "is called...")
    }

    // onDestroy
    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy method", "is called...")
    }
}