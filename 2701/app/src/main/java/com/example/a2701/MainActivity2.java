package com.example.a2701;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    public static double D;
    public static double L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText editS = findViewById(R.id.editS);
        TextView textResult = findViewById(R.id.textResult2);
        Button btnCalc = findViewById(R.id.btnCalc2);
        Button btnNext = findViewById(R.id.btnNext2);

        btnCalc.setOnClickListener(v -> {
            double S = Double.parseDouble(editS.getText().toString());
            double pi = 3.14;

            D = Math.sqrt((4 * S) / pi);
            L = pi * D;

            textResult.setText("D = " + D + "\nL = " + L);
        });

        btnNext.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity2.this, MainActivity3.class));
        });
    }
}