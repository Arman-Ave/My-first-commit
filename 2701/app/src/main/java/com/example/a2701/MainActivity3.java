package com.example.a2701;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    public static double X;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        EditText editA = findViewById(R.id.editA);
        EditText editB = findViewById(R.id.editB);
        TextView textResult = findViewById(R.id.textResult3);

        Button btnCalc = findViewById(R.id.btnCalc3);
        Button btnNext = findViewById(R.id.btnNext3);

        btnCalc.setOnClickListener(v -> {
            double A = Double.parseDouble(editA.getText().toString());
            double B = Double.parseDouble(editB.getText().toString());

            X = -B / A;

            textResult.setText("x = " + X);
        });

        btnNext.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity3.this, MainActivity4.class));
        });
    }
}