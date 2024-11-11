package com.example.formpendaftaranmahasiswa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Mengatur fungsi tombol back
        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kembali ke aktivitas sebelumnya
                onBackPressed();
            }
        });

        // Menghubungkan tombol Shopping List dengan MainActivity3
        Button btnShoppingList = findViewById(R.id.btnShoppingList);
        btnShoppingList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        // Menghubungkan tombol Notes dengan MainActivity4
        Button btnNotes = findViewById(R.id.btnNotes);
        btnNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(intent);
            }
        });

        // Menghubungkan tombol To-do List dengan MainActivity5
        Button btnTodoList = findViewById(R.id.btnTodoLIst);
        btnTodoList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity5.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
