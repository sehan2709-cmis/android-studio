package com.example.sehannutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Calorie_Calculator_Result extends AppCompatActivity {

    private String food_namer;
    private String food_ingrr;
    private String food_totalcalr;
    private String food_fatr;
    private String food_cholr;
    private String food_sodr;
    private String food_carbr;
    private String food_protr;

    private TextView this_name;
    private TextView this_cal;
    private TextView this_ingredient;
    private TextView this_fat;
    private TextView this_cholesterol;
    private TextView this_sodium;
    private TextView this_carbohydrates;
    private TextView this_protein;
    private Button check_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie__calculator__result);

        this_name = findViewById(R.id.this_name);
        this_cal = findViewById(R.id.this_cal);
        this_ingredient = findViewById(R.id.this_ingredient);
        this_fat = findViewById(R.id.this_fat);
        this_cholesterol = findViewById(R.id.this_cholesterol);
        this_sodium = findViewById(R.id.this_sodium);
        this_carbohydrates = findViewById(R.id.this_carbohydrates);
        this_protein = findViewById(R.id.this_protein);

        Intent getTent = getIntent();
        food_namer = getTent.getStringExtra("food_name");
        food_ingrr = getTent.getStringExtra("food_ingr");
        food_totalcalr = getTent.getStringExtra("food_totalcal");
        food_fatr = getTent.getStringExtra("food_fat");
        food_cholr = getTent.getStringExtra("food_chol");
        food_sodr = getTent.getStringExtra("food_sod");
        food_carbr = getTent.getStringExtra("food_carb");
        food_protr = getTent.getStringExtra("food_prot");

        check_result = findViewById(R.id.check_result);

        check_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                this_name.setText(food_namer);
                this_ingredient.setText(food_ingrr);
                this_cal.setText(food_totalcalr + " (kcal)");
                this_fat.setText("Fat: " + food_fatr + " (g)");
                this_cholesterol.setText("Cholesterol: " + food_cholr  + " (g)");
                this_sodium.setText("Sodium: " + food_sodr  + " (g)");
                this_carbohydrates.setText("Carbohydrates: " + food_carbr  + " (g)");
                this_protein.setText("Protein: " + food_protr  + " (g)");
            }
        });

        ImageButton ccr_to_conv = (ImageButton)findViewById(R.id.ccr_to_conv);
        ImageButton ccr_to_bmi = (ImageButton)findViewById(R.id.ccr_to_bmi);
        ImageButton ccr_to_main = (ImageButton)findViewById(R.id.ccr_to_main);
        ImageButton ccr_to_wc = (ImageButton)findViewById(R.id.ccr_to_wc);
        ImageButton ccr_to_fam = (ImageButton)findViewById(R.id.ccr_to_fam);

        ccr_to_bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calorie_Calculator_Result.this, BMI_Calculator.class);
                startActivity(intent);
            }
        });

        ccr_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calorie_Calculator_Result.this, ActualMain.class);
                startActivity(intent);
            }
        });

        ccr_to_wc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calorie_Calculator_Result.this, Weight_Converter.class);
                startActivity(intent);
            }
        });

        ccr_to_conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calorie_Calculator_Result.this, Calorie_Calculator.class);
                startActivity(intent);
            }
        });

        ccr_to_fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calorie_Calculator_Result.this, Famous_Food_Calories.class);
                startActivity(intent);
            }
        });
    }
}