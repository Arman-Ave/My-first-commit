package com.example.a2701;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        TextView text = findViewById(R.id.textAllResults);

        String results =
                "Задание 1\nS = " + MainActivity1.result1 +
                        "\n\nЗадание 2\nD = " + MainActivity2.D +
                        "\nL = " + MainActivity2.L +
                        "\n\nЗадание 3\nx = " + MainActivity3.X;

        text.setText(results);
    }
}