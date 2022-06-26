package com.example.chatapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.chatapplication.databinding.ActivityPhoneNumberBinding;
import com.google.firebase.FirebaseException;
import com.google.firebase.FirebaseTooManyRequestsException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

public class PhoneNumberActivity extends AppCompatActivity {
    ActivityPhoneNumberBinding binding;
    FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityPhoneNumberBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        auth=FirebaseAuth.getInstance();

        if(auth.getCurrentUser()!=null) {
            Intent intent = new Intent(PhoneNumberActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
        binding.phoneNumber.requestFocus();
        binding.continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(PhoneNumberActivity.this, otpActivity.class);
                    //intent.putExtra("phoneNumber", binding.phoneNumber.getText().toString());
                    intent.putExtra("phoneNumber", binding.phoneNumber.getText().toString());
                    startActivity(intent);
            }
        });
    }
}