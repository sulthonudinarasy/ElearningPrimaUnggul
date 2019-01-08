package com.sulthon.elearningprimaunggul.ui.soal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sulthon.elearningprimaunggul.R;
import com.sulthon.elearningprimaunggul.ui.nilai.ActivityNilai;


public class SoalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);

        Button btnNilai = findViewById(R.id.lihat_nilai);
        btnNilai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SoalActivity.this,ActivityNilai.class));
            }
        });
    }

}
