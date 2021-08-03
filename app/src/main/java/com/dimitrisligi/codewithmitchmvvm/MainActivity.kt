package com.dimitrisligi.codewithmitchmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SimpleAdapter
import android.widget.Toast
import androidx.cursoradapter.widget.SimpleCursorAdapter
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.dimitrisligi.codewithmitchmvvm.databinding.ActivityMainBinding
import viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)



//        viewModel.user.observe(this, {
//            binding?.tvUserTv?.text = it.toString()
//        })
//
//
//        viewModel.setUserID("1")


        viewModel.secondUser.observe(this,{
            binding?.tvUserTv?.text = it.data.toString()
        })
    }


    override fun onDestroy() {
        super.onDestroy()
        binding = null
        viewModel.cancelJobs()
    }
}