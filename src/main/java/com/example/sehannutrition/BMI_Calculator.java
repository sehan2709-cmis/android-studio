package com.example.sehannutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class BMI_Calculator extends AppCompatActivity {

    private EditText bmi_height;
    private EditText bmi_weight;
    private Button bmic_to_wc;
    private Button bmi_calculate;
    private TextView bmi_score;
    private TextView bmi_arrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_m_i__calculator);

        bmi_height = findViewById(R.id.bmi_height);
        bmi_weight = findViewById(R.id.bmi_weight);
        bmic_to_wc = findViewById(R.id.bmic_to_wc);
        bmi_calculate = findViewById(R.id.bmi_calculate);
        bmi_score = findViewById(R.id.bmi_score);
        bmi_arrow = findViewById(R.id.bmi_arrow);

        bmi_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bmiheight =  Double.parseDouble(bmi_height.getText().toString());
                double bmiweight =  Double.parseDouble(bmi_weight.getText().toString());
                Double heightresult = bmiheight/100;
                Double bmiresult = (double)(bmiweight/(heightresult*heightresult));
                String bmiscorestring = String.format("%.2f", bmiresult);
                bmi_score.setText(bmiscorestring);
                if(bmiresult < 18.5) {
                    bmi_arrow.setText("            ↓");
                }
                else if(bmiresult < 25) {
                    bmi_arrow.setText("                                ↓");
                }
                else if(bmiresult < 30) {
                    bmi_arrow.setText("                                                    ↓");
                }
                else if(bmiresult < 35) {
                    bmi_arrow.setText("                                                                         ↓");
                }
                else
                {
                    bmi_arrow.setText("                                                                                            ↓");
                }
            }
        });

        bmic_to_wc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BMI_Calculator.this, Weight_Converter.class);
                startActivity(intent);
            }
        });

        ImageButton bmi_to_conv = (ImageButton)findViewById(R.id.bmi_to_conv);
        ImageButton bmi_to_fam = (ImageButton)findViewById(R.id.bmi_to_fam);
        ImageButton bmi_to_main = (ImageButton)findViewById(R.id.bmi_to_main);
        ImageButton bmi_to_wc = (ImageButton)findViewById(R.id.bmi_to_wc);

        bmi_to_fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BMI_Calculator.this, Famous_Food_Calories.class);
                startActivity(intent);
            }
        });

        bmi_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BMI_Calculator.this, ActualMain.class);
                startActivity(intent);
            }
        });

        bmi_to_wc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BMI_Calculator.this, Weight_Converter.class);
                startActivity(intent);
            }
        });

        bmi_to_conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BMI_Calculator.this, Calorie_Calculator.class);
                startActivity(intent);
            }
        });
    }
}