package org.abubaker.lifecycle

import android.os.Bundle
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

    }
}