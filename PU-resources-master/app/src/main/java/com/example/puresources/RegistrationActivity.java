package com.example.puresources;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrationActivity extends AppCompatActivity {
    Button register;
    EditText ema1il,pass1word;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        register = findViewById(R.id.r2);
        ema1il = findViewById(R.id.email2);
        pass1word = findViewById(R.id.password2);
        mAuth = FirebaseAuth.getInstance();

        register.setOnClickListener( view ->  {
                 createUser();
            });
        }

    private void createUser(){
        String email = ema1il.getText().toString();
        String password = pass1word.getText().toString();

        if (TextUtils.isEmpty(email)){
            ema1il.setError("email cannot be empty");
            ema1il.requestFocus();
        } else if (TextUtils.isEmpty(password)) {
            pass1word.setError("password cannot be empty");
            pass1word.requestFocus();
        } else {
            mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()){
                        Toast.makeText(RegistrationActivity.this, "User registered successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(RegistrationActivity.this,LoginActivity.class));
                    } else {
                        Toast.makeText(RegistrationActivity.this, "Registration Error :" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}
