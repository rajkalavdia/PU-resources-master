package com.example.puresources;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    Button login;
    EditText emai1l, passwor1d;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.l2);
        emai1l = findViewById(R.id.email1);
        passwor1d = findViewById(R.id.password1);
        mAuth = FirebaseAuth.getInstance();

        login.setOnClickListener(view -> {
            loginUser();
        });
    }

    private void loginUser(){
        String email = emai1l.getText().toString();
        String password = passwor1d.getText().toString();

        if (TextUtils.isEmpty(email)){
            emai1l.setError("email cannot be empty");
            emai1l.requestFocus();
        } else if (TextUtils.isEmpty(password)) {
            passwor1d.setError("password cannot be empty");
            passwor1d.requestFocus();
        } else {
            mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()){
                        Toast.makeText(LoginActivity.this, "User logged in successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(LoginActivity.this, ListViewOfFaculty.class));
                    } else {
                        Toast.makeText(LoginActivity.this, "Login Error :" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                    }
                }
            });
        }
    }
}