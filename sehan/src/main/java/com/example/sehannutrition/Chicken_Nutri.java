package com.example.sehannutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Chicken_Nutri extends AppCompatActivity {
    private Button btn_fry;
    private Button btn_red;
    private Button btn_green;
    private Button btn_soy;
    private Button btn_galic;
    private Button btn_onion;
    private Button btn_hony;
    private Button btn_bhc;
    private Button btn_bbq;

    private TextView chicken_result_menu;
    private TextView chicken_result_calorie;
    private TextView chicken_result_fat;
    private TextView chicken_result_chol;
    private TextView chicken_result_sodium;
    private TextView chicken_result_carb;
    private TextView chicken_result_protein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken__nutri);


        btn_fry = findViewById(R.id.btn_fry);
        btn_red = findViewById(R.id.btn_red);
        btn_green = findViewById(R.id.btn_green);
        btn_soy = findViewById(R.id.btn_soy);
        btn_galic = findViewById(R.id.btn_galic);
        btn_onion = findViewById(R.id.btn_onion);
        btn_hony = findViewById(R.id.btn_hony);
        btn_bhc = findViewById(R.id.btn_bhc);
        btn_bbq = findViewById(R.id.btn_bbq);

        chicken_result_menu = findViewById(R.id.chicken_result_menu);
        chicken_result_calorie = findViewById(R.id.chicken_result_calorie);
        chicken_result_fat = findViewById(R.id.chicken_result_fat);
        chicken_result_chol = findViewById(R.id.chicken_result_chol);
        chicken_result_sodium = findViewById(R.id.chicken_result_sodium);
        chicken_result_carb = findViewById(R.id.chicken_result_carb);
        chicken_result_protein = findViewById(R.id.chicken_result_protein);

        btn_fry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Fried Chicken (1 chicken)", "1930", "122.00", "3580", "3300", "106.00", "101.00");
            }
        });

        btn_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Seasoned Chicken (1 chicken)", "2880", "180.06", "3706", "2312", "137.25", "164.38");
            }
        });

        btn_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Green Onion Chicken (1 chicken)", "685", "37.73", "2930", "888", "32.06", "50.12");
            }
        });

        btn_soy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Soy Sauce Chicken (1 chicken)", "1379", "86.43", "3670", "1028", "55.58", "87.88");
            }
        });

        btn_galic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Garlic Chicken (1 chicken)", "1383", "86.68", "3690", "966", "54.52", "89.03");
            }
        });

        btn_onion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Onion Chicken (1 chicken)", "2464", "27.60", "4600", "683", "62.10", "23.00");
            }
        });

        btn_hony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Kyochon Honey Combo (1 chicken)", "1480", "105.00", "2200", "1940", "52.00", "80.00");
            }
        });

        btn_bhc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("BHC Ppu Ling Keul / Sprinkle (1 chicken)", "2610", "189.00", "900", "765", "72", "162.00");
            }
        });

        btn_bbq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("BBQ Golden Olive Chicken (1 chicken)", "2025", "20.7", "3506", "4950", "104", "207");
            }
        });


        ImageButton chick_to_conv = (ImageButton)findViewById(R.id.chick_to_conv);
        ImageButton chick_to_bmi = (ImageButton)findViewById(R.id.chick_to_bmi);
        ImageButton chick_to_main = (ImageButton)findViewById(R.id.chick_to_main);
        ImageButton chick_to_wc = (ImageButton)findViewById(R.id.chick_to_wc);
        ImageButton chick_to_fam = (ImageButton)findViewById(R.id.chick_to_fam);

        chick_to_bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chicken_Nutri.this, BMI_Calculator.class);
                startActivity(intent);
            }
        });

        chick_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chicken_Nutri.this, ActualMain.class);
                startActivity(intent);
            }
        });

        chick_to_wc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chicken_Nutri.this, Weight_Converter.class);
                startActivity(intent);
            }
        });

        chick_to_conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chicken_Nutri.this, Calorie_Calculator.class);
                startActivity(intent);
            }
        });

        chick_to_fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chicken_Nutri.this, Famous_Food_Calories.class);
                startActivity(intent);
            }
        });
    }

    public void resultMake(String menu, String cal, String fat, String chol, String sodi, String carb, String prot) {
        chicken_result_menu.setText("MENU: " + menu);
        chicken_result_calorie.setText("Total Calorie: " + cal + " (kcal)");
        chicken_result_fat.setText("Fat: " + fat + " (g)");
        chicken_result_chol.setText("Cholesterol: " + chol + " (mg)");
        chicken_result_sodium.setText("Sodium: " + sodi + " (mg)");
        chicken_result_carb.setText("Carbohydrates: " + carb + " (g)");
        chicken_result_protein.setText("Protein: " + prot + " (g)");
    }
}