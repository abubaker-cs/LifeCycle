package org.abubaker.lifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import org.abubaker.lifecycle.databinding.ActivityAnotherBinding

class AnotherActivity : AppCompatActivity() {

    // Binding Object
    private lateinit var binding: ActivityAnotherBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        // Inflate Layout (XML)
        binding = DataBindingUtil.setContentView(this@AnotherActivity, R.layout.activity_another)

        setContentView(R.layout.activity_another)

        // Get the data and print it in the log.
        val keyValue1 = intent.getStringExtra("key1")
        Log.i("value 1", "$keyValue1")

        val keyValue2 = intent.getStringExtra("key2")
        Log.i("value 2", "$keyValue2")

    }
}