package com.example.a2801;

import android.os.Bundle;
import android.view.*;
import android.widget.*;

import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment2, container, false);

        EditText editS = view.findViewById(R.id.editS);
        Button btn = view.findViewById(R.id.btnCalc2);
        TextView result = view.findViewById(R.id.result2);

        btn.setOnClickListener(v -> {

            double S = Double.parseDouble(editS.getText().toString());
            double pi = 3.14;

            double D = Math.sqrt((4 * S) / pi);
            double L = pi * D;

            result.setText("D = " + D + "\nL = " + L);
        });

        return view;
    }
}