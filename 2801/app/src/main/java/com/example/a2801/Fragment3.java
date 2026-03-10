package com.example.a2801;

import android.os.Bundle;
import android.view.*;
import android.widget.*;

import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment3, container, false);

        EditText editA = view.findViewById(R.id.editA);
        EditText editB = view.findViewById(R.id.editB);
        Button btn = view.findViewById(R.id.btnCalc3);
        TextView result = view.findViewById(R.id.result3);

        btn.setOnClickListener(v -> {

            double A = Double.parseDouble(editA.getText().toString());
            double B = Double.parseDouble(editB.getText().toString());

            double x = -B / A;

            result.setText("x = " + x);
        });

        return view;
    }
}