package com.example.faisal.healthcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView bmi,health,calorie,about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bmi=findViewById(R.id.bmicard);
        health=findViewById(R.id.healthcard);
        calorie=findViewById(R.id.caloriecard);
        about=findViewById(R.id.aboutcard);

        bmi.setOnClickListener(this);
        health.setOnClickListener(this);
        calorie.setOnClickListener(this);
        about.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bmicard){
            Intent i1=new Intent(MainActivity.this,BmiActivity.class);
            startActivity(i1);
        }
        else if(v.getId()==R.id.healthcard)
        {
            Intent i1=new Intent(MainActivity.this,HealthActivity.class);
            startActivity(i1);
        }
        else if(v.getId()==R.id.caloriecard)
        {
            Intent i1=new Intent(MainActivity.this,CalorieActivity.class);
            startActivity(i1);
        }
        else if(v.getId()==R.id.aboutcard)
        {
            Intent i1=new Intent(MainActivity.this,AboutActivity.class);
            startActivity(i1);
        }

    }
}
