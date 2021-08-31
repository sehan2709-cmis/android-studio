package com.example.sehannutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Famous_Food_Calories extends AppCompatActivity {
    private Button chicken;
    private Button pizza;
    private Button bunsick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous__food__calories);

        chicken = findViewById(R.id.chicken);
        pizza = findViewById(R.id.pizza);
        bunsick = findViewById(R.id.bunsick);

        Button btn_nextp = (Button)findViewById(R.id.btn_nextp);
        btn_nextp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_Food_Calories.this, Famous_Food_Calories2.class);
                startActivity(intent);
            }
        });

        bunsick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_Food_Calories.this, Bunsik_Nutri.class);
                startActivity(intent);
            }
        });

        chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_Food_Calories.this, Chicken_Nutri.class);
                startActivity(intent);
            }
        });

        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_Food_Calories.this, Pizza_Nutri.class);
                startActivity(intent);
            }
        });

        ImageButton fam_to_conv = (ImageButton)findViewById(R.id.fam_to_conv);
        ImageButton fam_to_bmi = (ImageButton)findViewById(R.id.fam_to_bmi);
        ImageButton fam_to_main = (ImageButton)findViewById(R.id.fam_to_main);
        ImageButton fam_to_wc = (ImageButton)findViewById(R.id.fam_to_wc);

        fam_to_bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_Food_Calories.this, BMI_Calculator.class);
                startActivity(intent);
            }
        });

        fam_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_Food_Calories.this, ActualMain.class);
                startActivity(intent);
            }
        });

        fam_to_wc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_Food_Calories.this, Weight_Converter.class);
                startActivity(intent);
            }
        });

        fam_to_conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_Food_Calories.this, Calorie_Calculator.class);
                startActivity(intent);
            }
        });
    }
}