package com.example.sehannutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Korea_Nutri extends AppCompatActivity {
    private Button btn_bibim;
    private Button btn_knifenood;
    private Button btn_eggjjim;
    private Button btn_jabcahee;
    private Button btn_sundubu;
    private Button btn_kimchi;
    private Button btn_fire;
    private Button btn_prokbell;
    private Button btn_budae;

    private TextView kr_result_menu;
    private TextView kr_result_calorie;
    private TextView kr_result_fat;
    private TextView kr_result_chol;
    private TextView kr_result_sodium;
    private TextView kr_result_carb;
    private TextView kr_result_protein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korea__nutri);

        btn_bibim = findViewById(R.id.btn_bibim);
        btn_knifenood = findViewById(R.id.btn_knifenood);
        btn_eggjjim = findViewById(R.id.btn_eggjjim);
        btn_jabcahee = findViewById(R.id.btn_jabcahee);
        btn_sundubu = findViewById(R.id.btn_sundubu);
        btn_kimchi = findViewById(R.id.btn_kimchi);
        btn_fire = findViewById(R.id.btn_fire);
        btn_prokbell = findViewById(R.id.btn_prokbell);
        btn_budae = findViewById(R.id.btn_budae);

        kr_result_menu = findViewById(R.id.kr_result_menu);
        kr_result_calorie = findViewById(R.id.kr_result_calorie);
        kr_result_fat = findViewById(R.id.kr_result_fat);
        kr_result_chol = findViewById(R.id.kr_result_chol);
        kr_result_sodium = findViewById(R.id.kr_result_sodium);
        kr_result_carb = findViewById(R.id.kr_result_carb);
        kr_result_protein = findViewById(R.id.kr_result_carb);

        btn_bibim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Bibimbap (400 g)", "586", "13.99", "238", "433", "89.78", "22.05");
            }
        });

        btn_knifenood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Noodle Soup (350 g)", "420", "8.79", "23", "566", "71.74", "16.04");
            }
        });

        btn_eggjjim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Egg Custard (150 g)", "212", "15.16", "494", "392", "3.11", "15.08");
            }
        });

        btn_jabcahee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Japchae (150 g)", "285", "10.16", "0", "808", "43.23", "7.59");
            }
        });

        btn_sundubu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Tofu Stew (300 g)", "259", "18.25", "121", "516", "5.62", "18.25");
            }
        });

        btn_kimchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Kimchi Stew (200 g)", "121", "7.51", "15", "442", "6.47", "7.51");
            }
        });

        btn_fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Bulgogi (300 g)", "486", "23.86", "103", "583", "14.77", "48.36");
            }
        });

        btn_prokbell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Pork Belly (200 g)", "661", "56.34", "121", "1924", "1.18", "34.47");
            }
        });

        btn_budae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Sausage Stew (400 g)", "626", "38.55", "79", "2913", "41.11", "27.7");
            }
        });
        ImageButton kr_to_conv = (ImageButton)findViewById(R.id.kr_to_conv);
        ImageButton kr_to_bmi = (ImageButton)findViewById(R.id.kr_to_bmi);
        ImageButton kr_to_main = (ImageButton)findViewById(R.id.kr_to_main);
        ImageButton kr_to_wc = (ImageButton)findViewById(R.id.kr_to_wc);
        ImageButton kr_to_fam = (ImageButton)findViewById(R.id.kr_to_fam);

        kr_to_bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Korea_Nutri.this, BMI_Calculator.class);
                startActivity(intent);
            }
        });

        kr_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Korea_Nutri.this, ActualMain.class);
                startActivity(intent);
            }
        });

        kr_to_wc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Korea_Nutri.this, Weight_Converter.class);
                startActivity(intent);
            }
        });

        kr_to_conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Korea_Nutri.this, Calorie_Calculator.class);
                startActivity(intent);
            }
        });

        kr_to_fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Korea_Nutri.this, Famous_Food_Calories.class);
                startActivity(intent);
            }
        });
    }

    public void resultMake(String menu, String cal, String fat, String chol, String sodi, String carb, String prot) {
        kr_result_menu.setText("MENU: " + menu);
        kr_result_calorie.setText("Total Calorie: " + cal + " (kcal)");
        kr_result_fat.setText("Fat: " + fat + " (g)");
        kr_result_chol.setText("Cholesterol: " + chol + " (mg)");
        kr_result_sodium.setText("Sodium: " + sodi + " (mg)");
        kr_result_carb.setText("Carbohydrates: " + carb + " (g)");
        kr_result_protein.setText("Protein: " + prot + " (g)");
    }
}