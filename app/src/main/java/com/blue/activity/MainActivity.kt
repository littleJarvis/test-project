package com.blue.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.blue.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityMainBinding.inflate(layoutInflater).apply { setContentView(root) }
    }

    public fun onFirstClick(v: View) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
}
