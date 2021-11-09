package org.abubaker.lifecycle

import android.content.Intent
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

        binding.btnSubmit.setOnClickListener {


            val intent = Intent(this@MainActivity, AnotherActivity::class.java).apply {
                putExtra("key1", "Value1")
                putExtra("key2", "Value2")

            }


        }

    }

    /**
     *  Activity Launch
     *      1. onCreate()
     *      2. onStart() <<< onRestart()
     *      3. onResume()
     *
     *  Activity Running
     *      4. onPause()
     *      5. onStop() >>> onRestart()
     *      6. onDestroy()
     *
     *  Activity Shutdown
     *
     *  onStop() > App Process Killed (For Memory Optimization) > onCreate()
     */

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