package com.example.yatra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.yatra.databinding.ActivityVerifyOtpBinding
import com.google.firebase.auth.FirebaseAuth

class VerifyOtpActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVerifyOtpBinding
    private lateinit var mAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityVerifyOtpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mAuth= FirebaseAuth.getInstance()
        var number=intent.getStringExtra("phoneNumber")
        binding.numberEdit.text=number
        var verificationId=intent.getStringExtra("verificationId")
        binding.sendTxt.setOnClickListener{
            Toast.makeText(this,"Code sent successfully",Toast.LENGTH_SHORT).show()
        }
        binding.pinView.setHideLineWhenFilled(true)
        binding.pinView.setAnimationEnable(true)
        binding.verifyButton.setOnClickListener{

        }
    }
}