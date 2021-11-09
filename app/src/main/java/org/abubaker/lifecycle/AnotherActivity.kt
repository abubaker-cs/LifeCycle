package org.abubaker.lifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import org.abubaker.lifecycle.databinding.ActivityAnotherBinding

class AnotherActivity : AppCompatActivity() {

    // Binding Object
    private lateinit var binding: ActivityAnotherBinding

    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Activity Launch

    // 01 - onCreate()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        // Inflate Layout (XML)
        binding = DataBindingUtil.setContentView(this@AnotherActivity, R.layout.activity_another)
        setContentView(R.layout.activity_another)

        /**
         * getStringExtra() - Receive DATA to another Activity
         */

        // Get the data and print it in the log.
        val user = intent.getStringExtra("username")
        Log.i("User: ", "$user")

        val pass = intent.getStringExtra("password")
        Log.i("Pass: ", "$pass")

    }

}