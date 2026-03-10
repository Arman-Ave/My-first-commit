package com.example.a2801;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btnF1);
        btn2 = findViewById(R.id.btnF2);
        btn3 = findViewById(R.id.btnF3);

        btn1.setOnClickListener(v -> openFragment(new Fragment1()));
        btn2.setOnClickListener(v -> openFragment(new Fragment2()));
        btn3.setOnClickListener(v -> openFragment(new Fragment3()));
    }

    private void openFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .commit();
    }
}