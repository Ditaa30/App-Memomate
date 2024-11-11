package com.example.formpendaftaranmahasiswa;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    String UserName="Admin";
    String Password="111111";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Variable
        EditText textUser = findViewById(R.id.etUserName);
        EditText textPassword = findViewById(R.id.etPassword);
        Button btnLogin = findViewById(R.id.btnlogin);

        //jika Tombol di klik/event
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textUser.getText().toString().equalsIgnoreCase(UserName) && textPassword.getText().toString().equalsIgnoreCase(Password)){
                    startActivity(new Intent(MainActivity.this,MainActivity2.class));
                }else {
                    Toast.makeText(MainActivity.this, "User Name Atau Password Salah", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

}