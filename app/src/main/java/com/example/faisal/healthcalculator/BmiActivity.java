package com.example.faisal.healthcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiActivity extends AppCompatActivity{

    private EditText height,height2,weight;
    private TextView result;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        height=findViewById(R.id.height);
        height2=findViewById(R.id.height2);
        weight=findViewById(R.id.weight);
        result=findViewById(R.id.result);
        btn=findViewById(R.id.calc);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String heightStr = height.getText().toString();
                String height2Str = height2.getText().toString();
                String weightStr = weight.getText().toString();

                if (heightStr != null && !"".equals(heightStr)&&height2Str != null && !"".equals(height2Str)
                        && weightStr != null  &&  !"".equals(weightStr)) {
                    float heightValue = (float) (Float.parseFloat(heightStr) *12*0.0254);
                    float height2Value = (float) (Float.parseFloat(height2Str)*0.0254)+heightValue;
                    float weightValue = Float.parseFloat(weightStr);

                    float bmi = weightValue / (height2Value * height2Value);

                    displayBMI(bmi);

            }
        }

            private void displayBMI(float bmi) {
                String bmiLabel = "";

                if (Float.compare(bmi, 15f) <= 0) {
                    bmiLabel = "very severely underweight";
                } else if (Float.compare(bmi, 15f) > 0  &&  Float.compare(bmi, 16f) <= 0) {
                    bmiLabel = "severely underweight";
                } else if (Float.compare(bmi, 16f) > 0  &&  Float.compare(bmi, 18.5f) <= 0) {
                    bmiLabel = "underweight";
                } else if (Float.compare(bmi, 18.5f) > 0  &&  Float.compare(bmi, 25f) <= 0) {
                    bmiLabel = "normal";
                } else if (Float.compare(bmi, 25f) > 0  &&  Float.compare(bmi, 30f) <= 0) {
                    bmiLabel = "overweight";
                } else if (Float.compare(bmi, 30f) > 0  &&  Float.compare(bmi, 35f) <= 0) {
                    bmiLabel = "obese class i";
                } else if (Float.compare(bmi, 35f) > 0  &&  Float.compare(bmi, 40f) <= 0) {
                    bmiLabel = "obese class ii";
                } else {
                    bmiLabel = "obese class iii";
                }

                bmiLabel = bmi + "\n\n" + bmiLabel;
                result.setText(bmiLabel);

            }
            });


    }





}


