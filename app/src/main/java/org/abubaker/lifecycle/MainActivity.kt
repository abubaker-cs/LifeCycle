package org.abubaker.lifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import org.abubaker.lifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Binding Object
    private lateinit var binding: ActivityMainBinding

    // onCreate
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        // Inflate Layout (XML)
        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)

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