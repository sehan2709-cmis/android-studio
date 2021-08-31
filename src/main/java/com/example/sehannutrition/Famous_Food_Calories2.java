package com.example.sehannutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Famous_Food_Calories2 extends AppCompatActivity {
    private Button whynotwork;
    private Button hansick;
    private Button illsick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous__food__calories2);

        whynotwork = findViewById(R.id.whynotwork);
        hansick = findViewById(R.id.hansick);
        illsick = findViewById(R.id.illsick);

        Button btn_privp = (Button)findViewById(R.id.btn_privp);
        btn_privp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_Food_Calories2.this, Famous_Food_Calories.class);
                startActivity(intent);
            }
        });

        illsick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_Food_Calories2.this, Japan_Nutri.class);
                startActivity(intent);
            }
        });

        hansick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_Food_Calories2.this, Korea_Nutri.class);
                startActivity(intent);
            }
        });

        whynotwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_Food_Calories2.this, KoreaUp_Nutri.class);
                startActivity(intent);
            }
        });

        ImageButton fam2_to_conv = (ImageButton)findViewById(R.id.fam2_to_conv);
        ImageButton fam2_to_bmi = (ImageButton)findViewById(R.id.fam2_to_bmi);
        ImageButton fam2_to_main = (ImageButton)findViewById(R.id.fam2_to_main);
        ImageButton fam2_to_wc = (ImageButton)findViewById(R.id.fam2_to_wc);

        fam2_to_bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_Food_Calories2.this, BMI_Calculator.class);
                startActivity(intent);
            }
        });

        fam2_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_Food_Calories2.this, ActualMain.class);
                startActivity(intent);
            }
        });

        fam2_to_wc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_Food_Calories2.this, Weight_Converter.class);
                startActivity(intent);
            }
        });

        fam2_to_conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_Food_Calories2.this, Calorie_Calculator.class);
                startActivity(intent);
            }
        });
    }
}