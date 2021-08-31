package com.example.sehannutrition;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Calorie_Calculator extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private View drawerVieww;

    private ImageButton cc_to_bmi;
    private ImageButton cc_to_main;
    private ImageButton cc_to_conv;
    private ImageButton cc_to_fam;

    private TextView food_saved;
    private TextView ingredient_saved;
    private EditText edit_food;
    private EditText edit_ingredient;
    private EditText edit_servingsize;
    private EditText edit_calorie;
    private EditText edit_ate;
    private EditText edit_fat;
    private EditText edit_cholesterol;
    private EditText edit_sodium;
    private EditText edit_carb;
    private EditText edit_protein;

    private Button save_food_name;
    private Button ingredient_add;
    private Button calorie_calculate;

    private String food_name;
    private String food_ingredeints = "";
    private double food_total_cal;
    private double food_fat;
    private double food_cholesterol;
    private double food_sodium;
    private double food_carb;
    private double food_protein;
    private  double totaltimes;

    private String result1;
    private String result2;
    private String result3;
    private String result4;
    private String result5;
    private String result6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie__calculator);

        cc_to_bmi = findViewById(R.id.cc_to_bmi);
        cc_to_main = findViewById(R.id.cc_to_main);
        cc_to_conv = findViewById(R.id.cc_to_conv);
        cc_to_fam = findViewById(R.id.cc_to_fam);

        drawerLayout = (DrawerLayout)findViewById(R.id.calcul_drawer);
        drawerVieww = (View)findViewById(R.id.calcul_way);

        food_saved = findViewById(R.id.food_saved);
        edit_food = findViewById(R.id.edit_food);

        edit_ingredient = findViewById(R.id.edit_ingredient);
        edit_servingsize = findViewById(R.id.edit_servingsize);
        edit_calorie = findViewById(R.id.edit_calorie);
        edit_ate = findViewById(R.id.edit_ate);
        edit_fat = findViewById(R.id.edit_fat);
        edit_cholesterol = findViewById(R.id.edit_cholesterol);
        edit_sodium = findViewById(R.id.edit_sodium);
        edit_carb = findViewById(R.id.edit_carb);
        edit_protein = findViewById(R.id.edit_protein);

        ingredient_saved = findViewById(R.id.ingredient_saved);
        save_food_name = findViewById(R.id.save_food_name);
        ingredient_add = findViewById(R.id.ingredient_add);
        calorie_calculate = findViewById(R.id.calorie_calculate);

        ingredient_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totaltimes = getTotal();
                food_ingredeints += edit_ingredient.getText().toString();
                food_ingredeints += ", ";
                food_total_cal += totaltimes * (Double.parseDouble(edit_calorie.getText().toString()));
                food_fat += totaltimes * (Double.parseDouble(edit_fat.getText().toString()));
                food_cholesterol += totaltimes * (Double.parseDouble(edit_cholesterol.getText().toString()));
                food_sodium += totaltimes * (Double.parseDouble(edit_sodium.getText().toString()));
                food_carb += totaltimes * (Double.parseDouble(edit_carb.getText().toString()));
                food_protein += totaltimes * (Double.parseDouble(edit_protein.getText().toString()));
                ingredient_saved.setText(edit_ingredient.getText().toString() + " have been saved.");
            }
        });

        save_food_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                food_name = edit_food.getText().toString();
                food_saved.setText("Dish/Food Name has been saved");
            }
        });

        calorie_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = String.valueOf(food_total_cal);
                result2 = String.valueOf(food_fat);
                result3 = String.valueOf(food_cholesterol);
                result4 = String.valueOf(food_sodium);
                result5 = String.valueOf(food_carb);
                result6 = String.valueOf(food_protein);

                Intent intent = new Intent(Calorie_Calculator.this, Calorie_Calculator_Result.class);
                intent.putExtra("food_name", food_name);
                intent.putExtra("food_ingr", food_ingredeints);
                intent.putExtra("food_totalcal", result1);
                intent.putExtra("food_fat", result2);
                intent.putExtra("food_chol", result3);
                intent.putExtra("food_sod", result4);
                intent.putExtra("food_carb", result5);
                intent.putExtra("food_prot", result6);
                startActivity(intent);
            }
        });

        cc_to_fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calorie_Calculator.this, Famous_Food_Calories.class);
                startActivity(intent);
            }
        });

        Button cdrawer_go_fam = (Button)findViewById(R.id.cdrawer_go_fam);
        cdrawer_go_fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calorie_Calculator.this, Famous_Food_Calories.class);
                startActivity(intent);
            }
        });

        cc_to_conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calorie_Calculator.this, Weight_Converter.class);
                startActivity(intent);
            }
        });

        cc_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calorie_Calculator.this, ActualMain.class);
                startActivity(intent);
            }
        });

        cc_to_bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calorie_Calculator.this, BMI_Calculator.class);
                startActivity(intent);
            }
        });

        Button btn_htu = (Button)findViewById(R.id.btn_htu);
        btn_htu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(drawerVieww);
            }
        });

        Button cdrawer_go_convert = (Button)findViewById(R.id.cdrawer_go_convert);
        cdrawer_go_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calorie_Calculator.this, Weight_Converter.class);
                startActivity(intent);
            }
        });

        Button cdrawer_go_bmi = (Button)findViewById(R.id.cdrawer_go_bmi);
        cdrawer_go_bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calorie_Calculator.this, BMI_Calculator.class);
                startActivity(intent);
            }
        });

        drawerLayout = (DrawerLayout)findViewById(R.id.calcul_drawer);
        drawerVieww = (View)findViewById(R.id.calcul_way);
    }

    public double getTotal(){
        double result1 = Double.parseDouble(edit_ate.getText().toString());
        double result2 =  Double.parseDouble(edit_servingsize.getText().toString());
        double result = result1/result2;
        return(result);
    }
}