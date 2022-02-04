package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText USD_amount;
    EditText LBP_amount;
    float amount;
    float finalValue;
    String USDV;
    String LBPV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image = (ImageView) findViewById(R.id.img1);
        USD_amount = findViewById(R.id.USD);
        LBP_amount = findViewById(R.id.LBP);


    }
    public void ConvertUSD(View v){

            USDV = USD_amount.getText().toString();
            if(USDV.isEmpty()){
                Toast.makeText(getApplicationContext(), "Please enter a Value to convert", Toast.LENGTH_SHORT).show();
            }else {
                finalValue = Float.parseFloat(USDV);
                amount = finalValue * 22000;
                USDV = Float.toString(amount);
                Toast.makeText(getApplicationContext(), USDV, Toast.LENGTH_SHORT).show();
            }



    }
    public void ConvertLBP(View v){
        LBPV = LBP_amount.getText().toString();
        if(LBPV.isEmpty()){
            Toast.makeText(getApplicationContext(), "Please enter a Value to convert", Toast.LENGTH_SHORT).show();
        }else {
            finalValue = Float.parseFloat(LBPV);
            amount = finalValue / 22000;
            LBPV = Float.toString(amount);
            Toast.makeText(getApplicationContext(), LBPV, Toast.LENGTH_SHORT).show();
        }
    }
}