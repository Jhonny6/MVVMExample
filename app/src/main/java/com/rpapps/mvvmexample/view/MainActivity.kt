package com.rpapps.mvvmexample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.rpapps.mvvmexample.databinding.ActivityMainBinding
import com.rpapps.mvvmexample.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    val quoteViewModel : QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.quoteModel.observe(this, Observer {
            binding.quote.text = it.quote
            binding.quoteAuthor.text = it.quoteAuthor
        })

        binding.viewContainer.setOnClickListener {
            quoteViewModel.randomQuote()
        }
    }
}