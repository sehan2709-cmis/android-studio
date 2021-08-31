package com.example.sehannutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Bunsik_Nutri extends AppCompatActivity {
    private Button btn_kimbab;
    private Button btn_tunakimbab;
    private Button btn_cheesekimbab;
    private Button btn_fishcake;
    private Button btn_dumpling;
    private Button btn_redrice;
    private Button btn_cheeserice;
    private Button btn_noodrice;
    private Button btn_sundae;

    private TextView bunsik_result_menu;
    private TextView bunsik_result_calorie;
    private TextView bunsik_result_fat;
    private TextView bunsik_result_chol;
    private TextView bunsik_result_sodium;
    private TextView bunsik_result_carb;
    private TextView bunsik_result_protein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bunsik__nutri);

        btn_kimbab = findViewById(R.id.btn_kimbab);
        btn_tunakimbab = findViewById(R.id.btn_tunakimbab);
        btn_cheesekimbab = findViewById(R.id.btn_cheesekimbab);
        btn_fishcake = findViewById(R.id.btn_fishcake);
        btn_dumpling = findViewById(R.id.btn_dumpling);
        btn_redrice = findViewById(R.id.btn_redrice);
        btn_cheeserice = findViewById(R.id.btn_cheeserice);
        btn_noodrice = findViewById(R.id.btn_noodrice);
        btn_sundae = findViewById(R.id.btn_sundae);

        bunsik_result_menu = findViewById(R.id.bunsik_result_menu);
        bunsik_result_calorie = findViewById(R.id.bunsik_result_calorie);
        bunsik_result_fat = findViewById(R.id.bunsik_result_fat);
        bunsik_result_chol = findViewById(R.id.bunsik_result_chol);
        bunsik_result_sodium = findViewById(R.id.bunsik_result_sodium);
        bunsik_result_carb = findViewById(R.id.bunsik_result_carb);
        bunsik_result_protein = findViewById(R.id.bunsik_result_protein);

        btn_kimbab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Gimbap (300 g)", "396", "7.43", "122", "331", "69.51", "10.43g");
            }
        });

        btn_tunakimbab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Tuna Gimbap (300 g)", "496 ", "26.92", "12", "257", "78.71", "26.92");
            }
        });

        btn_cheesekimbab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Cheese Gimbap (300 g)", "545 ", "11.45", "34", "457", "91.76", "15.82");
            }
        });

        btn_fishcake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Fish Cake (120 g)", "241", "12.59", "66", "335", "14.86", "16.38");
            }
        });

        btn_dumpling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Dumpling (30 g)", "41", "0.98", "18", "161", "3.54", "4.27");
            }
        });

        btn_redrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Tteokbokki (200 g)", "353", "3.66", "9", "313", "76.13", "8.79");
            }
        });

        btn_cheeserice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Cheese Tteokbokki (200 g)", "422", "15.2", "46", "470", "58.97", "15.89");
            }
        });

        btn_noodrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Rabokki (300 g)", "417 ", "13.83", "11", "670", "67.71", "10.32");
            }
        });

        btn_sundae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Sundae / Pig Intestines (170 g)", "269", "8.52", "364", "1259", "27.51", "18.97");
            }
        });

        ImageButton bun_to_conv = (ImageButton)findViewById(R.id.bun_to_conv);
        ImageButton bun_to_bmi = (ImageButton)findViewById(R.id.bun_to_bmi);
        ImageButton bun_to_main = (ImageButton)findViewById(R.id.bun_to_main);
        ImageButton bun_to_wc = (ImageButton)findViewById(R.id.bun_to_wc);
        ImageButton bun_to_fam = (ImageButton)findViewById(R.id.bun_to_fam);

        bun_to_bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bunsik_Nutri.this, BMI_Calculator.class);
                startActivity(intent);
            }
        });

        bun_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bunsik_Nutri.this, ActualMain.class);
                startActivity(intent);
            }
        });

        bun_to_wc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bunsik_Nutri.this, Weight_Converter.class);
                startActivity(intent);
            }
        });

        bun_to_conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bunsik_Nutri.this, Calorie_Calculator.class);
                startActivity(intent);
            }
        });

        bun_to_fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bunsik_Nutri.this, Famous_Food_Calories.class);
                startActivity(intent);
            }
        });
    }

    public void resultMake(String menu, String cal, String fat, String chol, String sodi, String carb, String prot) {
        bunsik_result_menu.setText("MENU: " + menu);
        bunsik_result_calorie.setText("Total Calorie: " + cal + " (kcal)");
        bunsik_result_fat.setText("Fat: " + fat + " (g)");
        bunsik_result_chol.setText("Cholesterol: " + chol + " (mg)");
        bunsik_result_sodium.setText("Sodium: " + sodi + " (mg)");
        bunsik_result_carb.setText("Carbohydrates: " + carb + " (g)");
        bunsik_result_protein.setText("Protein: " + prot + " (g)");
    }
}