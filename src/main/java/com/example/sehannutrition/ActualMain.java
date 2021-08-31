package com.example.sehannutrition;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ActualMain extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private View drawerView;

    private ImageButton main_to_cal;
    private ImageButton main_to_bmi;
    private ImageButton main_to_conv;
    private ImageButton main_to_fam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actual_main);

        main_to_cal = findViewById(R.id.main_to_cal);
        main_to_bmi = findViewById(R.id.main_to_bmi);
        main_to_conv = findViewById(R.id.main_to_conv);
        main_to_fam = findViewById(R.id.main_to_fam);

        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        drawerView = (View)findViewById(R.id.drawer);


        Button drawer_to_cal = (Button)findViewById(R.id.drawer_to_cal);
        Button drawer_to_bmi = (Button)findViewById(R.id.drawer_to_bmi);
        Button drawer_to_convert = (Button)findViewById(R.id.drawer_to_convert);
        Button drawer_to_fam = (Button)findViewById(R.id.drawer_to_fam);
        Button drawer_to_credit = (Button)findViewById(R.id.drawer_to_credit);
        Button btn_win = (Button)findViewById(R.id.btn_win);

        drawer_to_credit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActualMain.this, Credit.class);
                startActivity(intent);
            }
        });

        main_to_fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActualMain.this, Famous_Food_Calories.class);
                startActivity(intent);
            }
        });

        drawer_to_fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActualMain.this, Famous_Food_Calories.class);
                startActivity(intent);
            }
        });

        main_to_conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActualMain.this, Weight_Converter.class);
                startActivity(intent);
            }
        });

        drawer_to_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActualMain.this, Weight_Converter.class);
                startActivity(intent);
            }
        });

        main_to_bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActualMain.this, BMI_Calculator.class);
                startActivity(intent);
            }
        });

        drawer_to_bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActualMain.this, BMI_Calculator.class);
                startActivity(intent);
            }
        });

        main_to_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActualMain.this, Calorie_Calculator.class);
                startActivity(intent);
            }
        });

        drawer_to_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActualMain.this, Calorie_Calculator.class);
                startActivity(intent);
            }
        });

        btn_win.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActualMain.this, Explain_1.class);
                startActivity(intent);
            }
        });

        ImageButton btn_open = (ImageButton)findViewById(R.id.btn_open);
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(drawerView);
            }
        });

        Button go_to_main = (Button)findViewById(R.id.go_to_main);
        go_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.closeDrawers();
            }
        });

        drawerLayout.setDrawerListener(listener);
        drawerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
    }

    DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener() {
        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

        }

        @Override
        public void onDrawerOpened(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerClosed(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerStateChanged(int newState) {

        }
    };
}