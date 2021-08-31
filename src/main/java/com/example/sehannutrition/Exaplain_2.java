package com.example.sehannutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Exaplain_2 extends AppCompatActivity {
    private Button btn_gomain;
    private Button btn_ex1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exaplain_2);

        btn_gomain = findViewById(R.id.btn_gomain);
        btn_ex1 = findViewById(R.id.btn_ex1);

        btn_gomain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exaplain_2.this, ActualMain.class);
                startActivity(intent);
            }
        });

        btn_ex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exaplain_2.this, Explain_1.class);
                startActivity(intent);
            }
        });
    }
}