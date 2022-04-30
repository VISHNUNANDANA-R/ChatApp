package com.example.chatapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import com.example.chatapplication.databinding.ActivityOtpBinding;

public class otpActivity extends AppCompatActivity {
    ActivityOtpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityOtpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        String phoneNumber=getIntent().getStringExtra("phoneNumber");
        binding.numberBox.setText("Verify "+phoneNumber);
    }
}