package com.example.faisal.healthcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HealthActivity extends AppCompatActivity {

    private EditText ft,inch;
    private TextView result;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        ft=findViewById(R.id.ft);
        inch=findViewById(R.id.inch);
        result=findViewById(R.id.result);
        btn=findViewById(R.id.calc);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ftStr = ft.getText().toString();
                String inchStr = inch.getText().toString();

                if (ftStr != null && !"".equals(ftStr)
                        && inchStr != null && !"".equals(inchStr)) {
                    double ftValue = Double.parseDouble(ftStr);
                    double inchValue = Double.parseDouble(inchStr);
                    double baseValue = 56.2,temp,res;

                    temp=(ftValue*12)+inchValue;

                    if(temp<=60.00){
                        displayRES(baseValue);
                    }
                    else{
                        res=(temp-60.00)*1.41;
                        baseValue=baseValue+res;
                        displayRES(baseValue);
                    }

                }
            }});

    }

    private void displayRES(double baseValue) {
        String setValue="";

        setValue="Ideal weight is "+baseValue+" KG"+"\n";
        result.setText(setValue);
    }


}
