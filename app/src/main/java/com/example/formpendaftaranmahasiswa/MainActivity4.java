package com.example.formpendaftaranmahasiswa;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        // Menemukan tombol back dengan id btnBack
        ImageView btnBack = findViewById(R.id.btnBack);

        // Menambahkan OnClickListener pada tombol back
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menutup MainActivity4 dan kembali ke aktivitas sebelumnya
                finish();
            }
        });
    }
}
