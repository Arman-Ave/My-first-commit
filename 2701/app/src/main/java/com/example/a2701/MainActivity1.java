package com.example.a2701;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    public static double result1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        EditText editA = findViewById(R.id.editA);
        TextView textResult = findViewById(R.id.textResult);
        Button btnCalc = findViewById(R.id.btnCalc);
        Button btnNext = findViewById(R.id.btnNext);

        btnCalc.setOnClickListener(v -> {
            double a = Double.parseDouble(editA.getText().toString());
            result1 = a * a;
            textResult.setText("S = " + result1);
        });

        btnNext.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity1.this, MainActivity2.class));
        });
    }
}