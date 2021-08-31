package com.example.sehannutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Japan_Nutri extends AppCompatActivity {
    private Button btn_curry;
    private Button btn_porkcut;
    private Button btn_omulet;
    private Button btn_ramian;
    private Button btn_cheesgas;
    private Button btn_gyozha;
    private Button btn_sushi;
    private Button btn_prokrice;
    private Button btn_koroke;

    private TextView jp_result_menu;
    private TextView jp_result_calorie;
    private TextView jp_result_fat;
    private TextView jp_result_chol;
    private TextView jp_result_sodium;
    private TextView jp_result_carb;
    private TextView jp_result_protein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japan__nutri);

        btn_curry = findViewById(R.id.btn_curry);
        btn_porkcut = findViewById(R.id.btn_porkcut);
        btn_omulet = findViewById(R.id.btn_omulet);
        btn_ramian = findViewById(R.id.btn_ramian);
        btn_cheesgas = findViewById(R.id.btn_cheesgas);
        btn_gyozha = findViewById(R.id.btn_gyozha);
        btn_sushi = findViewById(R.id.btn_sushi);
        btn_prokrice = findViewById(R.id.btn_prokrice);
        btn_koroke = findViewById(R.id.btn_koroke);

        jp_result_menu = findViewById(R.id.jp_result_menu);
        jp_result_calorie = findViewById(R.id.jp_result_calorie);
        jp_result_fat = findViewById(R.id.jp_result_fat);
        jp_result_chol = findViewById(R.id.jp_result_chol);
        jp_result_sodium = findViewById(R.id.jp_result_sodium);
        jp_result_carb = findViewById(R.id.jp_result_carb);
        jp_result_protein = findViewById(R.id.jp_result_protein);

        btn_curry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Curry (400 g)", "544", "14.91", "43", "600", "71.72", "34.54");
            }
        });

        btn_porkcut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Pork Cutlet (200 g)", "568", "30.6", "184", "901", "24.56", "45.16");
            }
        });

        btn_omulet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Omelet (100 g)", "153", "12.02", "356", "161", "0.69", "10.62");
            }
        });

        btn_ramian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Ramen (100 g)", "436", "10.29", "612", "2002", "63.27", "10.29");
            }
        });

        btn_cheesgas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Cheese Pork Cutlet (250 g)", "721", "41.57", "217", "1237", "25.41", "57.87");
            }
        });

        btn_gyozha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Gyoza (100 g)", "215", "8", "5", "290", "28", "8");
            }
        });

        btn_sushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Sushi (125 g)", "179", "0.52", "4", "745", "37.38", "5.37");
            }
        });

        btn_prokrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Rice with Pork Cutlet (250 g)", "605", "28.05", "168", "821", "41.49", "42.93");
            }
        });

        btn_koroke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Croquette (100 g)", "241", "14.1", "29", "858", "12.87", "15.02");
            }
        });

        ImageButton jp_to_conv = (ImageButton)findViewById(R.id.jp_to_conv);
        ImageButton jp_to_bmi = (ImageButton)findViewById(R.id.jp_to_bmi);
        ImageButton jp_to_main = (ImageButton)findViewById(R.id.jp_to_main);
        ImageButton jp_to_wc = (ImageButton)findViewById(R.id.jp_to_wc);
        ImageButton jp_to_fam = (ImageButton)findViewById(R.id.jp_to_fam);

        jp_to_bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Japan_Nutri.this, BMI_Calculator.class);
                startActivity(intent);
            }
        });

        jp_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Japan_Nutri.this, ActualMain.class);
                startActivity(intent);
            }
        });

        jp_to_wc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Japan_Nutri.this, Weight_Converter.class);
                startActivity(intent);
            }
        });

        jp_to_conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Japan_Nutri.this, Calorie_Calculator.class);
                startActivity(intent);
            }
        });

        jp_to_fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Japan_Nutri.this, Famous_Food_Calories.class);
                startActivity(intent);
            }
        });
    }

    public void resultMake(String menu, String cal, String fat, String chol, String sodi, String carb, String prot) {
        jp_result_menu.setText("MENU: " + menu);
        jp_result_calorie.setText("Total Calorie: " + cal + " (kcal)");
        jp_result_fat.setText("Fat: " + fat + " (g)");
        jp_result_chol.setText("Cholesterol: " + chol + " (mg)");
        jp_result_sodium.setText("Sodium: " + sodi + " (mg)");
        jp_result_carb.setText("Carbohydrates: " + carb + " (g)");
        jp_result_protein.setText("Protein: " + prot + " (g)");
    }
}