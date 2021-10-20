package com.example.hggg.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.hggg.MainActivity
import com.example.hggg.databinding.LoginFragmentBinding

class loginPassword: AppCompatActivity() {

    private lateinit var loginViewModel: loginViewModel
    private lateinit var binding: LoginFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = LoginFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btEnter.setOnClickListener{
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
    }
}

