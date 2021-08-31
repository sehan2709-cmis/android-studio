package com.example.sehannutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Credit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);

        ImageButton cred_to_fam = (ImageButton)findViewById(R.id.cred_to_fam);
        ImageButton cred_to_conv = (ImageButton)findViewById(R.id.cred_to_conv);
        ImageButton cred_to_bmi = (ImageButton)findViewById(R.id.cred_to_bmi);
        ImageButton cred_to_main = (ImageButton)findViewById(R.id.cred_to_main);
        ImageButton cred_to_wc = (ImageButton)findViewById(R.id.cred_to_wc);

        cred_to_fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Credit.this, Famous_Food_Calories.class);
                startActivity(intent);
            }
        });

        cred_to_bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Credit.this, BMI_Calculator.class);
                startActivity(intent);
            }
        });

        cred_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Credit.this, ActualMain.class);
                startActivity(intent);
            }
        });

        cred_to_wc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Credit.this, Weight_Converter.class);
                startActivity(intent);
            }
        });

        cred_to_conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Credit.this, Calorie_Calculator.class);
                startActivity(intent);
            }
        });
    }
}