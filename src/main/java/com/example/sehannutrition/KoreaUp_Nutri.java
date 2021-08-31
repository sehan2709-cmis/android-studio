package com.example.sehannutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class KoreaUp_Nutri extends AppCompatActivity {
    private Button btn_jajang;
    private Button btn_ganjajang;
    private Button btn_chambong;
    private Button btn_udon;
    private Button btn_jjamjja;
    private Button btn_friedrice;
    private Button btn_jabchae;
    private Button btn_tangsu;
    private Button btn_kanpung;

    private TextView whynot_result_menu;
    private TextView whynot_result_calorie;
    private TextView whynot_result_fat;
    private TextView whynot_result_chol;
    private TextView whynot_result_sodium;
    private TextView whynot_result_carb;
    private TextView whynot_result_protein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korea_up__nutri);

        btn_jajang = findViewById(R.id.btn_jajang);
        btn_ganjajang = findViewById(R.id.btn_ganjajang);
        btn_chambong = findViewById(R.id.btn_chambong);
        btn_udon = findViewById(R.id.btn_udon);
        btn_jjamjja = findViewById(R.id.btn_jjamjja);
        btn_friedrice = findViewById(R.id.btn_friedrice);
        btn_jabchae = findViewById(R.id.btn_jabchae);
        btn_tangsu = findViewById(R.id.btn_tangsu);
        btn_kanpung = findViewById(R.id.btn_kanpung);

        whynot_result_menu = findViewById(R.id.whynot_result_menu);
        whynot_result_calorie = findViewById(R.id.whynot_result_calorie);
        whynot_result_fat = findViewById(R.id.whynot_result_fat);
        whynot_result_chol = findViewById(R.id.whynot_result_chol);
        whynot_result_sodium = findViewById(R.id.whynot_result_sodium);
        whynot_result_carb = findViewById(R.id.whynot_result_carb);
        whynot_result_protein = findViewById(R.id.whynot_result_protein);

        btn_jajang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Ja Jang Myeon (1 Dish)", "1134", "28.66", "31", "867", "186.93", "38.72");
            }
        });

        btn_ganjajang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Gan Ja Jang (1 Dish)", "1289", "31.1", "27", "782", "201.12", "30.1");
            }
        });

        btn_chambong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("ChamBong (1 Dish)", "764", "12", "222", "1599", "133.56", "28.79");
            }
        });

        btn_udon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Udon / Cold Noodle (1 Dish)", "572.5", "1.86", "15", "1869", "142.68", "21.12");
            }
        });

        btn_jjamjja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Jjam Jja Myeon (1 Dish)", "782.5", "10.5", "6", "1287.5", "177.6", "35.34");
            }
        });

        btn_friedrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Fried Rice (1 Dish)", "598", "33.69", "279", "1480", "112.56", "33.69");
            }
        });

        btn_jabchae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Rice with Japchae (1 Dish)", "673", "17.46", "0", "1364", "114.95", "16.3");
            }
        });

        btn_tangsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Sweet and Sour Pork (300 g)", "591", "23.93", "87", "447", "64.73", "26.99");
            }
        });

        btn_kanpung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Kanpunggi (200 g)", "450", "25.35", "67", "858", "33.46", "20.99");
            }
        });

        ImageButton ynw_to_conv = (ImageButton)findViewById(R.id.ynw_to_conv);
        ImageButton ynw_to_bmi = (ImageButton)findViewById(R.id.ynw_to_bmi);
        ImageButton ynw_to_main = (ImageButton)findViewById(R.id.ynw_to_main);
        ImageButton ynw_to_wc = (ImageButton)findViewById(R.id.ynw_to_wc);
        ImageButton ynw_to_fam = (ImageButton)findViewById(R.id.ynw_to_fam);

        ynw_to_bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KoreaUp_Nutri.this, BMI_Calculator.class);
                startActivity(intent);
            }
        });

        ynw_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KoreaUp_Nutri.this, ActualMain.class);
                startActivity(intent);
            }
        });

        ynw_to_wc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KoreaUp_Nutri.this, Weight_Converter.class);
                startActivity(intent);
            }
        });

        ynw_to_conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KoreaUp_Nutri.this, Calorie_Calculator.class);
                startActivity(intent);
            }
        });

        ynw_to_fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KoreaUp_Nutri.this, Famous_Food_Calories.class);
                startActivity(intent);
            }
        });
    }

    public void resultMake(String menu, String cal, String fat, String chol, String sodi, String carb, String prot) {
        whynot_result_menu.setText("MENU: " + menu);
        whynot_result_calorie.setText("Total Calorie: " + cal + " (kcal)");
        whynot_result_fat.setText("Fat: " + fat + " (g)");
        whynot_result_chol.setText("Cholesterol: " + chol + " (mg)");
        whynot_result_sodium.setText("Sodium: " + sodi + " (mg)");
        whynot_result_carb.setText("Carbohydrates: " + carb + " (g)");
        whynot_result_protein.setText("Protein: " + prot + " (g)");
    }
}