package com.dimitrisligi.codewithmitchmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SimpleAdapter
import androidx.cursoradapter.widget.SimpleCursorAdapter
import androidx.viewbinding.ViewBinding
import com.dimitrisligi.codewithmitchmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}