package com.example.sehannutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Pizza_Nutri extends AppCompatActivity {
    private Button btn_pepporini;
    private Button btn_hawaiian;
    private Button btn_cheese;
    private Button btn_sweet;
    private Button btn_bulgo;
    private Button btn_gorg;
    private Button btn_pota;
    private Button btn_shrimp;
    private Button btn_steak;

    private TextView pizza_result_menu;
    private TextView pizza_result_calorie;
    private TextView pizza_result_fat;
    private TextView pizza_result_chol;
    private TextView pizza_result_sodium;
    private TextView pizza_result_carb;
    private TextView pizza_result_protein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza__nutri);

        btn_pepporini = findViewById(R.id.btn_pepporini);
        btn_hawaiian = findViewById(R.id.btn_hawaiian);
        btn_cheese = findViewById(R.id.btn_cheese);
        btn_sweet = findViewById(R.id.btn_sweet);
        btn_bulgo = findViewById(R.id.btn_bulgo);
        btn_gorg = findViewById(R.id.btn_gorg);
        btn_pota = findViewById(R.id.btn_pota);
        btn_shrimp = findViewById(R.id.btn_shrimp);
        btn_steak = findViewById(R.id.btn_steak);

        pizza_result_menu = findViewById(R.id.pizza_result_menu);
        pizza_result_calorie = findViewById(R.id.pizza_result_calorie);
        pizza_result_fat = findViewById(R.id.pizza_result_fat);
        pizza_result_chol = findViewById(R.id.pizza_result_chol);
        pizza_result_sodium = findViewById(R.id.pizza_result_sodium);
        pizza_result_carb = findViewById(R.id.pizza_result_carb);
        pizza_result_protein = findViewById(R.id.pizza_result_protein);

        btn_pepporini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Pepporini Pizza (36cm)", "2647", "107.7", "259", "6061", "301.7", "118.24");
            }
        });

        btn_hawaiian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Hawaiian Pizza (36cm)", "2389", "86.07", "190", "4842", "294.85", "107.79");
            }
        });

        btn_cheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Cheese Pizza (36cm)", "1904", "81.01", "166", "3705", "209.28", "85.08");
            }
        });

        btn_sweet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Sweet Potato Pizza (36cm)", "2850", "127.31", "315", "6880", "296.44", "128.71");
            }
        });

        btn_bulgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Bulgogi Pizza (36cm)", "2352", "71.44", "123", "3510", "318.96", "101.2");
            }
        });

        btn_gorg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Gorgonzola Pizza (36cm)", "1895", "70.17", "129", "4734", "241.58", "68.97");
            }
        });

        btn_pota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Potato Pizza (36cm)", "2155", "51.94", "0", "2823", "366.48", "50.62");
            }
        });

        btn_shrimp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Shrimp Pizza (36cm)", "2304", "104", "?", "4544", "72", "104");
            }
        });

        btn_steak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultMake("Steak Pizza (36cm)", "2850", "127.31", "315", "6880", "296.44", "128.71");
            }
        });

        ImageButton pizz_to_conv = (ImageButton)findViewById(R.id.pizz_to_conv);
        ImageButton pizz_to_bmi = (ImageButton)findViewById(R.id.pizz_to_bmi);
        ImageButton pizz_to_main = (ImageButton)findViewById(R.id.pizz_to_main);
        ImageButton pizz_to_wc = (ImageButton)findViewById(R.id.pizz_to_wc);
        ImageButton pizz_to_fam = (ImageButton)findViewById(R.id.pizz_to_fam);

        pizz_to_bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pizza_Nutri.this, BMI_Calculator.class);
                startActivity(intent);
            }
        });

        pizz_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pizza_Nutri.this, ActualMain.class);
                startActivity(intent);
            }
        });

        pizz_to_wc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pizza_Nutri.this, Weight_Converter.class);
                startActivity(intent);
            }
        });

        pizz_to_conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pizza_Nutri.this, Calorie_Calculator.class);
                startActivity(intent);
            }
        });

        pizz_to_fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pizza_Nutri.this, Famous_Food_Calories.class);
                startActivity(intent);
            }
        });
    }

    public void resultMake(String menu, String cal, String fat, String chol, String sodi, String carb, String prot) {
        pizza_result_menu.setText("MENU: " + menu);
        pizza_result_calorie.setText("Total Calorie: " + cal + " (kcal)");
        pizza_result_fat.setText("Fat: " + fat + " (g)");
        pizza_result_chol.setText("Cholesterol: " + chol + " (mg)");
        pizza_result_sodium.setText("Sodium: " + sodi + " (mg)");
        pizza_result_carb.setText("Carbohydrates: " + carb + " (g)");
        pizza_result_protein.setText("Protein: " + prot + " (g)");
    }
}