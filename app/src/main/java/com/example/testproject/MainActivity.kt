package com.example.testproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initview()
        //actionbar
        val actionbar = supportActionBar
        actionbar?.hide()
        binding.button2.setOnClickListener {
            startActivity(

                Intent(this, Design::class.java)

            )
        }

    }
    private fun initview() {
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
