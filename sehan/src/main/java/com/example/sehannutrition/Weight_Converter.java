package com.example.sehannutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Weight_Converter extends AppCompatActivity {

    private EditText edit_weight;
    private Button btn_lb;
    private Button btn_g;
    private Button btn_kg;
    private TextView tv_lb;
    private TextView tv_g;
    private TextView tv_kg;

    private EditText edit_height;
    private Button btn_ft;
    private Button btn_cm;
    private Button btn_m;
    private TextView tv_ft;
    private TextView tv_cm;
    private TextView tv_m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight__converter);
        edit_weight = findViewById(R.id.edit_weight);
        btn_lb = findViewById(R.id.btn_lb);
        btn_g = findViewById(R.id.btn_g);
        btn_kg = findViewById(R.id.btn_kg);
        tv_lb = findViewById(R.id.tv_lb);
        tv_g = findViewById(R.id.tv_g);
        tv_kg = findViewById(R.id.tv_kg);
        edit_height = findViewById(R.id.edit_height);
        btn_ft = findViewById(R.id.btn_ft);
        btn_cm = findViewById(R.id.btn_cm);
        btn_m = findViewById(R.id.btn_m);
        tv_ft = findViewById(R.id.tv_ft);
        tv_cm = findViewById(R.id.tv_cm);
        tv_m = findViewById(R.id.tv_m);

        btn_lb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double lbdouble = Double.parseDouble(edit_weight.getText().toString());
                double gdouble = lbdouble * 453.592;
                double kgdouble = lbdouble * 0.453592;
                String lbinstring = String.format("%.2f", lbdouble);
                String ginstring = String.format("%.2f", gdouble);
                String kginstring = String.format("%.2f", kgdouble);
                tv_lb.setText(lbinstring);
                tv_g.setText(ginstring);
                tv_kg.setText(kginstring);
            }
        });

        btn_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double gdouble = Double.parseDouble(edit_weight.getText().toString());
                double lbdouble = gdouble * 0.00220462;
                double kgdouble = gdouble * 0.001;
                String lbinstring = String.format("%.2f", lbdouble);
                String ginstring = String.format("%.2f", gdouble);
                String kginstring = String.format("%.2f", kgdouble);
                tv_lb.setText(lbinstring);
                tv_g.setText(ginstring);
                tv_kg.setText(kginstring);
            }
        });

        btn_kg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kgdouble = Double.parseDouble(edit_weight.getText().toString());
                double gdouble = kgdouble * 1000;
                double lbdouble = kgdouble * 2.20462;
                String lbinstring = String.format("%.2f", lbdouble);
                String ginstring = String.format("%.2f", gdouble);
                String kginstring = String.format("%.2f", kgdouble);
                tv_lb.setText(lbinstring);
                tv_g.setText(ginstring);
                tv_kg.setText(kginstring);
            }
        });

        btn_ft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double ftdouble = Double.parseDouble(edit_height.getText().toString());
                double cmdouble = ftdouble * 30.48;
                double mdouble = ftdouble * 0.3048;
                String ftinstring = String.format("%.2f", ftdouble);
                String cminstring = String.format("%.2f", cmdouble);
                String minstring = String.format("%.2f", mdouble);
                tv_ft.setText(ftinstring);
                tv_cm.setText(cminstring);
                tv_m.setText(minstring);
            }
        });

        btn_cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double cmdouble = Double.parseDouble(edit_height.getText().toString());
                double ftdouble = cmdouble * 0.0328084;
                double mdouble = cmdouble * 0.01;
                String ftinstring = String.format("%.2f", ftdouble);
                String cminstring = String.format("%.2f", cmdouble);
                String minstring = String.format("%.2f", mdouble);
                tv_ft.setText(ftinstring);
                tv_cm.setText(cminstring);
                tv_m.setText(minstring);
            }
        });

        btn_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double mdouble = Double.parseDouble(edit_height.getText().toString());
                double cmdouble = mdouble * 100;
                double ftdouble = mdouble * 3.28084;
                String ftinstring = String.format("%.2f", ftdouble);
                String cminstring = String.format("%.2f", cmdouble);
                String minstring = String.format("%.2f", mdouble);
                tv_ft.setText(ftinstring);
                tv_cm.setText(cminstring);
                tv_m.setText(minstring);
            }
        });

        ImageButton wc_to_conv = (ImageButton)findViewById(R.id.wc_to_conv);
        ImageButton wc_to_bmi = (ImageButton)findViewById(R.id.wc_to_bmi);
        ImageButton wc_to_main = (ImageButton)findViewById(R.id.wc_to_main);
        ImageButton wc_to_fam = (ImageButton)findViewById(R.id.wc_to_fam);

        wc_to_bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Weight_Converter.this, BMI_Calculator.class);
                startActivity(intent);
            }
        });

        wc_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Weight_Converter.this, ActualMain.class);
                startActivity(intent);
            }
        });

        wc_to_fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Weight_Converter.this, Famous_Food_Calories.class);
                startActivity(intent);
            }
        });

        wc_to_conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Weight_Converter.this, Calorie_Calculator.class);
                startActivity(intent);
            }
        });
    }
}