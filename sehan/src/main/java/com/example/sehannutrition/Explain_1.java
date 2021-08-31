package com.example.sehannutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Explain_1 extends AppCompatActivity {
    private Button btn_next1;
    private Button btn_skip1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explain_1);

        btn_next1 = findViewById(R.id.btn_next1);
        btn_skip1 = findViewById(R.id.btn_skip1);


        btn_next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Explain_1.this, Exaplain_2.class);
                startActivity(intent);
            }
        });

        btn_skip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Explain_1.this, ActualMain.class);
                startActivity(intent);
            }
        });
    }
}